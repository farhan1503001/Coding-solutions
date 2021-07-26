import java.util.*;
public class Hackerrankinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int test_case=sc.nextInt();
		sc.nextLine();
		String hackerrank="hackerrank";
		while(test_case>0)
		{
			int curr_index=0;
			String input=sc.nextLine();
			for(int i=0;i<input.length();i++)
			{
				if(curr_index<hackerrank.length() && input.charAt(i)==hackerrank.charAt(curr_index))
				{
					curr_index++;
				}
			}
			if(curr_index==hackerrank.length())
			{
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			test_case--;
		}

	}

}
