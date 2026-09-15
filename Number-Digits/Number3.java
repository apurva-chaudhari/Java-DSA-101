//3.	Palindrome Number
import java.util.Scanner;
class Number3{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int n=num;
		int rev=0;
		while(n!=0){
			int d = n % 10;
			rev = rev * 10 + d;
			n = n/10;
		}
		if(rev==num){
			System.out.print("Palindrome");
		}
	}
}  