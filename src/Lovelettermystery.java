import java.util.*;
public class Lovelettermystery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		sc.nextLine();
		while(test>0) {
		String word=sc.nextLine();
		int low=0;
		int high=word.length()-1;
		int count=0;
		while(low<high)
		{
			
			count+=(int)Math.abs((word.charAt(low))-word.charAt(high));
			//System.out.println(count);
			low++;
			high--;
		}
		System.out.println(count);
		test--;
		}
	}

}
