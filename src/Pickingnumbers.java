import java.util.*;
public class Pickingnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
		for(int i=0;i<num;i++)
		{
			int value=sc.nextInt();
			if(!map.containsKey(value))
			{
				map.put(value,1);
			}
			else {
				map.put(value,map.get(value)+1);
			}
		}
		int maximum=0;
		for(int key:map.keySet())
		{
			int first=map.get(key);
			int second=0;
			if(map.containsKey(key-1))
			{
				second=map.get(key-1);
			}
			else {
				second=0;
			}
			//int second=map.get(key-1);
			int total=first+second;
			if(total>maximum)
			{
				maximum=total;
			}
			
		}
		System.out.println(maximum);
	}

}
