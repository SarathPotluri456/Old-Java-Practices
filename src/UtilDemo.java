import java.util.*;
public class UtilDemo {

	public static void main(String[] args) {
		String s="Welcome to programming on java";
	/*String s;
		System.out.println("The Input String is:");
		Scanner sc=new Scanner(System.in);
		s=sc.next();*/
		StringTokenizer st=new StringTokenizer(s);
		System.out.print("the String is:"+s);
		System.out.println("the number of token in that string is:"+st.countTokens());
		System.out.println("Printing tokens");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		}

}
