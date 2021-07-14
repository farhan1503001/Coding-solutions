import java.util.*;
public class Strongpassword {

	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numbers = "0123456789";
		String lower_case = "abcdefghijklmnopqrstuvwxyz";
	    String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String special_characters = "!@#$%^&*()-+";
		int length=sc.nextInt();
		sc.nextLine();
		String input=sc.nextLine();
		boolean[] flag_list= {false,false,false,false};
		for(int i=0;i<input.length();i++)
		{
			char temp=input.charAt(i);
			if(numbers.contains(Character.toString(temp)))
			{
				flag_list[0]=true;
				continue;
			}
			else if(lower_case.contains(Character.toString(temp)))
			{
				flag_list[1]=true;
				continue;
			}
			else if(upper_case.contains(Character.toString(temp)))
			{
				flag_list[2]=true;
				continue;
			}
			else if(special_characters.contains(Character.toString(temp)))
			{
				flag_list[3]=true;
				continue;
			}
			
		}
		int flag_number=0;
		for(int i=0;i<4;i++)
		{
			if(flag_list[i])
			{
				flag_number+=1;
			}
		}
		int num_required=(4-flag_number);
		if(length+num_required>=6)
		{
			num_required=4-flag_number;
		}
		else {
			num_required=(6-length);
		}
		System.out.println(num_required);
	}

}
