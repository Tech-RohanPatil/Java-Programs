package loops;
// write a program to print the average of first 10 natural numbers
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int  no=10;
		int sum=0;
		for(int i=0; i<=no; i++) {
			sum=sum+i;
		}System.out.println("avg="+(sum/no));
	}

}
