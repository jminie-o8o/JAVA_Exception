
public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);
		int[] scores = {10,20,30};
		try {
			System.out.println(scores[4]); //���⼭ �� ���� ����Ǹ� try������ �Ʒ��� ������� �ʴ´�.
			System.out.println(2/0);
		} catch(Exception e) {   //���ܴ� ��ӿ����� �θ��ڽ��� ���谡 �ִ�. �ڽĿ��ܴ� �θ𿹿ܷ� Ŀ���� �����ϴ�.
			System.out.println("���� �̻��մϴ�. ������ �߻��߽��ϴ�.");
		}
		System.out.println(3);
	}
}
