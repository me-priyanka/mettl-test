public class GetCodeThroughString{
public static void main(String args[]){
   String input1="yhe good the bad the best";
  String[] s = input1.split(" ");
  int sum = 0;
  for(int i=0;i<s.length;i++){
  int len = s[i].length();
  sum+=len;
    }
  int l  = sum+"".length();
  int rem=0,res=0;
  while(l!=1){
   rem = sum%10;
  res = res+rem;
  sum/=10;
  l--;
  }
  System.out.println(res);
  return res;
  }