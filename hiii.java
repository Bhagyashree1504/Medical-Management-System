package medicalstoremanagement;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hiii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.print("enter email id");
		String q=sc.next();
		
		System.out.println(h(q));
		
	}

	public static boolean h(String in) {
		
		
		String em="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$]";
//		String em ="^[a-zA-Z0-9_!#$%&'+/=?`{|}^-]+(?:\\.+[a-zA-Z0-9_!#$%&'+/=?`{|}^-]+)@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)$";
//		Pattern empt= Pattern.compile(em);
		Pattern empt = Pattern.compile(em, Pattern.CASE_INSENSITIVE);
		Matcher mat=empt.matcher(in);
		
		return mat.find();
		
	}
}