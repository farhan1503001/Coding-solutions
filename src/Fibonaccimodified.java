import java.math.BigInteger;
import java.util.*;
public class Fibonaccimodified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t1=sc.nextInt();
		int t2=sc.nextInt();
		int n=sc.nextInt();
		BigInteger f1=BigInteger.valueOf(t1);
		BigInteger f2=BigInteger.valueOf(t2);
		for(int i=2;i<=n;i++)
		{
			BigInteger result=f1.add(f2.multiply(f2));
			f1=f2;
			f2=result;
		}
		System.out.println(f1);
	}

}
