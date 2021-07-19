import java.util.*;
public class Alternatingchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		sc.nextLine();
		while(q>0)
		{
			String inp=sc.nextLine();
			int num_a=0;
			for(int i=0;i<inp.length()-1;i++)
			{
				if(inp.charAt(i)!=inp.charAt(i+1))
				{
					num_a+=1;
				}
			}
			System.out.println(inp.length()-num_a-1);
			q--;
		}
	}

}
