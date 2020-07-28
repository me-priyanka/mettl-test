public class RoboticMovement{
	public static void meth(int a,int b,String in_pos,String com){
		int x,y,k=0;
		String res="";
		String[] s1 = in_pos.split("-");
		x = Integer.parseInt(s1[0]);
		y = Integer.parseInt(s1[1]);
		String d = s1[2];
		String[] c = com.split(" ");
		for(int i=0;i<c.length;i++){
			 if(d.equals("E")){
				 if(c[i].equals("L"))
					 d = "N";
				 else if(c[i].equals(("R")))
					 d ="S";
			     else
					 if(x<a)
						 x++;
					 else
						 k=1;
					     break;
			 }
			 else if(d.equals("W")){
				  if(c[i].equals("L"))
					  d= "S";
				  else if(c[i].equals("R"))
					   d="N";
				   else
					   if(x>0)
						   x--;
					   else
						   k =1;
					       break;
			 }
			 else if(d.equals("N")){
				 if(c[i].equals("L"))
					 d="W";
				 else if(c[i].equals("R"))
					 d ="E";
				 else
					 if(y<b)
						 y++;
					 else
						 k=1;
					     break;
			 }
			 else if(d.equals("S")){
				 if(c[i].equals("L"))
					 d = "E";
				 else if(c[i].equals("R"))
					 d ="W";
				 else
					 if(y>0)
						 y--;
					 else
						 k=1;
					     break;
			 }
		}
		if(k==0)
			res = res+x+"-"+y+"-"+d;
		else
			res = res+x+"-"+y+"-"+d+"-ER";
		System.out.print(res);
	}
}