import java.util.*;

public class Gridchallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//Scanner sen=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t>0) {
			int n=sc.nextInt();
			//char[][] array=new char[n][n];
			String[] array=new String[n];
			//sc.nextLine();
		for(int i=0;i<n;i++)
		{
			String val=sc.next();
			
			//array[i]=val.toCharArray();
			char[] temp=val.toCharArray();
			Arrays.sort(temp);
			array[i]=new String(temp);
			//System.out.println(array[i]);
		}
		
		boolean flag=false;
		int count=array[0].length();
		for(int i=0;i<count;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				//System.out.print(array[i].toString());
				if(array[j].charAt(i)>array[j+1].charAt(i)) {
					flag=true;
					break;
				}
			}
			//System.out.println();
			//count++;
		}
		if(flag)
		{
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
		t=t-1;

	}
		sc.close();
	}
}
