import java.util.*;
public class rightarrayrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[(i+k)%n]=sc.nextInt();
		}
		for(int val:array)
		{
			System.out.print(val+" ");
		}
	}

}
