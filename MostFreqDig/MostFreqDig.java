public class MostFreqDig {
    public static void main(String[] args){
    String s = "abcdajkldca";
    int count1=1,count2=1,j=1,k=0;
    int l = s.length();
    boolean flag = true;
    char c = s.charAt(0);
    char res = s.charAt(0);
    while(j<l){
        if(c == s.charAt(j))
            count1++;
        j++;
   }

    
    for(int i =1;i<l;i++){
        flag = true;
        c = s.charAt(i);
        k=i-1;
          while(k>=0){
              if(c == s.charAt(k)){
                  flag = false;
                  break;
              }
              k--;
          }
              if(flag == true){
            for(j=i+1;j<l-1;j++){
                if(c == s.charAt(j))
                    count2++;                
            }   
            if(count2>count1){
                res = c;
                count1 = count2;
            }
              }
    //System.out.println(count2 +" "+c);
    count2 = 1;
    
    }
    //int  n = Integer.parseInt(res+"");
    System.out.println(res);
}
}