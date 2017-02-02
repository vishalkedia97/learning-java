class Arraycopy{
	public static void main(String args[]){
		int marks[]={21,34,45,56,67};
		int markscopy[]= new int [5];
		markscopy=marks;
		marks[2]=123;
		for(int counter=0;counter<marks.length;counter++){
			System.out.println(marks[counter]);}
			for(int counter=0;counter<markscopy.length;counter++){
			System.out.println(markscopy[counter]);
		
        }
	}
}