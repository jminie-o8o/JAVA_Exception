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
				//만약에 f가 null이 아니라면 close해라
				if(f != null) {
					try {
				f.close(); //try안에서 exception이 발생했건 안했건 finally는 실행된다.
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
