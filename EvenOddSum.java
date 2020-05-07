package arrays;

import java.util.Scanner;

class EvenOdd{
	Scanner sc = new Scanner(System.in);
	void display(int[] a) {
		int esum=0,osum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 == 0)
				esum = esum + a[i];
			else
				osum = osum + a[i];
		}
		System.out.println("Even number sum : "+esum);
		System.out.println("Odd number sum : "+osum);
	}

	public void readArray() {
		System.out.println("Enter the array size :");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		display(a);
	}
}
public class EvenOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd eo = new EvenOdd();
		
		eo.readArray();
		//eo.display(a);
	}
}
