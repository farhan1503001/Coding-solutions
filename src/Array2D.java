import java.util.*;
public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[6][6];
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int max_hour_glass=Integer.MIN_VALUE;
		int index=0;
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<5;j++) {
			int sum=arr[i][j]+arr[i-1][j]+arr[i+1][j]+arr[i-1][j-1]+arr[i-1][j+1]+arr[i+1][j-1]+arr[i+1][j+1];
			if(max_hour_glass<sum) {
				max_hour_glass=sum;
				index=i;
			}
			}
		}
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(max_hour_glass);
		//System.out.println(index);
	}

}
