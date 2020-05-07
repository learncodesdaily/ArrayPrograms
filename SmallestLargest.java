package arrays;

import java.util.Scanner;

class SmallLarge{
	Scanner sc = new Scanner(System.in);
	
	void display(int[] a) {
		int small = a[0],large = a[0];
		for(int i = 0; i<a.length;i++) {
			if(small>a[i])
				small = a[i];
			else
				large = a[i];
		}
		System.out.println("Smallest Element : "+small+"\nLargest Element : "+large);
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
public class SmallestLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmallLarge sl = new SmallLarge();
		sl.readArray();
	}

}
