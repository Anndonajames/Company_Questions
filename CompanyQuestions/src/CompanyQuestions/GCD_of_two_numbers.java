package CompanyQuestions;
import java.util.Scanner;
public class GCD_of_two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int i,gcd=0;
		
		for(i=1;i<=a*b;i++)
		{
		
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
			
		}
		System.out.println("gcd :"+gcd);
		
			

	}

}
