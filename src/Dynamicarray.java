import java.util.*;
public class Dynamicarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		ArrayList<Integer>[] array=new ArrayList[n];
		for(int i=0;i<n;i++)
		{
			array[i]=new ArrayList<Integer>();
		}
		int last_answer=0;
		for(int i=0;i<q;i++)
		{
			int operation=sc.nextInt();
			int place=sc.nextInt();
			int value=sc.nextInt();
			int index;
			if(operation==1)
			{
				index=(last_answer^place)%n;
				//System.out.print("Index: "+index);
				array[index].add(value);
			}
			else if(operation==2) {
				index=(last_answer^place)%n;
				last_answer=array[index].get((value%array[index].size()));
				//System.out.print("Index: "+index);
				System.out.println(last_answer);
			}
		}

	}

}
