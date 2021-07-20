import java.util.*;
public class ClosestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//sort then find the list with minimum array
		long n=sc.nextInt();
		ArrayList<Integer>store=new ArrayList<>();
		ArrayList<Integer>result=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			int val=sc.nextInt();
			store.add(val);
		}
		Collections.sort(store);
		//System.out.println(store.get(0));
		int min_diff=store.get(1)-store.get(0);
		result.add(store.get(0));
		result.add(store.get(1));
		for(int i=1;i<n-1;i++)
		{
			int c1=store.get(i+1);
			int c2=store.get(i);
			if((c1-c2)<min_diff)
			{
				result.clear();
				result.add(c2);
				result.add(c1);
				min_diff=Math.abs(c1-c2);
				
			}
			else if((c1-c2)==min_diff) {
				result.add(c2);
				result.add(c1);
				
			}
		}
		
		for(int num:result)
		{
			System.out.print(num+" ");
		}
	}

}
