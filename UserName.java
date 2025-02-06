import java.util.Scanner;
class UserName
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String s = sc.next().toUpperCase();
		int len = s.length();
		for(int i=0; i<len;i++)
		{
			System.out.println(s.charAt(i));
			Thread.sleep(1000);
		}
	}
}
