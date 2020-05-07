package arrays;

public class DisplayArray {
	static void display(int a[]){
		System.out.println("Array values are : ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40,50,60};
		display(a);
	}
}
