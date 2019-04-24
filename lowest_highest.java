import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for (int i=0;i<=n-1;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    int min=a[0];
	    for (int i=1;i<=n-1;i++)
	    {
	        if (a[i]<=min)
	        min=a[i];
	        else
	        continue;
	    }
	    System.out.print(min+" ");
	     int max=a[0];
	      for (int i=1;i<=n-1;i++)
	    {
	        if (a[i]>=max)
	        max=a[i];
	        else
	        continue;
	    }
        System.out.print(max);
	     
	     
	    }
	}

	    
	    
