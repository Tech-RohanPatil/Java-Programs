package loops;
import java.util.Scanner;
public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no ");
int no=sc.nextInt();
boolean isPrime=true;
for(int i=2;i<no/2;i++) {
	if(no%i==0) {
		isPrime=false;
		break;
	}
}if(isPrime==true) {
	System.out.println(no+" is prime no");
}else {
	
	System.out.println(no+" is not prime no");
}
	}

}
