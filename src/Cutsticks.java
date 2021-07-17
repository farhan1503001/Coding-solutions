import java.util.*;
public class Cutsticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//logic is if sorted array's any value doesn't match it's previous then it means that it's previous indices are all cut
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] array=new int[num];
		HashMap<Integer,Integer>counter=new HashMap<>();
		for(int i=0;i<num;i++)
		{
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println(num);
		
		for(int i=1;i<num;i++)
		{
			if(array[i]!=array[i-1])
			{
				System.out.println(num-i);
			}
			
		}
		sc.close();
		
	}

}
