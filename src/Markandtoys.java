import java.util.*;
public class Markandtoys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long budget=sc.nextLong();
		ArrayList<Long>arr=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			long val=sc.nextLong();
			arr.add(val);
		}
		///sorting increasing order
		Collections.sort(arr);
		long sum=0;
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(sum>budget)
			{
				break;
			}
			else {
				sum=sum+arr.get(i);
				count++;
			}
		}
		System.out.println(count-1);
		/*
		for(long dis:arr)
		{
			System.out.println(dis);
		}
		*/
	}

}
