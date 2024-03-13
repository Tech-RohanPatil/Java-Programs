package Patterns;

//write a program to print the given pattern
/*
*  1  2  3
*  1  2
*  1
*/
public class Pattern {

	public static void main(String[] args) {
	
		
		for(int i=3;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(j+" ");
			}System.out.println();
		}
	}

}
