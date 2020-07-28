public class UseIdGenerateration{
  	String sname = smallName(input1,input2);
  int l = sname.length();
  String id1 = sname.charAt(l-1)+"";
  StringBuffer id = new StringBuffer(id1);
  String lname = "";
  if(sname.equals(input1))
     lname = input2;
  else 
     lname = input1;
  id.append(lname);
  String s3 = input3+"";
  int l2 = s3.length();
  StringBuffer res = new StringBuffer();
  String s4 ="";
  for(int i=0;i<id.length();i++){
	  char c = id.charAt(i);
	  if(Character.isUpperCase(c))
	     s4 = Character.toLowerCase(c)+"";
	  else
	     s4 = Character.toUpperCase(c)+"";
	res.append(s4);
  }
  res.append(s3.charAt(input4-1)+"");
  res.append(s3.charAt(l2-input4)+"");
  return res.toString();
	}
	public String smallName(String fname,String lname){
		int l1 = fname.length();
		int l2 = lname.length();
		if(l1<l2)
		   return fname;
		else if(l1>l2)
		   return lname;
		else{
			char[] a1 = fname.toCharArray();
			char[] a2 = fname.toCharArray();
			for(int i =0;i<l1;i++){
				if(a1[i]<=a2[i])
				return fname;
				else if(a1[i]>a2[i])
				return lname;
			}
			return fname;
		}
		  
	}
    
		
	}
