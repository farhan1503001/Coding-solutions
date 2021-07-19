import java.util.*;
public class Minabsolutediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		ArrayList<Long>arr=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			long val=sc.nextLong();
			arr.add(val);
		}
		Collections.sort(arr);
		long base_diff=Math.abs(arr.get(0)-arr.get(1));
		for(int i=1;i<n-1;i++)
		{
			long differ=Math.abs(arr.get(i)-arr.get(i+1));
			if(differ<base_diff)
			{
				base_diff=differ;
			}
		}
		System.out.println(base_diff);
		/*
		for(long num:arr)
		{
			System.out.println(num);
		}
		*/
	}

}
