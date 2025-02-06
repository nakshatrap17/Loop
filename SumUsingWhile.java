import java.util.Scanner;
class SumUsingWhile
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		int no = new Scanner(System.in).nextInt();
		int dup = no;
		int sum=0, rem=0;
		while(no>0)
		{
			rem = no%10;
			sum+=rem;
			no/=10;
		}
		System.out.println("Your num: "+dup);
		System.out.println("Sum of digits: "+sum);
	}
}