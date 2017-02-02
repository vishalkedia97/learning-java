import java.util.Scanner;
public class Pract{
	public static int Fact(int n){
		if(n==0){
			return 1;
		}
		return n*Fact(n-1);
	}public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.println(Fact(n));
	}
}