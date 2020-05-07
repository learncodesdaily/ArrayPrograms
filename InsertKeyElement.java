package arrays;

import java.util.Scanner;

class InsertElement{
	Scanner sc = new Scanner(System.in);
	
	void display(int[] a,int key,int index) {
		for(int i = a.length;i>index;i++) { 
			a[i] = a[i-1];
			a[index] = key;
		}
		System.out.println("Array Element After Inserting Key");
		for(int i = 0;i<a.length;i++)
			System.out.println(a[i]);
	}
	
	public void readArray() {
		System.out.println("Enter the array size :");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		System.out.println("Enter the key elemenent to be inserted:");
		int key =  sc.nextInt();
		System.out.println("Enter the index of key elemenent to be inserted:");
		int index =  sc.nextInt();
		display(a,key,index);
	}
}
public class InsertKeyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertElement ie = new InsertElement();
		ie.readArray();
	}

}
