class Compoundinterest {
	public static void main(String args[]){
		double principal=1000,amount,rate=.02;
		int n;
		for(n=1;n<=5;n++) {
			amount=principal*Math.pow(1+rate,n);
			System.out.println(n + " " + amount);
		}
		
		}
	}