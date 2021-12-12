import java.util.Scanner;
class prime{
	public prime(int num1)
	{
		for (int i=2;i<num1;i++)
		{
			if (num1%i==0)
			{
				return 
				break;
			}

		}
	}
	public static void main(String[] args)
	{
		int a;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		a=sc.nextInt();
		int flag=1;

		for (int i=2;i<a;i++)
		{
			if (a%i==0)
			{
				flag=0;
				break;
			}

		}

		if (a==0)
		{
			System.out.println("0 is not prime not consonant number.");
		}
		else if(a==1)
		{
			System.out.println("1 is not prime number.");
		}
		else if(a==2)
		{
			System.out.println("2 is prime Number.");
		}
		else
		{
			if (flag==0)
				{
					System.out.println(a + " is not prime.");
				}
				else
				{
					System.out.println("Prime.");
				}
		}


	}
}