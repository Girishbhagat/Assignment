package problemSolved;

public class Array {

	//Array program in descending order
	   public static void main(String[] args)
	   {
		   int a[]= {2,3,5,7,8};
		   int size=a.length;
		   System.out.println("The element of array: 2,3,5,7,8");
		   int temp=0;
		   for(int i=0;i<a.length;i++)
		   {
			   for(int j=i+1;j<a.length;j++)
			   {
				   if(a[i]<a[j])
				   {
					   temp=a[i];
					   a[i]=a[j];
					   a[j]=temp;
				   }
			   }
		   }
		   System.out.println();
		   System.out.println("Elements of array sorted in descending order:");
		   for(int i=0;i<a.length;i++)
		   {
			   System.out.print(a[i] +" ");
		   }
	   }
	}

