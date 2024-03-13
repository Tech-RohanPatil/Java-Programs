package Patterns;

/* write a program to print the given pattern
 * 
 *  * * * 
 *  * * * 
 *  * * *
 * 
 */
public class PatternStar {

	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print("* ");
			}System.out.println();
		}
	}

}
