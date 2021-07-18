import java.util.*;
public class Priyankaandtoys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		ArrayList<Integer>list=new ArrayList<>();
		for(int i=0;i<num;i++)
		{
			int val=sc.nextInt();
			list.add(val);
		}
		int num_count=Integer.MIN_VALUE;
		Collections.sort(list);
		int index=0;
		int counter=0;
		while(index<=num-1)
		{
			int weight=list.get(index);
			while(index<=num-1 && list.get(index)<=weight+4)
				index++;
			
			counter++;
			System.out.println(weight+" "+index+" "+counter);
			
		}
	}

}
