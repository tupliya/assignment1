package Demo;
import java.util.*;
public class Assign3 {

	public static void main(String[] args)
	{
		int total=0;
		int a=60,b=90,c=120,d=45,e=30;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Player Name ?");
		String name=s.nextLine();
		
		System.out.println("Select numbers in input: "+a+" "+b+" "+e+" "+d+" "+c);
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter angle 1 : ");
		int angle1=s1.nextInt();
		
		Scanner s2 = new Scanner(System.in);
		System.out.print("Enter angle 2 : ");
		int angle2=s2.nextInt();
		
		Scanner s3 = new Scanner(System.in);
		System.out.print("Enter angle 3 : ");
		int angle3=s3.nextInt();
		total=angle1+angle2+angle3;
		if(total==180) {
			
			if(angle1==90 || angle2==90 || angle3==90) {
				System.out.println(name+" you won Second Prize !");
			}
			else if(angle1==60 && angle2==60 && angle3==60) {
				System.out.println(name+" you won Third Prize !");
			}
			else {
				System.out.println(name+" You Won First Prize !");
			}
		}
		
		else {
			System.out.println(name+" You Got No Prize !");
			
		}
	}

}