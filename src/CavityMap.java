import java.util.*;
public class CavityMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//logic is to just iterate not on the first or last row
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		char array[][]=new char[num][];
		for(int i=0;i<num;i++)
		{
			array[i]=sc.next().toCharArray();
		}
		for(int i=1;i<num-1;i++)
		{
			for(int j=1;j<num-1;j++)
			{
				if((array[i][j]>array[i-1][j])&& (array[i][j]>array[i+1][j])
					&&(array[i][j]>array[i][j-1])
					&&(array[i][j]>array[i][j+1])
				)
				{
					array[i][j]='X';
				}
			}
		}
		
		for(int i=0;i<num;i++)
		{
			System.out.println(array[i]);
		}

	}

}
