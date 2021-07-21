import java.util.Scanner;


public class Stringconstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		while(n>0) {
			boolean alphabets[]=new boolean[26];
			String value=sc.nextLine();
			for(int j=0;j<value.length();j++)
			{
				int res=(int)value.charAt(j)-97;
				System.out.println(res);
				alphabets[res]=true;
			}
			int count=0;
			for(int key=0;key<26;key++) {
				if(alphabets[key])
				{
					count++;
				}
			}
			System.out.println(count);
			n--;
			
		}
		sc.close();

	}

}
