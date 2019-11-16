package CompanyQuestions;
import java.util.Scanner;
public class duplicate_elt_array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int i,j;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for( j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
					
			}
		}
	}
}
		
	


