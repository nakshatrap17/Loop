import java.util.Scanner;
class MultiplicationTable2
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Number: ");
		int no = sc.nextInt();
		System.out.println("Enter Range: ");
		int r = sc.nextInt();
		
		for(int i=1; i<=r; i++)
		{
			System.out.println(no+" * "+i+" = "+(no*i));
		}
	}
}
