
public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);
		int[] scores = {10,20,30};
		try {
			System.out.println(scores[4]); //여기서 이 줄이 실행되면 try구문에 아래는 실행되지 않는다.
			System.out.println(2/0);
		} catch(Exception e) {   //예외는 상속에따라 부모자식의 관계가 있다. 자식예외는 부모예외로 커버가 가능하다.
			System.out.println("뭔가 이상합니다. 오류가 발생했습니다.");
		}
		System.out.println(3);
	}
}
