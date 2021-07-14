import java.util.*;
public class Anagrammaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		HashMap<Character,Integer>dict=new HashMap<>();
		HashMap<Character,Integer>dict1=new HashMap<>();
		for(int i=0;i<str1.length();i++)
		{
			char temp=str1.charAt(i);
			if(dict.containsKey(temp))
			{
				dict.put(temp,dict.get(temp)+1);
			}
			else {
				dict.put(temp,1);
			}
		}
		for(int i=0;i<str2.length();i++)
		{
			char temp1=str2.charAt(i);
			if(dict1.containsKey(temp1))
			{
				dict1.put(temp1,dict1.get(temp1)+1);
			}
			else {
				dict1.put(temp1,1);
			}
		}
		int count=0;
		for(char a='a';a<='z';a++)
		{int value1=0,value2=0;
				if(dict.get(a)==null )
				{
				 value1=0;
					
				}
				else {
					value1=dict.get(a);
				}
				if(dict1.get(a)==null)
				{
					value2=0;
				}
				else {
					value2=dict1.get(a);
				}
				count+=Math.abs(value1-value2);
		
		}
		System.out.println(count);
	}

}
