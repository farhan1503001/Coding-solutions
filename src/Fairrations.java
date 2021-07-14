import java.util.*;
public class Fairrations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] bin=new int[num];
		boolean flag=false;
		int count=0;
		int num_odd=0;
		for(int i=0;i<num;i++)
		{
			bin[i]=sc.nextInt();
			if(bin[i]%2!=0)
			{
				num_odd=num_odd+1;
			}
		}
		if(num_odd%2!=0)
		{
			System.out.println("No");
		}
		else {
		for(int i=0;i<num;i++)
		{
			if(bin[i]%2!=0)
			{
				bin[i]=bin[i]+1;
				bin[i+1]=bin[i+1]+1;
				count=count+2;
			}
		}
		//System.out.println(count);
		System.out.println(count);
	}

}
}
