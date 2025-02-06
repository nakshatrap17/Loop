class LoopEx 
{
	public static void main(String[] args) 
	{
		
		System.out.println("");
		
		//1 to 10
		System.out.println("1 to 10");
		for(int i=1; i<=10; i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n");
		
		// z to a
		System.out.println("z to a");
		for(char ch='z'; ch>='a';ch--)
		{
			System.out.print(ch+" ");
		}
		System.out.println("\n");
		
		// Ato Z
		System.out.println("A to Z");
		for(char ch='A'; ch<='Z';ch++)
		{
			System.out.print(ch+" ");
		}
		System.out.println("\n");
		
		// 0 to 9
		System.out.println("0 to 9");
		for(char ch='0'; ch<='9';ch++)
		{
			System.out.print(ch+" ");
		}
		System.out.println("\n");
		
		//Ascii table
		System.out.println("ASCII table");
		for(int i=0; i<=127; i++)
		{
			System.out.println(i+":"+((char)i)+"  ");
			//System.out.println(i+":"+(i+0)+"  ");
		}
		
	}
}
