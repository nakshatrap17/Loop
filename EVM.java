import java.util.Scanner;
class  EVM
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int bjp=0, cng=0, ss=0, aap=0, mns=0, nota=0;
		System.out.println("\n     ***  ELCOME TO EVM  ***\n");
		System.out.println("Enter the population: ");
		int pop = sc.nextInt();
		
		for(int i=1;i<=pop;i++)
		{
			System.out.println("\nList of parties: ");
			System.out.println("1. BJP");
			System.out.println("2. Congress");
			System.out.println("3. Shiv Sena");
			System.out.println("4. AAP");
			System.out.println("5. MNS");
			System.out.println("6. NOTA");
			
			System.out.println("\nEnter your option: ");
			int opt = sc.nextInt();
			
			if(opt>=1 && opt<=6)
			{
				if(opt==1)
					bjp++;
				if(opt==2)
					cng++;
				if(opt==3)
					ss++;
				if(opt==4)
					aap++;
				if(opt==5)
					mns++;
				if(opt==6)
					nota++;
			}
			
			if(!(opt>=1 && opt<=6))
			{
				i--;
				System.out.println("Invalid Input");
			}
			
		}
		
		if(nota>=cng && nota>=ss && nota>=aap && nota>=mns && bjp<=nota)
			System.out.println("NoOne Won the Election !!!");	
		if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
			System.out.println("BJP Won the Election !!!");
		if(cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota)
			System.out.println("Congress Won the Election !!!");
		if(ss>=cng && ss>=cng && ss>=aap && ss>=mns && ss>=nota)
			System.out.println("Shiv Sena Won the Election !!!");
		if(aap>=cng && aap>=ss && aap>=bjp && aap>=mns && aap>=nota)
			System.out.println("AAP Won the Election !!!");
		if(mns>=cng && mns>=ss && mns>=aap && mns>=bjp && mns>=nota)
			System.out.println("MNS Won the Election !!!");
		
	}
}
