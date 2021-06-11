import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {

	public static void main(String[] args) {
		FileWriter f = null;
		try {
		f = new FileWriter("data.txt");
		f.write("Hello");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
			finally {
				//���࿡ f�� null�� �ƴ϶�� close�ض�
				if(f != null) {
					try {
				f.close(); //try�ȿ��� exception�� �߻��߰� ���߰� finally�� ����ȴ�.
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
