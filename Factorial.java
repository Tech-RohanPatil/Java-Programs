package loops;

// write a program to print the factorial of any no
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to print factorial of");
long no=sc.nextInt();
long factorial=1;
for(int i=1;i<=no;i++) {
	 
		factorial=factorial*i;
	
}System.out.println(factorial);
	}

}
