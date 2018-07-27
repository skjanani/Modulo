package janani;
import java.util.Scanner;
public class Mulitiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,n1,n2,n3;
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
n1=ja.nextInt();
n2=ja.nextInt();
n3=ja.nextInt();
n=(n1*n2)%n3;
System.out.println(n);
	}

}
