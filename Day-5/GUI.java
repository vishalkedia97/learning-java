import javax.swing.JOptionPane;
class Graphic{
	public static void main(String args[]){
		String fn=JOptionPane.showInputDialog("Enter first number");
		String sn=JOptionPane.showInputDialog("Enter second number");

		int num1=Integer.ParseInt(fn);
		int num2=Integer.ParseInt(sn);
		int sum=num1 +num2;
		JOptionPane.showMessageDialog(null ,"the answer is " +sum,"the Title ",JOptionPane.PLAIN_MESSAGE);
	}
}