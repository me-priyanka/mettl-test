import java.util.*;  
public class Decreasing_Sequence
  {
	  public static void main(String args[]){
		  int[] input1 = {11,3,1,4,7,8,12,2,3,7};
		  ArrayList a1 = new ArrayList();
		  int count =0,len=1;
		  int input2 = input1.length;
		  int i =0,k=0;
		  while(i<input2-1){
		    if(input1[i]>input1[i+1]){
			  len++;
			  k=1;
		     }
		    else{
				if(k==1){
					 count++;
					 k=0;
					 a1.add(len);
					 len =1;
				}
			}
			i++;
		  }//while closed
		  if(k==1){
			  count++;
			  a1.add(len);
		   }
		   if(a1.size()>0){
			   len = (int)a1.get(0);
			   for(i=1;i<a1.size();i++){
				   if((int)a1.get(i)>len)
					   len = (int)a1.get(i);
			   }
		   }
		   else{
			   len =0;
			   System.out.print(count+" "+len);
		   }
	  }
  }