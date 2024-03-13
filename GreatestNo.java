package B31;
import java.util.Scanner;
public class GreatestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>c) {
	System.out.println(a+" is greater  ");
}if(c>b) {
	System.out.println(c+" is greater");
}else {
	System.out.println(b+" is greater than all ");
}
	}

}
