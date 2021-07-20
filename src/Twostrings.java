import java.util.*;
public class Twostrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		sc.nextLine();
		while(q>0) {
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		HashMap<Character,Boolean>map=new HashMap<>();
		for(int i=0;i<s1.length();i++) {
			map.put(s1.charAt(i),true);
		}
		boolean flag=false;
		for(int i=0;i<s2.length();i++)
		{
			if(map.containsKey(s2.charAt(i)))
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		q--;
		}
	}

}
