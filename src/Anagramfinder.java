import java.util.*;
public class Anagramfinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<q;i++)
		{
			HashMap<Character,Integer>map1=new HashMap<>();
			String variable=sc.nextLine();
			int len=variable.length()/2;
			String sub1=variable.substring(0,len);
			String sub2=variable.substring(len,variable.length());
			System.out.println(sub1+"  "+sub2);
			int count=0;
			if(sub1.length()!=sub2.length())
			{
				System.out.println(-1);
				continue;
			}
			else {
			for(int j=0;j<sub1.length();j++) {
			
				char temp=sub1.charAt(j);
				if(!map1.containsKey(temp)) {
					map1.put(temp,1);
				}
				else {
					map1.put(temp,map1.get(temp)+1);
				}
					
			}
			int counter=0;
			for(int j=0;j<sub2.length();j++)
			{
				char temp1=sub2.charAt(j);
				if(map1.containsKey(temp1))
				{
					if(map1.get(temp1)>0)
					{
						map1.put(temp1, map1.get(temp1)-1);
					}
					else {
						counter++;
					}
				}
				else {
					counter++;
				}
			}
			System.out.println(counter);
		}
		

	}

}}

