//we take any two number from user and find value of one no raised to power of another
import java.util.Scanner;
class Ques{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int a,b,c=1;
		System.out.println("Enter the value of a :");
		a=input.nextInt();
		System.out.println("Enter the value of b :");
		b=input.nextInt();

		//c=(int)Math.pow(a,b); we can do the following in this way also but we will use loop now;
		for(int i=1;i<=b;i++){
			c=c*a;
		}
		System.out.println(c);
	}
}