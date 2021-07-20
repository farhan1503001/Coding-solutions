import java.util.*;
class customer{
	int cus_id;
	int order;
	int prep_time;
	public customer(int id,int order,int prep_time)
	{
		this.cus_id=id;
		this.order=order;
		this.prep_time=prep_time;
	}
}
class Total_customer_comparator implements Comparator<customer>{
	@Override
	public int compare(customer c1,customer c2) {
		int total_c1=c1.order+c1.prep_time;
		int total_c2=c2.order+c2.prep_time;
		if(total_c1>total_c2)
		{
			return 1;
		}
		else if(total_c1==total_c2)
		{
			return 0;
		}
		else {
			return -1;
		}
	}
}
public class Jimandorders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<customer>order_list=new ArrayList<customer>();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			int order=sc.nextInt();
			int prep=sc.nextInt();
			order_list.add(new customer(i, order, prep));
		}
		sc.close();
		Collections.sort(order_list,new Total_customer_comparator());
		for(customer person:order_list)
		{
			System.out.print(person.cus_id+" ");
		}
	}

}
