import java.util.*;
public class Sherlockandthebeast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int n=0;
		if(sc.hasNextInt()) {
		n=sc.nextInt();
		}
		StringBuilder string1=new StringBuilder("");
		if(n<=1)
		{
			System.out.println("-1");
			t=t-1;
			continue;
		}
		else {
			int div_5=n-(n%3);
			int div_3=n-div_5;
			while(true)
			{
				if(div_5%3==0 && div_3%5==0)
				{
					break;
				}
				div_5=div_5-3;
				div_3=n-div_5;
			}
			for(int j=0;j<div_5;j++)
			{
				string1.append("5");
			}
			for(int j=0;j<div_3;j++)
			{
				string1.append("3");
			}
		}
	System.out.println(string1);
	t=t-1;;
	}
	}
	}

