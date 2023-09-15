package algorithm;

public class RankTest {

	public static void main(String[] args) {
		//순위 정하기
		//rank를 모두 1로 초기화함
		int[] score = {70,90,60,50,80};
		int[] rank = new int[5]; //0, 0 ,0 ,0 ,0  초기화 되서  0으로 채워짐 , String은 null로 채워짐 ---> 1,1,1,1,1 로만들어줌
		
		//중첩 for 사용
		for(int i = 0 ; i < score.length; i++) {
			int count =1;
			for(int j = 0; j < score.length; j++) {				
				if(score[i] <score[j]) {
					count++;
				}
			}
			rank[i] = count; //순위에 따라 저장
		}
		/*
		 *i=0 70<70 70<90 70<60 70<50 70<80 , count = 3 
		 *i=1 90<70 90<90 90<60 90<50 90<80 , count = 1
		 *i=2 60<70 60<90 60<60 60<50 60<80 , count = 4
		 *i=3 50<70 50<90 50<60 50<50 50<80 , count = 5
		 *i=4 80<70 80<90 80<60 80<50 80<80 , count = 2	
		 */ 
		
		//rank 출력
		for(int i =0 ; i < rank.length; i++) {
			System.out.print(rank[i] + " ");
		}

	}//main

}//class
