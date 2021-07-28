import java.util.*;
public class Sparse_arraysnotsparse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer>strings=new HashMap<String, Integer>();
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			String temp=sc.nextLine();
			if(!strings.containsKey(temp))
			{
				strings.put(temp,1);
			}
			else {
				strings.put(temp,strings.get(temp)+1);
			}
		}
		int q=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<q;i++)
		{
			String query=sc.nextLine();
			int counter=0;
			if(strings.get(query)==null)
			{
				counter=0;
			}
			else {
				counter=strings.get(query);
			}
			System.out.println(counter);
		}
		
	}

}
