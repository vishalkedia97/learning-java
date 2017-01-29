import java.util.Scanner;
class Calc{
	public static void main(String args[]){
		Scanner input = new Scanner (System.in);
		double num1,num2,result;
		System.out.println("enter the num1:");
		num1=input.nextDouble();
		System.out.println("enter the num2:");
		num2=input.nextDouble();
		System.out.println("enter the opt & opt should * + - /:");
		char opt;
		opt = input.next().trim().charAt(0);
		switch (opt) {
			case '+':
			        System.out.println("add");
			    	 break;
			case '-':
			        System.out.println("subtract");
			     	break;
			case '*':
			        System.out.println("multiply");
			     	break;
			case '/':
			        System.out.println("divide");
			        result=num1/num2;
			        System.out.println(result);
			     	break;
			default :
			        System.out.println("invalid");
			    	 break;   
		}
	}
}