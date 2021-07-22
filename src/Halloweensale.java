import java.util.*;
public class Halloweensale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int price=sc.nextInt();
		int decreament=sc.nextInt();
		int low_price=sc.nextInt();
		int budget=sc.nextInt();
		int temp=price;
		int sum=0;
		int count=0;
		while(sum<=budget)
		{
			if(temp>low_price) {
			sum+=temp;
			temp-=decreament;
			count++;
			}
			else {
				sum+=low_price;
				count++;
			}
			
		}
		System.out.println(count-1);

	}

}
