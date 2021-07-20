import java.util.*;
public class CatMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		while(q>0) {
		int cat_a=sc.nextInt();
		int cat_b=sc.nextInt();
		int mouse=sc.nextInt();
		int diff_a=Math.abs(mouse-cat_a);
		int diff_b=Math.abs(mouse-cat_b);
		
		if(diff_a<diff_b)
		{
			System.out.println("Cat A");
		}
		else if(diff_b<diff_a) {
			System.out.println("Cat B");
		}
		else {
			System.out.println("Mouse C");
		}
		q--;
	}
	}
}
