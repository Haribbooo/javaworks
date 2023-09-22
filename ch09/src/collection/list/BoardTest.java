package collection.list;

import java.util.List;
import java.util.Vector;

public class BoardTest {

	public static void main(String[] args) {
		//ArrayList or Vector를 사용 하는데 
		//어레이리스트를 속도가 빨라서 더 많이사용
		
		//List<Board> list = new ArrayList<>();
		//or
		List<Board>list = new Vector<>();
		
		//Board 객체 ( 게시글) 생성 
		Board board1 = new Board("제목1", "내용 1입니다.","글쓴이1");
		Board board2 = new Board("제목2", "내용 2입니다.","글쓴이2");
		Board board3 = new Board("제목3", "내용 3입니다.","글쓴이3");
		
		//Board 객체를 Vector 리스트에 저장
		list.add(board1); //0번
		list.add(board2); //1번 
		list.add(board3); //2번
		
		//개시물 1개 삭제 ( 1번 인덱스)(객체) 둘중 하나 선택 가능
		if(list.contains(board2)) {
			list.remove(board2);
		}
		
		//맨 앞에 객체 가져오기 ( 0번 인덱스 ) 
		System.out.println("제목" + list.get(0).getTitle());
		System.out.println("내용" + list.get(0).getContent());
		System.out.println("글쓴이" + list.get(0).getWirter());
		
		//전체 목록
		for(int i = 0 ; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getTitle() + ","+
					            board.getContent()+","+   
					            board.getWirter());
		}
	}

}
