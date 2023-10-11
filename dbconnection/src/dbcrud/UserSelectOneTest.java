package dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.User;

public class UserSelectOneTest {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null; //sql 처리하는 클래스
		//JDBC 드라이버 등록
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결하기 - url ,user, password
				 conn = DriverManager.getConnection(
								"jdbc:oracle:thin:@localhost:1521/xe"
								,"c##mydb"
								,"pwmydb");				 
				 System.out.println("연결성공");	
				 
				 //db처리 작업
				 //매개 변수화된 sql문 작성 -  동적 바인딩
				 String sql = "SELECT * FROM users WHERE userid =?";
				 pstmt = conn.prepareStatement(sql);
				 // ? 값 지정 
				 pstmt.setString(1,"today");
				 
				 
				 //sql 실행 - 검색
				 ResultSet rs = pstmt.executeQuery();
				 if(rs.next()) { //검색한 데이터가 있으면 
					 //db에서 userid ( 칼럼) 에서 데이터를 꺼내옴
					 User user = new User();
					 user.setUserId(rs.getString("userid"));
					 user.setUserName(rs.getString("username"));
					 user.setUserPassword(rs.getString("userpassword"));
					 user.setUserAge(rs.getInt("userage"));
					 user.setUserEmail(rs.getString("useremail"));
					 //System.out.println(user) 
					System.out.println("userId:" +user.getUserId()); 
					System.out.println("userName:" +user.getUserName()); 
					System.out.println("userPassword:" +user.getUserPassword()); 
					System.out.println("userAge:" + user.getUserAge()); 
					System.out.println("userEmail:" +user.getUserEmail());
					 
					/*String userId = rs.getString("userid");
					String userName = rs.getString("username");
					String userPassword = rs.getString("userpassword");
					int userAge = rs.getInt("userage");
					String userEmail = rs.getString("useremail");
					 
					System.out.println("userId:" +userId); 
					System.out.println("userName:" +userName); 
					System.out.println("userPassword:" +userPassword); 
					System.out.println("userAge:" + userAge); 
					System.out.println("userEmail:" +userEmail);*/
				 }else {
					 System.out.println("아이디가 존재하지 않습니다.");
				 }
				 rs.close();
				 pstmt.close();
			} catch (ClassNotFoundException e){			
				e.printStackTrace();
			}catch (SQLException e) {
				e.printStackTrace();
			}finally {
				if(conn != null) { //연결이 되어 있다면 
					try {
						conn.close();
						System.out.println("연결끊음");
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

		
	

