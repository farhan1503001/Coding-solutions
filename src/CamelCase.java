import java.util.ArrayList;
import java.util.Scanner;
public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		ArrayList<String>holder=new ArrayList<String>();
		var index=0;
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			Character val=s.charAt(i);
			if(Character.isUpperCase(val))
			{
				String newstring=s.substring(index,i);
				holder.add(newstring);
				count++;
				index=i;
			}
		}
		System.out.println(count);
		System.out.println("Resulting ");
		for(String c:holder) {
			System.out.println(c);
		}

	}

}
