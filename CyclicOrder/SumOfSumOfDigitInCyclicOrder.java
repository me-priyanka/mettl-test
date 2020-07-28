 public class SumOfSumOfDigitInCyclicOrder{
	 public static void main(String argd[]){
		 int input1 =582109,sum=0,rev=0,count=0,d=0;
          while(input1>0){
			 d=input1%10;
			 rev = rev*10+d;
			 input1/=10;
			 count++;
		 }
		 int a[] =new int[count],p=0;
		 int c=0;
		 while(rev >0){
			 d= rev%10;
			 a[c++] = d;
			 rev/=10;
		 }
		c=a.length;
	//adding the digits in cyclic order
	for(int i=0;i<c;i++){
		sum+=a[i];
		for(int j=i+1;j<c;j++){
			sum+=a[j];
		}
	}
	System.out.print(sum);
	 }
 }
