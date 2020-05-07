package arrays;

import java.util.Scanner;

class DeleteArrayElem{
	Scanner sc = new Scanner(System.in);
	
	void display(int[] a,int key,int n) {
		int index = 0;
		for(int i = 0;i<n;i++) {
			if(key == a[i]) {
				index = i;
				break;
			}
		}
		for(int j = index;j<n;j++) {
			a[j] = a[j+1];
		}
		System.out.println("Array after deleting an element : ");
		for(int i = 0;i<n;i++)
			System.out.println(a[i]);
	}
	public void readArray() {
		System.out.println("Enter the array size :");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		System.out.println("Enter the key elemenent to be deleted:");
		int key =  sc.nextInt();
		display(a,key,n);
	}
}
public class DeleteArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteArrayElem de = new DeleteArrayElem();
		de.readArray();
	}

}
