import java.util.*;
public class Countingsort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		int arr[]=new int[100];
		ArrayList<Integer>list=new ArrayList<>();
		for(int i=0;i<range;i++)
		{
			int hold=sc.nextInt();
			list.add(hold);
			arr[hold]++;
		}
		/*
		for(int i=0;i<100;i++)
		{
			System.out.print(arr[i]+" ");
		}
		*/
		for(int i=0;i<100;i++)
		{
			for(int j=0;j<arr[i];j++)
			{
				System.out.print(i+" ");
			}
		}
	}

}
