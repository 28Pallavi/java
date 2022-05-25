package altPrime;

public class AlternatePrimeEx {
	static int checkPrime(int num)   
	{   
	int i,flag=0;   
	for(i = 2; i<= num / 2; i++)   
	{   
		if(num % i == 0)   
		{   
		flag = 1;   
		break;   
		}
	}
	if(flag == 0)   
		return 1;   
	else
		return 0;  
		
	}
	static void printAlternatePrimeNumber(int n)   
	{
		int temp = 2;   
		for(int num = 2; num <= n-1; num++)   
		{
			if (checkPrime(num) == 1)  
			{
				System.out.print(num + " ");   
				temp++;
			}
		}
	}

	public static void main(String[] args) {
		int num = 50;
		System.out.println("Alternate prime numbers upto" + num+" are:");
		printAlternatePrimeNumber(num);
	}	

}
