package Patterns;

/* Write a  program to print the givevn pattern
 *  1  1  1
 *  2  2  2
 *  3  3  3
 */
public class Pattern4 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			
			for(int j=1;j<=3;j++) {
				
				System.out.print(i+" ");
			}System.out.println();
		}
	}

}