//5.	Nth Term in the Fibonacci Series 
import java.util.Scanner;
class Number5{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int a=0,b=1,c=0;
		if(num==0){
			System.out.print(0);
		}
		else if(num==1){
			System.out.print(1);
		}
		else{
			for(int i=2;i<=num;i++){
				c=a+b;
				a=b;
				b=c;
			}
			System.out.print(c);
		}
	}
}