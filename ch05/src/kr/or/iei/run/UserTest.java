package kr.or.iei.run;

import kr.or.iei.model.User;

public class UserTest {

	public static void main(String[] args) {


		User user1 = new User();
		
		user1.setId("eunhoho95");
		user1.setPw("jingjing");
		user1.setName("은호초이");
		
		
		System.out.println("--------------");
		System.out.println("|  "+user1.getId()+" |");
		System.out.println("|  "+user1.getPw()+"  |");
		System.out.println("|  "+user1.getName()+"    |");
		System.out.println("--------------");
		//System.out.println(user1); 인스턴스 주소 확인
		
		
	}

}
