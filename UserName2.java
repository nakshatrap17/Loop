import java.util.Scanner;
class UserName2
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String s = sc.next().toUpperCase();
		int len = s.length();
		for(int i=0; i<len;i++)
		{
			if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
			{
				System.out.println(s.charAt(i));
				Thread.sleep(1000);
			}
		}
	} 
}