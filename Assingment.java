package assignment1;

import java.util.Scanner;

public class Assingment {
	public static void prime1(int n)
	{
//j is variable 
		int j=0;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0)
			{
			j=j+1;
			}
		}
		if(j==0) {
			System.out.println("This is prime number ");
		}
		else {
			System.out.println("This is not prime number");
		}

	}
	
		public static void armstrongnumber(int n)
		{
//			int n;
			int t1=n;
			int lenght=0;
			while(t1!=0)
			{
				lenght=lenght+1;
				t1=t1/10;
			}
			int t2=n;
			int arm=0;
			int rem;
			while(t2!=0)
			{
				int multi=1;
				rem=t2%10;
				for(int i=1;i<=lenght;i++) {
					multi=multi*rem;
				}
				arm=arm+multi;
				t2=t2/10;
			}
			if(arm==n) {
				System.out.println("This is armstrong number");
				
			}
			else {
				System.out.println("This is not armstrong number");
			}
		}
		public static void halfpyramid(int n) {
			for(int i=1;i<=n;i++) {
				for(int j=i;j>=1;j--) {
					System.out.print(j+"");
				}
				System.out.println();
			}
		}
		public static void hollowsquare(int n) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++){
					if(i>=2&&j>=2&&i<=n-1&&j<=n-1) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
		public static void primenotorange(int n,int m) 
		{
			
			System.out.println("enter the last number ");
			
			Scanner sc=new Scanner(System.in);
			m=sc.nextInt();
		
					int j=0;
					for(int no=1;n<=m;n++) {
						
						
					
					for(int i=2;i<=n-1;i++) {
						if(n%i==0)
							
						{
						j=j+1;
						
						}
					}
					if(j==0) {
							System.out.print(n+" ");
					}
					else {
						j=0;
						
					}
				}

			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the first number");
		int n;
		
		Scanner sc=new Scanner(System.in);
				
		int choice;
		do
		{
			System.out.println("1.prime1");
			System.out.println("2.armstrongnumber");
			System.out.println("3.halfpyramid");
			System.out.println("4.hollowsquare");
			System.out.println("5.primenotorange");
			System.out.println("6.exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			  n=0;
			  int m=0;
			  
			if(choice!=6)
			{
			System.out.println("enter the number : ");
			
           
			n=sc.nextInt();
			
			}
			
			if(choice==1)
				prime1(n);
			else if (choice==2)
				armstrongnumber(n);
			else if (choice==3)
				halfpyramid(n);
			else if(choice==4)
				hollowsquare(n);
			else if(choice==5)
				primenotorange(n,m);
			else if (choice==6)
				System.out.println("good bye thankyou!");
			    System.out.println("chose the other option");
			
			
		
		
		
	}while(choice!=6);
	
   }
	
}
