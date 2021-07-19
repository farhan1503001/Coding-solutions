import java.util.*;
public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println(input.length());
		int len=input.length();
		int row=(int)Math.floor(Math.sqrt(len));
		int col=(int)Math.ceil(Math.sqrt(len));
		input=input.replaceAll(" ","");
		boolean flag=false;
		if(row*col<len)
		{
			row=col;
		}
		System.out.println(row+"  "+col);
		for(int i=0;i<col;i++)
		{
			//int j=i;
			int count=0;
			while(count<row) {
				try {
					
					char c=input.charAt(i+count*(col));
					System.out.print(c);
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.print("");
					
				}
				count++;
			}
			System.out.print(" ");
		}
		
	}

}
