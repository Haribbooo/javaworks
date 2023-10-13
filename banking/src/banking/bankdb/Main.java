package banking.bankdb;

import java.util.Scanner;

import banking.domain.AccountDAO;

public class Main {

	public static void main(String[] args) {
		 //AccountDAO 객체 생성- 메서드 사용 가능
		 AccountDAO dao = new AccountDAO();
		 boolean sw = true;
		 Scanner scanner = new Scanner(System.in);
		
		while(sw) {
			try {
				System.out.println("=====================================================================");
				System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.계좌삭제	|6. 계좌 검색 | 7. 종료" );
				System.out.println("======================================================================");
				System.out.println("선택 : ");
				
				//메뉴선택
				int selectNo = Integer.parseInt(scanner.nextLine());
				//int selectNo = scanner.nextInt(); 이거는 확확 넘어가서 사용하기 힘듬
				
				if(selectNo ==1) {
					dao.creatAccount();     //계좌 생성
				}else if(selectNo ==2) {
					dao.getAccountList();   // 계좌 목록
				}else if(selectNo ==3) {
					dao.deposit();	// 예금
				}else if(selectNo ==4) {
					dao.withdraw(); 	// 출금
				}else if(selectNo ==5) {
					dao.removeAccount();	//계좌삭제
				}else if(selectNo ==6) {
					dao.selectAccount();	//계좌삭제
				}else if(selectNo ==7) {
					sw =false;		//종료
				}else{
					System.out.println("지원되지 않는 기능!, 다시입력해 ㅋㅋ");
				}
				}catch(NumberFormatException e){
					//e.printStackTrace();
					System.out.println("올바른 숫자를 선택해주세요");					
				}
		} //while 
		System.out.println("프로그램 종료");
		scanner.close();
	}

}
