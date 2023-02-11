package javaSamples;

public class UsingArrays {

	public static void main(String[] args)
	{
		int[] a= {10,20,30,40,50};
		System.out.print("a=");
		//for(int i=0; i<a.length;i++)
		//{
		//	System.out.print(a[i]+" ");
			
		//}
		for(int i : a)
		{
			System.out.print(i + " ");
		}
	}

}
