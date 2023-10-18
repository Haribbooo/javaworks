package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardExample2 {
	
	private Scanner sc =new Scanner(System.in);
	private Connection conn;
	private PreparedStatement pstmt;
	
	//db 연결 관련 변수s
	private String driverClass ="oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521/xe";
	private String user ="c##mydb";
	private String password ="pwmydb";
	
	public BoardExample2() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("db연결 성공! " + conn);
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	
	public void list() {
		System.out.println();
		System.out.println("[게시글 목록]");
		System.out.println("===================================================");
		System.out.printf("%-4s%-12s%-20s%-20s%-20s\n","no","writer","date","title","content");
		System.out.println("===================================================");
		
		//db- board 테이블의 모든 게시물 가져오기
		
		try {
			String sql = "SELECT bno ,btitle, bcontent,bwriter,bdate"
						+ " FROM board ORDER BY bno DESC";
			pstmt =conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {  //게시글이 있는 동안 반복(다음 행으로 이동)
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getNString("btitle"));
				board.setBwriter(rs.getNString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBcontent(rs.getString("bcontent"));
				
				
				//게시물 출력
				System.out.printf("%-4s%-12s%-12s%-20s%-20s\n"
						,board.getBno(),
						board.getBwriter(),
						board.getBdate(),
				        board.getBtitle(),
				        board.getBcontent()
				        );
			}//while 끝
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		mainMenu(); //mainMenu( ) 메서드를 호출
		
	}
	
	public void mainMenu() {
		System.out.println("====================================================");
		System.out.println("1.Create   |     2.Read |     3.Clear |     4.Exit  ");
		System.out.println("선택 : ");
		
		String menuNo = sc.nextLine();
		
		switch(menuNo) {
		case "1":
			create(); break;
		case "2":
			read(); break;
		case "3":
			clear(); break;
		case "4":
			exit(); break;
		}
	}

	


	public void create() {
		//System.out.println("create() 메서드 실행");
		Board board = new Board();
		System.out.println("[새 게시물 입력]");
		
		System.out.print("[제목]: ");
		String title = sc.nextLine();
		board.setBtitle(title);
		
		System.out.print("[내용]: ");
		String content = sc.nextLine();
		board.setBcontent(content);
		
		System.out.print("작성자: ");
		String writer= sc.nextLine();
		board.setBwriter(writer);
		
		// INSERT - db처리
	
		try {
			String sql ="INSERT INTO board(bno,btitle,bcontent,bwriter) "
					+ "VALUES (seq.NEXTVAL,?,?,?)";
			pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, board.getBtitle());
			pstmt.setString(2, board.getBcontent());
			pstmt.setString(3, board.getBwriter());
			//sql실행
			pstmt.executeUpdate();
			
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit(); //종료 메서드 호출
		}
		//목록 메서드 불러오기
		list();			
	}
	private void read() {	
		//System.out.println("read() 메서드 실행");
		System.out.println("[게시글 열기]");
		System.out.println("[글번호 입력]: ");
		int bno = Integer.parseInt(sc.nextLine());
		
		//db 작업 - select - where 절
		
		try {
			String sql = "SELECT * FROM board WHERE bno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			//쿼리 실행
			ResultSet rs = pstmt.executeQuery();
			//전체 가져올때는 while 이고 한개 or 있거나 없으면 if 로 가야된다.
			if(rs.next()){ //찾는 자료가 있으면
				Board board = new Board();
				//db 값을 가져와서 board 에 세팅
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getNString("btitle"));
				board.setBwriter(rs.getNString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBcontent(rs.getString("bcontent"));
				
				//콘솔에 출력
				System.out.println("==========================================");
				System.out.println("번호: " + board.getBno()); 
				System.out.println("제목: " + board.getBtitle()); 
				System.out.println("내용: " + board.getBcontent()); 
				System.out.println("작성자: " + board.getBwriter()); 
				System.out.println("작성일: " + board.getBdate()); 
				System.out.println("=========================================="); 
				
				//수정 삭제 메뉴 만들기
				System.out.println("1.수정 | 2.글 삭제 |3.글목록");
				System.out.println("선택: ");
				String menuNo = sc.nextLine();
				
				if(menuNo.equals("1")){
					update(board);
				}else if(menuNo.equals("2")) {
					delete(board);
				}

				
			}//if 끝
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		
		
		list();
	}
	

	public void update(Board board) { //이미 작성된 글(board) =  가져와서 수정
		System.out.println("[수정할 내용 입력]");
		
		System.out.print("[제목]: ");
		String title = sc.nextLine();
		board.setBtitle(title);
		
		System.out.print("[내용]: ");
		String content = sc.nextLine();
		board.setBcontent(content);
		
		System.out.print("작성자: ");
		String writer= sc.nextLine();
		board.setBwriter(writer);
		
		//db처리 작업- update
		
		try {
			String sql = "UPDATE board SET btitle=?, bcontent=? , bwriter=?"
				      + "WHERE bno =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getBtitle());  //콘솔에서 수정한 제용을 db에 저장함
			pstmt.setString(2, board.getBcontent());
			pstmt.setString(3, board.getBwriter());
			pstmt.setInt(4, board.getBno());
			
			//sql 실행
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		
	}

	private void delete(Board board) {
		
		//확인 취소 메뉴
		System.out.println("정말 삭제 하시겠어요?");
		System.out.println("1.OK | 2.Cancel");
		System.out.print("선택: ");
		
		String menuNo = sc.nextLine();
		if(menuNo.equals("1")) {
			//db 작업 - DELETE
			try {
				String sql = "DELETE FROM board WHERE bno=?";
				pstmt =conn.prepareStatement(sql);
				pstmt.setInt(1, board.getBno());
				//sql 실행
				pstmt.executeUpdate();
				
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				exit();
			}
		}
		
	}
	
	//테이블 유지하면서 전체 글을 삭제 - sql 에서 TRUNCATE TABLE board ;
	private void clear() {	
		//System.out.println("clear() 메서드 실행");
		System.out.println("[전체 게시글 삭제]");	
		System.out.println("==============================================");
		//확인 취소 메뉴
		System.out.println("정말 삭제 하시겠어요?");
		System.out.println("1.OK | 2.Cancel");
		System.out.print("선택: ");
		
		String menuNo = sc.nextLine();
		if(menuNo.equals("1")) {
			//db 작업 - truncate
			try {
				String sql = "TRUNCATE TABLE board";
				pstmt =conn.prepareStatement(sql);
				//sql 실행
				pstmt.executeUpdate();
				
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				exit();
			}
		}
		list();
	}
	private void exit() {	
		if(conn != null) {
			try {
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		 }
		System.out.println("*** 게시판 종료 ***");
		System.exit(0);
	}

	public static void main(String[] args) {
		BoardExample2 board1 =new BoardExample2();
		board1.list();
	}

}
