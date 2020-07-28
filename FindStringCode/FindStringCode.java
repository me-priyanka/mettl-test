public class FindStringCode {
    public static void main(String[] args){
    System.out.println(FindStr("world Web Wide abc"));
    }
    public static int FindStr(String s){
     String str[] = s.split(" ");
     int l = str.length;
     int i=0;
     String res ="";
     while(i<l){
         System.out.println(Sub(str[i]));
         res = res+Sub(str[i]);
     i++;
     }
     return Integer.parseInt(res);
    
    
    }
    
    public static int Sub(String s){
    String a[][] ={{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"},
                   {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26"}};

    int l = s.length(); 
    int i=0,sub=0,add=0; 
    int first=0,last = 0;//world
    while(i<l){
        String f = s.charAt(i)+"";
        String d = s.charAt(l-1)+"";
        for(int j=0;j<26;j++){
           if(a[0][j].equalsIgnoreCase(f))
            first = Integer.parseInt(a[1][j]);
           if(a[0][j].equalsIgnoreCase(d))
            last = Integer.parseInt(a[1][j]);
            }
       if(i==l-1)
            sub = first;
       else
             sub = first-last;
        i++;
        l--;
        add = add + sub;
    }
    return add;
}
}