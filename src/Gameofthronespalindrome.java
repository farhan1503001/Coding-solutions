import java.util.*;
public class Gameofthronespalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		HashMap<Character,Integer>map=new HashMap<>();
		for(int i=0;i<word.length();i++)
		{
			char temp=word.charAt(i);
			if(map.containsKey(temp))
			{
				map.put(temp,map.get(temp)+1);
			}
			else {
				map.put(temp,1);
			}
		}
		
		int odd_counter=0;
		int even_counter=0;
		for(char key:map.keySet())
		{
			if(map.get(key)%2==0)
			{
				even_counter++;
			}
			else {
				odd_counter++;
			}
				
		}
		if(word.length()%2==0)
		{
			if(odd_counter==0)
			{
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		else {
			if(odd_counter==1)
			{
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}

}
