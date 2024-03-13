package loops;
/*
 * write a program to print the numbers form 1 tp 20 i.e series
 * if the number is divisible by 3 the program should print "SSd"
 * if the number is divisible by 3 the program should print "hdd"
 * if the number is divisible by both 3 & 5 it should print pendrive
 * ensure your program should handles all these conditions accurately
 */
public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1 ; i<=20 ; i++) {
			
			if(i%3==0 && i%5==0) {
				System.out.println("Pendrive");
			}else if(i%3==0) {
				System.out.println("Sdd");
			}else if(i%5==0) {
				System.out.println("Hdd");
			}else {
				System.out.println(i);
			}
		}
		

	}

}
