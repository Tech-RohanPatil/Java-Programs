package B31;
import java.util.Scanner;
public class GreatestNo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b&&a>c) {
	System.out.println(a+" is greater no");
}else if(b>c&&b>a) {
	System.out.println(b+" is greater no");
}else {
	System.out.println(c+" is greater no");
}
	}

}
