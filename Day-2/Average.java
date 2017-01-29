import java.util.Scanner;
class Average{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double sum=0,avg,num;
		int n;
		System.out.println("No of terms:");
		n=input.nextInt();
		int count=1;
		while(count<=n){
		num=input.nextDouble();
		sum=sum+num;
		count++;
		}
		avg=sum/n;
		System.out.println(avg);


	}
}