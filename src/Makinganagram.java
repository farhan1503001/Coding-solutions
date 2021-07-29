import java.util.*;
public class Makinganagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String first=sc.nextLine();
		String second=sc.nextLine();
		HashMap<Character,Integer>map=new HashMap<>();
		for(char c:first.toCharArray())
		{
			if(!map.containsKey(c))
			{
				map.put(c,1);
			}
			else {
				map.put(c,map.get(c)+1);
			}
		}
		for(char c:second.toCharArray())
		{
			if(map.containsKey(c)==false)
			{
				map.put(c,-1);
			}
			else {
				map.put(c,map.get(c)-1);
			}
		}
		int count=0;
		for(char key:map.keySet())
		{
			if(map.get(key)!=0)
			{
				count+=Math.abs(map.get(key));
			}
		}
		System.out.println(count);
	}

}
