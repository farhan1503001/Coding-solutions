import java.util.*;
public class Twosumicecreamparlour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		
		while(test>0)
		{
			HashMap<Integer,Integer>dicts=new HashMap<Integer,Integer>();
			int money=sc.nextInt();
			int n=sc.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i++)
			{
				array[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				int val=array[i];
				//System.out.println(val);
				if(dicts.containsKey(money-val))
				{
					System.out.println(dicts.get(money-val)+" "+(i+1));
					break;
				}
				dicts.put(val,i+1);
			}
			dicts.clear();
			test--;
		}
		
	}

}
