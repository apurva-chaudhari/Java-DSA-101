//1.	Sum of Digit of Number
import java.util.Scanner;
class Number1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		while(num!=0){
			int d = num%10;
			sum = sum + d;
			num = num/10;
		}
		System.out.print(sum);
	}
}  