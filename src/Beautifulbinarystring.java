import java.util.*;
public class Beautifulbinarystring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		sc.nextLine();
		String value=sc.nextLine();
		int count=0;
		int index=0;
		while(index<=(len-1)-2)
		{
			if(value.charAt(index)=='0' && value.charAt(index+1)=='1' && value.charAt(index+2)=='0')
			{
				count++;
				index=index+3;
			}
			else {
				index++;
			}
		}
		System.out.println(count);

	}

}
