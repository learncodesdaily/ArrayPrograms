package arrays;

import java.util.Scanner;

class SearchElement{
	int flag,index;
	Scanner sc = new Scanner(System.in);
	void display(int[] a,int key) {
		for(int i=0;i<a.length;i++) {
			if(key == a[i]) {
				flag = 1;
				index = i;
				break;
			}
		}
		if(flag == 0)
			System.out.println("Element not Found!!");
		else
			System.out.println("Element found at the position : "+index);
	}
	public void readArray() {
		System.out.println("Enter the array size :");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		System.out.println("Enter the key elemenent to be searched:");
		int key =  sc.nextInt();
		display(a,key);
	}
}
public class SearchKeyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchElement se = new SearchElement();
		se.readArray();
	}

}
