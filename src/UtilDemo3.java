import java.util.*;
public class UtilDemo3 {

	public static void main(String[] args) {
		String s="hai = sarath;babu = this is;Don = is Back;see u = soon";
		StringTokenizer st=new StringTokenizer(s,"=;");
		System.out.println("the count of tokens:"+st.countTokens());
		System.out.println("print tokens");
		
		while(st.hasMoreTokens())
		{
			String k=st.nextToken();
			String v=st.nextToken();
			System.out.println(k+" = "+v);
		}

	}

}
