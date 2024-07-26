package AddDem;
import java.util.Scanner;
public class add {
    	public static void main(String [] args) {
		int a,b,c;
		Scanner s =new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		s.nextLine();
		
		System.out.print("enter the triner name:");
		String name;
		name= s.nextLine();
		c =a+b;
		System.out.println("Addition of a="+a+"and b="+b+"is c="+c);
		System.out.println("Tech Trainer:"+name);

		}

	}