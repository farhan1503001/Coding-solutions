import java.util.*;
public class Timeinwords {
	

	public static void main(String[] args) {
		String array[]= {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four",
				"twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine" };
		
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int m=sc.nextInt();
		String time;
		if(m<=30)
		{
			String mid=" past ";
			if(m==0)
			{
				time=array[h]+" o'clock";
			}
			else if(m==1)
			{
				time=array[m]+" minutes"+mid+array[h];
			}
			else if(m==15)
			{
				time="quarter"+mid+array[h];
			}
			else if(m==30)
			{
				time="half"+mid+array[h];
			}
			else {
				time=array[m]+" minutes"+mid+array[h];
			}
			
		}
		else {
			String mid=" to ";
			if(m==45)
			{
				time="quarter"+mid+array[h+1];
			}
			else {
				time=array[60-m]+" minutes"+mid+array[h+1];
			}
			
			
		}
		System.out.println(time);
	}
	

}
