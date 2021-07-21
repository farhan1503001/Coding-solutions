import java.util.*;
public class Servicelane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num_widths=sc.nextInt();
		int test_cases=sc.nextInt();
		List<Integer>widths=new ArrayList<Integer>();
		for(int i=0;i<num_widths;i++)
		{
			widths.add(sc.nextInt());
		}
		while(test_cases>0)
		{
			int case1=sc.nextInt();
			int case2=sc.nextInt();
			int min_width=Integer.MAX_VALUE;
			for(int i=case1;i<=case2;i++)
			{
				if(widths.get(i)<min_width)
				{
					min_width=widths.get(i);
				}
			}
			System.out.println(min_width);
			
			test_cases--;
		}

	}

}
