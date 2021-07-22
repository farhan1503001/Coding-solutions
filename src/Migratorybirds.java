import java.util.*;
public class Migratorybirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int dict[]=new int[6];
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			dict[sc.nextInt()]++;
		}
		int count=0;
		//int val=0;
		for(int i=0;i<6;i++)
		{
			System.out.println(dict[i]);
			if(dict[i]>dict[count])
			{
				count=i;
				
			}
		}
		System.out.println(count);
		
	}

}
