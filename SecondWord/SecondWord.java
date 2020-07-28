import java.util.Scanner;
public class SecondWord{
	public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  String s1 = sc.nextLine();
	  //String s1 = input1.
	  s1 = input1.trim();
	  int c=1;
	  for(int i =0;i<s1.length();i++){
	       if(s1.charAt(i)==' ')
             c++;
	  }
	  if(c==1){
		  return "Less";
	  }
	  else if(c ==2){
		 int space = s1.indexOf(" ");
         int len   = s1.length();
   
        String first = s1.substring(0, space);
        String last = s1.substring(space);
        last = last.toUpperCase();
		return last;

	  }
	  else{

	  int n1 = s1.indexOf(" ");
	  
	  String s2 = s1.substring(0,n1);
	  int n2 = s1.length();
	  String s3 =  s1.substring(n1+1,n2);
	  int n3 =s3.indexOf(" ");
	  String s4 =  s3.substring(0,n3);
	  s4 = s4.toUpperCase();
	  return s4;
	  }
   }
}