import java.util.*;
public class Rotatingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int i=0;i<d;i++)
		{
			int x=array[0];
			for(int j=0;j<n-1;j++)
			{
				array[j]=array[j+1];
			}
			array[n-1]=x;
			
		}
		
		for(int num:array)
		{
			System.out.print(num+" ");
		}
	}

}
