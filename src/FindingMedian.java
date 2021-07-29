import java.util.*;
public class FindingMedian{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		if(num%2==0)
		{
			int pos=num/2;
			System.out.println((int)(arr[pos]+arr[pos-1])/2);
		}
		else {
			int pos=num/2;
			System.out.println(arr[pos]);
		}
	}
}
