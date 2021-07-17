import java.util.*;
class position{
	int col1;
	int col2;
	public position(int col1,int col2) {
		this.col1=col1;
		this.col2=col2;
	}
}
public class Gridlandmetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		int total=n*m;
		//boolean[][] holder=new boolean[n][m];
		int count=0;
		HashMap<Integer,HashSet>holder=new HashMap<Integer,HashSet>();
		for(int i=0;i<k;i++)
		{
			HashSet<Integer> pos=new HashSet<>();
			int r=sc.nextInt();
			int c1=sc.nextInt();
			int c2=sc.nextInt();
			//r=r-1;c1=c1-1;c2=c2-1;
			if(!holder.containsKey(r))
			{
				for(int j=c1;j<=c2;j++)
				{
					if(pos.add(j)) {
						count++;
					}
					
					
				}
			}
			else {
				pos=holder.get(r);
				for(int j=c1;j<=c2;j++)
				{
					if(pos.add(j)) {
						count++;
					}
				}
			}
		  holder.put(r, pos);
		}
		System.out.println(total-count);
		
	}

}
