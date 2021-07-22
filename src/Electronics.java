import java.util.*;
public class Electronics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int budget=sc.nextInt();
		int n_k=sc.nextInt();
		int n_u=sc.nextInt();
		ArrayList<Integer>keyboard=new ArrayList<>();
		ArrayList<Integer>usb=new ArrayList<>();
		for(int i=0;i<n_k;i++)
		{
			keyboard.add(sc.nextInt());
		}
		for(int i=0;i<n_u;i++)
		{
			usb.add(sc.nextInt());
		}
		
		Collections.sort(keyboard,Collections.reverseOrder());
		Collections.sort(usb);
		//System.out.println(keyboard.get(0));
		//System.out.println(usb.get(0));
		int max=-1;
		for(int i=0;i<n_k;i++)
		{
			for(int j=0;j<n_u;j++)
			{
				if(keyboard.get(i)+usb.get(j)>budget)
					break;
				else if(keyboard.get(i)+usb.get(j)>max)
				{
					max=keyboard.get(i)+usb.get(j);
				}
			}
		}
		System.out.println(max);
		
	}

}
