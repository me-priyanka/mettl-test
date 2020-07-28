import java.util.*;
public class SimpleEncodedArray
{ 
    public static void main (String[] args) 
    { 
	int input1[] = {7,6,8,16,12,3};
	int input2 = input1.length;
	   int a[] = new int[input2];
	   a[input2-1] = input1[input2-1];
	   for(int i= input2-2;i>=0;i--){
		   a[i] = input1[i] - a[i+1];
	   }
       int suma=0;
		for(int i1=0;i1<input2;i1++){
			System.out.print(a[i1]+" , ");
			suma=suma+a[i1];
		}
	
		System.out.print(suma);
   //  Result r = new Result(arr[0],suma);
      // return r;   
    
    } 
} 
