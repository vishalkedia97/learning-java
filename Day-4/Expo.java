import java.util.Scanner;
public class Expo{
	public static int Exp(int a,int b){
		if(b==0){
			return 1;
		} 
		return a*Exp(a,b-1);
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		
        System.out.println(Exp(a,b));

	}
}