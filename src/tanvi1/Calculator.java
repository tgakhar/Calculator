package tanvi1;
import java.util.Scanner;
class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no");
		int no1=sc.nextInt();
		System.out.println("Enter second no");
		int no2=sc.nextInt();
		System.out.println("Select symbol(+,-,*,/)");
		String sym=sc.next();
		int res;
		switch(sym)
		{
		case"+":res=no1+no2;
		System.out.println("Addition is: "+res);
		break;
		case"-":res=no1-no2;
		System.out.println("Subtraction is: "+res);
		break;
		case"*":res=no1*no2;
		System.out.println("Multiplication is: "+res);
		break;
		case"/":res=no1/no2;
		System.out.println("Division is: "+res);
		break;
		default:System.out.println("Invalid Symbol");
		break;
		
		}
		
		
		

	}

}
