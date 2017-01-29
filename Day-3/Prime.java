import java.util.Scanner;
public class Prime{
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		int num,i=1,countdiv=0;
		System.out.println("enter the no:");
       	num=input.nextInt();
		while(i<=num){
			if(num%i==0){
				countdiv+=1;
			}
			i++;
		}
		if(countdiv>2){
			System.out.println("Not Prime");
		}
		else
			System.out.println("Prime");
		}
	}
