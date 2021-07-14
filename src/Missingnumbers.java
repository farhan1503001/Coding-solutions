import java.util.*;
public class Missingnumbers {
   
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var n=sc.nextInt();
		int[] arr=new int[n];
		HashMap<Integer,Integer>map1=new HashMap<Integer,Integer>();
		ArrayList<Integer>holder=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(map1.containsKey(arr[i])==false)
			{
				map1.put(arr[i],1);
			}
			else {
				map1.put(arr[i],map1.get(arr[i])+1);
			}
		}
		var m=sc.nextInt();
		int[] brr=new int[m];
		for(int i=0;i<m;i++)
		{
			brr[i]=sc.nextInt();
			if(map1.containsKey(brr[i]))
			{
				map1.put(brr[i],map1.get(brr[i])-1);
			}
			else {
				map1.put(brr[i],-1);
			}
			
		}
		for(int key:map1.keySet())
		{
			if(map1.get(key)<0)
			{
				holder.add(key);
			}
		}
		Collections.sort(holder);
		for(int value:holder)
		{
			System.out.print(value+" ");
		}
		
	}

}
