import java.util.*;
public class Marsexploration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String message=sc.nextLine();
		//String splitted[]=message.substring(3);
		int count=0;
		//String val=message.substring(0,3);
		//System.out.println(val);
		
		for(int i=0;i<message.length();i+=3)
		{
			String val=message.substring(i, i+3);
			//System.out.println(val);
			
			if(Character.compare(val.charAt(0),'S')!=0)
			{
				count=count+1;
			}
			if(Character.compare(val.charAt(1),'O')!=0)
			{
				count=count+1;
			}
			if(Character.compare(val.charAt(2),'S')!=0)
			{
				count=count+1;
			}
			
		}
		System.out.println(count);
        
	}

}
