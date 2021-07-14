import java.util.*;
public class Beautifultriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int d=sc.nextInt();
		HashMap<Integer,Boolean>array=new HashMap<>();
		int[] holder=new int[num];
		for(int i=0;i<num;i++)
		{
			int val=sc.nextInt();
			holder[i]=val;
			array.put(val,true);
		}
		int num_trip=0;
		for(int temp:holder)
		{
			if(array.containsKey(temp+d) && array.containsKey(temp+2*d)){
				num_trip++;
				
			}
		}
		System.out.println(num_trip);
	}

}
