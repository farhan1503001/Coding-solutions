import java.util.HashMap;
import java.util.*;
public class Gemstones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Character>dictionary=new HashSet<>();
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    String[] store=new String[n];
	    sc.nextLine();
	    for(int i=0;i<n;i++)
	    {
	    	store[i]=sc.nextLine();
	    	//sc.nextLine();
	    	for(int len=0;len<store[i].length();len++)
	    	{
	    		char c=store[i].charAt(len);
	    		dictionary.add(c);
	    	}
	    }
	    int count=0;
	    for(char iter:dictionary)
	    {
	    	boolean flag=true;
	    	for(int i=0;i<n;i++)
	    	{
	    		if(!store[i].contains(Character.toString(iter)))
	    		{
	    			flag=false;
	    		}
	    	}
	    	if(flag)
	    	{
	    		count++;
	    	}
	    }
	    System.out.println(count);
	    
	}

}
