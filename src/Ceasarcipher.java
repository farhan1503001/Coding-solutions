import java.util.*;

public class Ceasarcipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		sc.nextLine();
		String input= sc.nextLine();
		StringBuilder output=new StringBuilder("");
		int k=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			char c=input.charAt(i);
			if(Character.isAlphabetic(c))
			{
				if(Character.isUpperCase(c))
				{
					c=(char)((int)((c+k-65)%26)+65);
					//System.out.print(c+" ");
					output.append(c);
				}
				else {
					c=(char)((int)((c+k-97)%26)+97);
					//System.out.print(c+" ");
					output.append(c);
				}
			}
			else {
				output.append(c);
				
			}
		}
		System.out.println(output);
	}

}
