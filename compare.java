
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    String str=sc.nextLine();
		int len1=s.length();
		int len2=str.length();
		if (len1>len2)
		{
		    System.out.println(s);
		}
		else if (len1<len2)
		{
		    System.out.print(str);
		}
		else
		System.out.print(s);
		
		
	}
}
