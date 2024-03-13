package B31;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int no=sc.nextInt();
if(no%2==0) {
	System.out.println(no+" is a even no");
}else {
	System.out.println(no+" is odd no");
}
	}

}
