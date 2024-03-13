package loops;

import java.util.Scanner;
public class PrimeTo100 {
	// write the program to print prime no between 1 to 100
        	public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("list of all prime no between 1 to 100");
			int no=100;
			boolean isPrime=true;
			for(int i=2;i<=no;i++) {
				isPrime=true;
				for( int j=2;j<i;j++) {
					if(i%j==0) {
						isPrime=false;
						break;
					}
				}
				if(isPrime==true) {
					System.out.println(i);
				}
			}
		}
	}

