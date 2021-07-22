import java.util.*;
public class TaumandBday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int test_case=sc.nextInt();
		while(test_case>0) {
		long b=sc.nextLong();
		long w=sc.nextLong();
		long bc=sc.nextLong();
		long wc=sc.nextLong();
		long z=sc.nextLong();
		long sum=0;
		if(wc>bc+z)
		{
			sum=(b+w)*bc+(w*z);
		}
		else if(bc>wc+z)
		{
			sum=(b+w)*wc+(b*z);
		}
		else {
			sum=(b*bc)+(w*wc);
		}
		System.out.println(sum);
		test_case--;
		}	
	}

}
