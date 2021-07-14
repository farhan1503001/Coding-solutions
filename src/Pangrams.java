import java.util.*;
public class Pangrams {

	public static HashMap<Character,Boolean>dictionary=new HashMap<Character,Boolean>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String value=sc.nextLine();
		value=value.toLowerCase().replaceAll(" ","");
		System.out.println(value);
		for(int i=0;i<value.length();i++)
		{
			dictionary.put(value.charAt(i),true);
		}
		//System.out.println(dictionary.size());
		/*
		for(char it:dictionary.keySet())
		{
			System.out.print(it+" ");
		}
		*/
		boolean flag=true;
		for(char a='a';a<='z';a++)
		{
			if(dictionary.containsKey(a)==false)
			{
				flag=false;
				break;
				
			}
		}
		if(flag)
		{
			System.out.println("pangram");
		}
		else {
			System.out.println("not pangram");
		}
		
		/*
		if(dictionary.size()<26)
		{
			System.out.println("not pangram");
		}
		else {
			System.out.println("pangram");
		}
		*/
		
	}

}
