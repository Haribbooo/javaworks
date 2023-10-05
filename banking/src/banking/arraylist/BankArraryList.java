package banking.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import banking.arrary.Account;

public class BankArraryList {
	
	//통장 계좌를 저장할 자료 구조 객체 생성
	static List<Account> accountList  = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
boolean sw = true;
		
		while(sw) {
			try {
				System.out.println("======================================================");
				System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.계좌삭제	|6.종료" );
				System.out.println("=======================================================");
				System.out.println("선택 : ");
				
				//메뉴선택
				int selectNo = Integer.parseInt(scanner.nextLine());
				//int selectNo = scanner.nextInt(); 이거는 확확 넘어가서 사용하기 힘듬
				
				if(selectNo ==1) {
					creatAccount();     //계좌 생성
				}else if(selectNo ==2) {
					getAccountList();   // 계좌 목록
				}else if(selectNo ==3) {
					deposit();	// 예금
				}else if(selectNo ==4) {
					withdraw(); 	// 출금
				}else if(selectNo ==5) {
					//deleteAno();	//계좌삭제
				}else if(selectNo ==6) {
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
	}//main 끝

		//계좌 생성
		private static void creatAccount() {
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
						System.out.print("계좌주 : ");
						String owner = scanner.nextLine();
						
						System.out.print("초기 입금액 : ");
						int balance = Integer.parseInt(scanner.nextLine());
						
						//입력받은 내용을 매개변수로 계좌 생성함
						Account newAccount = new Account(ano, owner,balance); 
						accountList.add(newAccount); //리스트에 저장
						System.out.println("계좌생성완료!");
						break;
					}					
				}else {
					System.out.println("올바르지 않은 형식으로 입력하였습니다.다시입력해주세요");
				}
				
				
		}//while  끝
	}//creatAcoount 끝 
		
	private static void getAccountList() {
		System.out.println("-----------------------------------");
		System.out.println("               계좌 목록");
		System.out.println("-----------------------------------");
		
		//계좌목록 조회
		for(int i = 0; i < accountList.size(); i++) {
			Account account =(accountList.get(i) );
				System.out.println("계좌번호:" + account.getAno()+"\t");
				System.out.println("계좌주:" + account.getOwner()+"\t");
				System.out.println("잔고:" + account.getBalance()+"\t");
		}
	}//getAccountList 끝 
	
	private static void deposit() {
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
				
				
				account.setBalance(account.getBalance() + money);
				System.out.println("정상 처리되었습니다!");
				break;//while 문  빠져 나옴
			}else{				
				System.out.println("계좌가 존재하지 않습니다. 다시 입력해주세요");
			}			
		}
	}//deposit 끝
	
	private static void withdraw() {
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

	private static Account findAccount(String ano) {
		Account account = null;
		for(int i = 0 ; i <accountList.size();i++) {
			//이미 등록된 계좌를 가져와서 외부에서 입력한 계좌와 일치하는지 비교함
			//외부에서 입력한 계좌와 일치하는 지 비교함
			String dbAno = accountList.get(i).getAno();
			if(dbAno.equals(ano)) {
				account = accountList.get(i);
				break;
			}
			
		}	
		return account;
	}
	
		
}//class 끝
