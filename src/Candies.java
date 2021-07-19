import java.util.*;
public class Candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long arr[]=new long[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		//Arrays.sort(arr);
		/*
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
		*/
		long candies[]=new long[n];
		for(int i=0;i<n;i++)
		{
			candies[i]=1;
		}
		for(int i=0;i<n-1;i++)
		{
			if(arr[i+1]>arr[i])
			{
				candies[i+1]=candies[i]+1;
			}
		}
		for(int j=n-1;j>0;j--)
		{
			if(arr[j-1]>arr[j] && candies[j-1]<=candies[j])
			{
				candies[j-1]=candies[j]+1;
			}
		}
		//System.out.println();
		long sum=0;
		for(long num:candies)
		{
			//System.out.print(num+" ");
			sum+=num;
		}
		
		System.out.println(sum);
	}

}
