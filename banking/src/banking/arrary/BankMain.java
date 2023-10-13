package banking.arrary;

import java.util.Scanner;

import banking.domain.Account;



public class BankMain {
	//계좌를 저장할 배열의 크기를 100개로 설정한다
	static Account[] accounts = new Account [100];
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean sw = true;
		
		while(sw) {
			System.out.println("===========================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("===========================================");
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
				sw =false;		//종료
			}else {
				System.out.println("지원되지 않는 기능!, 다시입력해 ㅋㅋ");
			}
		} //while 
		System.out.println("프로그램 종료");

	}//main 
	
	
	//계좌 생성
	
	 
	private static void creatAccount() {
		System.out.println("-----------------------------------");
		System.out.println("              계좌 생성");
		System.out.println("-----------------------------------");
	
		System.out.print("계좌 번호 : ");
		String ano = scanner.nextLine();

		System.out.print("계좌주 : ");
		String owner = scanner.nextLine();
		
		System.out.print("초기 입금액 : ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		//accounts[0] = new Account(ano,owner,balance); //연습 데이타 1개 생성..
		
		
		for(int i =0; i< accounts.length; i++) {
			if(accounts[i]==null) { //배열이 비어있을때 저장할수있도록 if문으로 처리 
				accounts[i] = new Account(ano,owner,balance);
				System.out.println("축하합니당~~ 계좌생성완료!");
				break;
		}
			else {
				if(findAccount(ano) != null) {
					System.out.println("중복");					
					break;
				}
			}			
		}
		
	}
	
	

	//계좌 목록
	private static void getAccountList() {
		System.out.println("-----------------------------------");
		System.out.println("               계좌 목록");
		System.out.println("-----------------------------------");
		
		for(int i = 0; i<accounts.length; i++) {
			if(accounts[i]!=null) { //계좌가 있는 배열의 요소 출력 !
				System.out.print("계좌 번호:" + accounts[i].getAno()+"\t");
				System.out.print(" 계좌주:" + accounts[i].getOwner()+"\t");
				System.out.println(" 잔고:" + accounts[i].getBalance()+"\t");
			}
		}		
	}		
	//입금 
	private static void deposit() {
		System.out.println("-----------------------------------");
		System.out.println("               입금액");
		System.out.println("-----------------------------------");
		
		System.out.print("계좌 번호 : ");
		String ano = scanner.nextLine();
		
		System.out.print(" 입금액 : ");
		int money = Integer.parseInt(scanner.nextLine());
		
		if(findAccount(ano) !=null) {
			Account account = findAccount(ano);
			account.setBalance(account.getBalance()+money);
			System.out.println("정상 처리되었습니다!");
		}else {
			System.out.println("계좌 없는디~");
		}
		
		
		Account account = findAccount(ano);
	}
	
		//출금
		private static void withdraw() {
			System.out.println("-----------------------------------");
			System.out.println("               출금액");
			System.out.println("-----------------------------------");
			
			System.out.print("계좌 번호 : ");			
			String ano = scanner.nextLine();
			
			System.out.print(" 출금액 : ");
			int money = Integer.parseInt(scanner.nextLine());
			
			if(findAccount(ano) !=null) {
				Account account = findAccount(ano);
				account.setBalance(account.getBalance()-money); //주석처리하면 잔고뜸;ㄹㅇ
				System.out.println("정상 처리되었습니다!");
				}else {
				System.out.println("계좌 없는디~");
			}
			
			Account account = findAccount(ano);
		}	
		
		//계좌 검색 
	
	 	private static Account findAccount(String ano) {
	 		Account account =null; // 찾을계좌를 저장할 객체 변수 일단 만들어!
	 		
	 		for(int i =0; i<accounts.length; i++) {
	 			if(accounts!=null) {
	 				String dbAno = accounts[i].getAno(); //이미 생성된 계좌번호를 가져옴!
	 				if(dbAno.equals(ano)) { // 이거 이미생성된 계좌랑 찾을 계좌 비교 찾는 계좌랑 일치하면
	 					account = accounts[i]; // 일치하는 계좌를 저장
	 					break;
	 				}
	 			}
	 		}
	 		
	 			 		
	 	
	 		return account;
	 	}
	}
	
	
	
	
	
	


