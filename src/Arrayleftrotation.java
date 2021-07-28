import java.util.*;
public class Arrayleftrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[(n-d+i)%n]=sc.nextInt();
		}
		for(int val:array) {
			System.out.print(val+" ");
		}
	}

}
