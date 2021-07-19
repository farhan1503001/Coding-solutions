import java.util.*;
class contest{
	int luck;
	int imp;
	public contest(int luck,int imp) {
		this.luck=luck;
		this.imp=imp;
	}
}
class LuckComparator implements Comparator<contest>{
	@Override
	public int compare(contest c1,contest c2) {
		if(c1.luck==c2.luck)
		{
			return 0;
		}
		else if(c1.luck<c2.luck)
		{
			return 1;
		}
		else {
			return -1;
		}
	}
}
public class LuckBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int max_k=sc.nextInt();
		ArrayList<contest>holder=new ArrayList<contest>();
		for(int i=0;i<n;i++)
		{
			int luck1=sc.nextInt();
			int imp1=sc.nextInt();
			holder.add(new contest(luck1, imp1));
			
		}
		Collections.sort(holder,new LuckComparator());
		
		//logic is if k is not fullfilled then luck will be decreased if imp=1 or added after passed all will be added
		int max_luck=0;
		int k_com=0;
		for(int i=0;i<n;i++)
		{
			contest temp=holder.get(i);
			if(temp.imp==0)
			{
				max_luck+=temp.luck;
			}
			else if(k_com<max_k)
			{
				max_luck+=temp.luck;
				k_com++;
			}
			else {
				max_luck-=temp.luck;
			}
		}
		System.out.println(max_luck);
		/*
		for(contest val:holder) {
			System.out.println(val.luck+" "+val.imp);
		}
		*/
		
	}

}
