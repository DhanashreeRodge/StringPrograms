import java.util.Scanner;

public class TrimTheString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to trim");
		String str=sc.nextLine();
		
		//System.out.println(str.trim());
		
		char ch[]=str.toCharArray();
		int start=0,end=ch.length-1,count;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				start=i;
			break;
			}
		}

		for(int i=ch.length-1;i>start-1;i--)
		{
			if(ch[i]!=' ')
			{
			end=i;
			break;
			}
		}
		
		count=(end-start)+1;
		
		String result=new String(ch,start,count);
		System.out.println(result);
	}

}
