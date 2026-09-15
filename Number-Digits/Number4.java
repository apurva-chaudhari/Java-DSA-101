//4.	Armstrong Number  
import java.util.Scanner;
class Number4{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int n = num;
		int temp=num;
		int c=0,a=0;
		while(temp!=0){
			c=c+1;
			temp=temp/10;
		}
		while(num!=0){
			int d = num%10;
			a = a +(int) Math.pow(d,c);
			num = num/10;
		}
		if(n==a){
			System.out.print("Armstrong");
		}
		else{
			System.out.print("Not Armstrong");
		}
	}
}