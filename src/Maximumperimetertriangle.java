import java.util.*;
public class Maximumperimetertriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Integer[] arr=new Integer[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int perimeter=Integer.MIN_VALUE;
		int r=0,m=0,l=0;
		boolean flag=false;
		for(int i=2;i<n;i++)
		{
			if(arr[i]<arr[i-1]+arr[i-2] && perimeter<(arr[i]+arr[i-1]+arr[i-2]))
			{
				perimeter=arr[i]+arr[i-1]+arr[i-2];
				l=arr[i-2];
				m=arr[i-1];
				r=arr[i];
				flag=true;
			}
		}
		if(flag) {
		System.out.println(l+" "+m+" "+r);
		}
		else {
			System.out.println(-1);
		}
		/*
		for(int num:array)
		{
			System.out.println(num);
		}
        */
	}

}
