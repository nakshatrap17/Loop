import java.util.Scanner;
class NumberEx
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		int no = new Scanner(System.in).nextInt();
		while(no>0)
		{
			int rem = no%10;
			System.out.println(rem);
			no/=10;
		}
	}
}
