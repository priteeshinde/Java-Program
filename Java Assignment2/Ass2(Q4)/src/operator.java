import java.util.Scanner;
public class operator {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two number:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		System.out.println("Operaters:");
		System.out.println("1: + \n2: - \n3: * \n4: %" );
		System.out.println("Enter your choice:");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			int s=n1+n2;
			System.out.println("Output: "+s);
			break;
			
		case 2:
			int s1=n1-n2;
			System.out.println("Output: "+s1);
			break;
			
		case 3:
			int m=n1*n2;
			System.out.println("Output: "+m);
			break;
			
		case 4:
			int d=n1%n2;
			System.out.println("Output: "+d);
			break;
			
		default:
			System.out.println("Inavalid choice");
		}
		
	}
	
}
	
