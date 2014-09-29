package classPTB2;


public class PTB2 {
    static String giai(double a, double b, double c){
    	String str = new String();
	    double delta, x1,x2;
	    delta= (b*b)-(4*a*c);
		        if(delta<0){
		        //System.out.println("Vo Nghiem");
		        str = "Vo Nghiem";
		        //return str;
		        }else if(delta==0){
		          x1= -b/(2*a);
		          //System.out.println(x1);
		          str = x1+"";
		          //return str;
		        }else if(delta>0){
		          x1=(-b+Math.sqrt(delta))/(2*a);
		          x2=(-b-Math.sqrt(delta))/(2*a);
		          System.out.println(x1 +"  "+x2);
		          str = x1+""+" "+x2+"";
		         // return str;
		        }
		        return str;
	     }
    
 }
 