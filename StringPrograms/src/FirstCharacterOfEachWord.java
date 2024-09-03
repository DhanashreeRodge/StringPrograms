import java.util.Scanner;

public class FirstCharacterOfEachWord {

	public static void main(String[] args) {

		//String str="Hello My name is Dhanashree";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String...");
		String str= sc.nextLine();
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
			
		{
			if(ch[i]!=' ')
			{
				if(i==0)
				{
					System.out.println(ch[i]);
				}
					
	            else if(ch[i-1]==' ')
	            {
				System.out.println(ch[i]);
	            }
				
			}
		}
	}

}
