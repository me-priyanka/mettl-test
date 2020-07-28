import java.util.*;
public class Addition_using_String{
	public static void main(String args[]){
		String input1,input2;
		Scanner sc= new Scanner(System.in);
		input1 = sc.nextString();
		input2 = sc.nextString();
        BigInteger b1 = new BigInteger(input1);
		BigInteger b2 = new BigInteger(input2);
		BigInteger b3 =b1.add(b2);
		String res = ""+b3;
		System.out.print( res);
		
	}
}