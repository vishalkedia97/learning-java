import java.util.*;
public class Linked1{
	public static void main(String[] args) {
		LinkedList<String> input=new LinkedList<String>();
		input.add("A");
		input.add("C");
		input.add(2,"B");
		input.add("W");
		System.out.println("LinkedList :"+ input);

		input.remove("C");
		System.out.println("LinkedList after deletion: " + input);
	}
}