import java.math.BigInteger;
import java.util.*;
public class ModifiedKaprekar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int low=sc.nextInt();
		int high=sc.nextInt();
		boolean flag=false;
		for(int i=low;i<=high;i++)
		{
			long sq=(long)i*i;
			String sq_num=String.valueOf(sq);
			//System.out.println(sq_num);
			int sum=0;
			if(sq_num.length()>=2) {
			String half1=sq_num.substring(0,sq_num.length()/2);
			String half2=sq_num.substring(sq_num.length()/2,sq_num.length());
			//System.out.print(half1+" ");
			//System.out.print(half2);
			//System.out.println();
			sum=Integer.parseInt(half1)+Integer.parseInt(half2);
			}
			else {
				//System.out.println(sq_num);
				sum=Integer.parseInt(sq_num);
			}
			if(sum==i)
			{
				System.out.print(i+" ");
				flag=true;
			}
			
		}
		if(!flag)
		{
			System.out.println("INVALID RANGE");
		}
	}

}
