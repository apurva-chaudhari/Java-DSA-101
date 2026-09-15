//2.	Reverse Number  
import java.util.Scanner;
class Number2{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int rev=0;
		while(n!=0){
			int d = n % 10;
			rev = rev * 10 + d;
			n = n/10;
		}
		System.out.print(rev);
	}
}