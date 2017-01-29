import java.util.Scanner;
class While{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double p,t,count=1,r,si;
		int n;
		System.out.println("Enter the Number of calculation You want to occur");
		n=input.nextInt();
		while(count<=n){

			System.out.println("Enter P R T respectively");
			p=input.nextDouble();
			r=input.nextDouble();
			t=input.nextDouble();
			si=(p*r*t)/100;
			System.out.println("Simple Interest This time : " + si);

			count+=1;
		}
	}
}