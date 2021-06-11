import java.io.FileWriter;
import java.io.IOException;

//CheckedExceptionApp.java �� �Ȱ��� �ڵ�
public class CheckedExceptionAPP2 {

	public static void main(String[] args) {
		//try with resource statements
		try(FileWriter f = new FileWriter("data.txt")) {
			f.write("Hello");
		}
		catch(IOException e) {
			e.printStackTrace();
		}				
	}
}
