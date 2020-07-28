public Result encodedThreeString(String input1,String input2,String input3){  
  String out1,out2,out3;
  out1=(String)((outString(input1)).get(0)+(String)((outString(input2)).get(0)+(String)((outString(input3)).get(0));
  out2 =(String)((outString(input1)).get(1)+(String)((outString(input2)).get(1)+(String)((outString(input3)).get(1));
  out3 = String)((outString(input1)).get(2)+(String)((outString(input2)).get(2)+(String)((outString(input3)).get(2));
  System.out.println(out1+ " "+out2+" "+out3);
  String s3;
  StringBuffer res = new StringBuffer();
  for(int i=0;i<out3.length();i++){
     char c = out3.charAt(i);
	 if(Character.isUpperCase(c))
	   s3 = Character.toLowerCase(c)+"";
	 else 
	   s3 = Character.toUpperCase(c)+"";
	 res.append(s3);
	}
	s3 = res.toString();
	System.out.print(s3);
	Result r = new Result(out1,out2,s3);
	return r;
  }
  public int computelength(int len){
  if(len%3==0)
      return 0;
	  else{
	    if(len%3==1)
		  return 1;
		else
		  return 2;
		  }
	}
  public ArrayList outString(String s){
    ArrayList<String> a1 =new ArrayList<String>();
	
	int len = s.length();
	if(computelength(len)==0){
	   int j=len/3;
	   a1.add(s.substring(0,j));
	   a1.add(s.substring(j,j+j));
	   a1.add(s.substring(j+j,j+j+j));
	   return a1;
  }
  else if(computelength(len)==1){
     int j = len/3;
	 a1.add(s.substring(0,j));
	 a1.add(s.substring(0,j));
	 a1.add(s.substring(j,j+j+1));
     a1.add(s.substring(j+j+1,j+j+j+1));
	 return a1;
   }
   else{
      int j = len/3;
	  a1.add(s.substring(0,j+1));
	  a1.add(s.substring(j+1,j+j+1));
	  a1.add(s.substring(j+j+1,j+j+1+j+1));
	  return a1;
	 }
	}
}