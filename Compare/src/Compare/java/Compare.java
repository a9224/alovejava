package Compare.java;
import java.util.Scanner;
public class Compare {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1,n2;
		System.out.print("Enter 1st number: ");
		n1 = input.nextInt();
		System.out.print("Enter 2nd number: ");
		n2 = input.nextInt();
		
		if(n1==n2)
			System.out.printf("%d == %d\n",n1,n2);
		if(n1!=n2)
			System.out.printf("%d != %d\n",n1,n2);
		if(n1<=n2)
			System.out.printf("%d <= %d\n",n1,n2);
		if(n1>=n2)
			System.out.printf("%d >= %d\n",n1,n2);
		if(n1<n2)
			System.out.printf("%d < %d\n",n1,n2);
		if(n1>n2)
			System.out.printf("%d > %d\n",n1,n2);
	}
}
