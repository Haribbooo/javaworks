package kr.or.iei.run;

import kr.or.iei.model.User; //다른 클래스에 있기때문에 불러와야 함

public class UserTest2 {

	public static void main(String[] args) {
		// 매개변수가 있는 생성자로 user1을 만드는 인스턴스 설정
		
		/*
		//		이게 set
		User user1 = new User("Ho9", "123","으노");
		
		System.out.println("아이디:"+user1.getId());
		System.out.println("비밀번호:"+user1.getPw());
		System.out.println("아이디:"+user1.getName());*/
		
		//크기가 3인 배열 생성
		User[] users =new User[3];
		
		//user 3명 객체 생성 그리고 위의 users 에 넣어야함
		User user1 = new User("Ho9", "123","으노");
		User user2 = new User("hyosung", "1223","효성");
		User user3 = new User("unono", "6546","은호");
		
		//배열의 객체를 저장 
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		
		//users[0]	출력
		System.out.println(users[0].getId()+","
				+users[0].getPw()+","
				+users[0].getName());
		System.out.println("==========================================");
		
		//전체출력
		for(int i =0; i<users.length;i++) {
			System.out.println(users[i].getId()+","
					+users[i].getPw()+","
					+users[i].getName());
		}
	}

}
