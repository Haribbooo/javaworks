package banking.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import banking.common.JDBCutil;

//Account를 생성 , 조회 ,수정 ,삭제하는 클래스
//DAO - DATA Acess Object
public class AccountDAO {
	Connection conn;  //db 연결 객체 선언
	PreparedStatement pstmt; //sql 처리 객체
	ResultSet rs; //데이터 셋
	Scanner scanner = new Scanner(System.in);
	
	public  void creatAccount() {
		System.out.println("-----------------------------------");
		System.out.println("              계좌 생성");
		System.out.println("-----------------------------------");
		
		
		
					
		while(true) {
			System.out.print("계좌 번호 형식:##-##-### : ");
			String ano = scanner.nextLine();
			
			String regExp = "\\d{2}-\\d{2}-\\d{3}"; //정규 표현식 생성
			boolean result = Pattern.matches(regExp, ano);				
			if(result) {
				//중복계좌있는지 체크 해보기 
				if(findAccount(ano) != null) { //중복계좌가 있으면
					System.out.println("중복");
					
				}else { //중복계좌가 없으면
					while(true) {
						System.out.print("계좌주(한글 , 영어) : ");
						String owner = scanner.nextLine();
						
						regExp = "[a-zA-Z가-힣]+"; //영어,한글판
						result = Pattern.matches(regExp, owner);
						if(result) {
							System.out.print("초기 입금액 : ");
							int balance = Integer.parseInt(scanner.nextLine());
							
							//db 작업		
							try {
								conn  = JDBCutil.getConnection();
								String sql = "INSERT INTO account(ano,owner,balance) "
											+"VALUES(?,?,?)";
								pstmt = conn.prepareStatement(sql);
								//값 설정
								pstmt.setString(1, ano);
								pstmt.setString(2, owner);
								pstmt.setInt(3, balance);
								//sql 실행
								pstmt.executeUpdate();
								System.out.println("계좌가 생성되었습니다.");
								
							} catch (SQLException e) {
								e.printStackTrace();
							}finally {
							    JDBCutil.close(conn, pstmt);
							}
							break;
						}else {
							System.out.println("계좌주는 한글과 영어만 가능합니다. 다시입력해주세요");
						}							
					}// 내부 while	
				
				}					
			}else {
				System.out.println("올바르지 않은 형식으로 입력하였습니다.다시입력해주세요");
			}								
	}//while  끝
}//creatAcoount 끝 
	public  void getAccountList() {
		System.out.println("-----------------------------------");
		System.out.println("               계좌 목록");
		System.out.println("-----------------------------------");
		//계좌를 저장할 어레이리스트 생성
		
		List<Account> accountList = new ArrayList<>();
		//db 작업		
		try {
			conn = JDBCutil.getConnection();
			String sql = "SELECT * FROM account";
			pstmt = conn.prepareStatement(sql);
			//검색처리
			rs =pstmt.executeQuery();                                                                                 
			while(rs.next()) { // 다음 데이터가 있는 동안 반복
				//account 객체
				String ano = rs.getString("ano");//db에서 가져온 ano
				String owner = rs.getString("owner");//db에서 가져온 onwer
				int balance = rs.getInt("balance");//db에서 가져온 balance
				Account account = new Account(ano, owner, balance);
				
				accountList.add(account); //계좌를 리스트에 저장
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCutil.close(conn, pstmt,rs);
		}
		//계좌목록 조회
		for(int i = 0; i < accountList.size(); i++) {
			Account account =(accountList.get(i) );
				System.out.println("계좌번호:" + account.getAno()+"\t");
				System.out.println("계좌주:" + account.getOwner()+"\t");
				System.out.println("잔고:" + account.getBalance()+"\t");
		}
	}//getAccountList 끝 
	
	public void deposit() {
		System.out.println("-----------------------------------");
		System.out.println("               입금액");
		System.out.println("-----------------------------------");
	
		
		while(true) {
			System.out.print("계좌 번호 : ");
			String ano = scanner.nextLine();
			
		
			
			
			if(findAccount(ano) !=null) { // 찾는 계좌가 없으면 
				Account account = findAccount(ano);
				System.out.print(" 입금액 : ");
				int money = Integer.parseInt(scanner.nextLine());
				int balance =account.getBalance()+money;
				//db 처리
				try {
					conn = JDBCutil.getConnection();
					String sql = "UPDATE account SET balance = ? "				
							+ "  WHERE ano = ?";
					pstmt =conn.prepareStatement(sql);
					pstmt.setInt(1, balance);
					pstmt.setString(2, ano);		
					pstmt.executeUpdate();
					System.out.println("정상 처리되었습니다.");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.out.println("정상 처리되었습니다!");
				break;//while 문  빠져 나옴
			}else{				
				System.out.println("계좌가 존재하지 않습니다. 다시 입력해주세요");
			}			
		}
	}//deposit 끝
	
	public  void withdraw() {
		System.out.println("-----------------------------------");
		System.out.println("               출금액");
		System.out.println("-----------------------------------");
		
		while(true) {
			System.out.print(" 계좌 번호 : ");			
			String ano = scanner.nextLine();
			
			if(findAccount(ano) !=null) {
				while(true) {
					System.out.print("  출금액 : ");
					Account account = findAccount(ano);
					int money = Integer.parseInt(scanner.nextLine());
					int balance =account.getBalance()-money;
					
					try {
						conn = JDBCutil.getConnection();
						String sql = "UPDATE account SET balance = ? "				
								+ "  WHERE ano = ?";
						pstmt =conn.prepareStatement(sql);
						pstmt.setInt(1, balance);
						pstmt.setString(2, ano);		
						pstmt.executeUpdate();
						
					} catch (SQLException e) {
						e.printStackTrace();
					}
					System.out.println("정상 처리되었습니다!");
		
						
						if(money> account.getBalance()) {//출금액이 잔고보다많으면
							System.out.println("잔액이 부족합니다 다시 입력해주세용");						
						}else {
						account.setBalance(account.getBalance()-money);
						System.out.println("정상처리 완료");
						break;
						}
		         	}	
					break;
				}else {
					System.out.println("계좌 없습니다. 다시 입력");
				}
				break; //whlie 빠져나옴
				}//while 끝			
		
	}
	
	//계좌 삭제
	public void removeAccount() {
		
		System.out.println("======================================================");
		System.out.println("				계좌 삭제								  ");
		System.out.println("======================================================");
		
		while(true) {
			System.out.print("계좌 번호 : ");
			String ano = scanner.nextLine();
			
			
			if(findAccount(ano) !=null) { // 찾는 계좌가 없으면 
				//db 처리	
				try {
					conn = JDBCutil.getConnection();
					
					PreparedStatement pstmt = conn.prepareStatement("DELETE FROM account WHERE ano = ?");					
					pstmt.setString(1,ano);		
					pstmt.executeUpdate();
					
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.out.println("삭제 완료");
				break;
			}else{				
				System.out.println("계좌가 존재하지 않습니다. 다시 입력해주세요");
			}			
		}//whlie 끝
		
	}
	
	public void selectAccount() {
		
		while(true) {
			System.out.print("검색 계좌 번호 : ");
			String ano = scanner.nextLine();
			
			
			if(findAccount(ano) !=null) { // 찾는 계좌가 없으면 
				//db 처리
				
				break;
			}else{				
				System.out.println("계좌가 존재하지 않습니다. 다시 입력해주세요");
			}			
		}//whlie 끝
						
	}

	public Account findAccount(String ano) {
		Account account = null;
		//db처리	
		
		try {
			conn = JDBCutil.getConnection();
			String sql = "SELECT * FROM account WHERE ano = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			//1개 검색 처리
			rs = pstmt.executeQuery();
			if(rs.next()) {
				ano = rs.getString("ano");
				String owner = rs.getString("owner");//db에서 가져온 onwer
				int balance = rs.getInt("balance");//db에서 가져온 balance
				account = new Account(ano,owner,balance);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCutil.close(conn, pstmt, rs);
		}
		
		return account;
	}
}
