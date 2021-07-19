import java.util.*;
public class Marckscakewalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Integer[] calories=new Integer[n];
		for(int i=0;i<n;i++) {
			calories[i]=sc.nextInt();
		}
		Arrays.sort(calories,Collections.reverseOrder());
		long sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=(Math.pow(2, i))*calories[i];
			//System.out.println(calories[i]);
		}
		System.out.println(sum);
	}

}
