package javaz;



import java.util.*;
class quiz {
	
 public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        Random  r=new Random();
 boolean j=true;
		 double m=100;
 double lk=0;
 double rem=0;     
 
      
      System.out.println("****************************");
     System.out.println("welcome to Royel X gamblibing");
     System.out.println("*****************************");
      System.out.println("sign up bonuse 100$ credited to your account!");
      System.out.println("current  balance:100$");

  System.out.println("Symbols are :| 🚀 | 🍌 | 💎 | 🍸 | ");    
  
  while(j) {
	  
        
 
   System.out.print("Enter your bet amt:");
   double bet =sc.nextDouble();
   
   if(bet<=m && bet>0) {

	   System.out.println("spining...");
	   rem=m-bet;
  
   }    
   else if( bet<0) {
	   	   
	   System.out.println("invalid amt!!!");
	   }    
   else {
	   System.out.println("insufficent fund!!!");
	   System.out.println("please deposite fund !");
	   j=false;
	   
   }
   
  
 
   
   
	String[] array= {"🚀","🍌","💎","🍸"};
	
	 String[] sz =new String[4];
	 
	 for(int i=0;i<=3;i++) {
		 sz[i]= array[r.nextInt(array.length)]; 
		 
 }
	 
	 System.out.println(""+sz[0]+sz[1]+sz[2]);
	
	
	
	
	 if(sz[0].equals(sz[1]) && sz[0].equals(sz[2])  ){
	     
		 lk=bet*2;
		 System.out.println("you won:"+lk);
	
		
	 }
	 else if(sz[0].equals(sz[1]) || sz[0].equals(sz[2]) || sz[2].equals(sz[1]) || sz[2].equals(sz[0])|| 
			 sz[1].equals(sz[0]  )|| sz[1].equals(sz[2]))
			 {
			   
		 lk=bet*1.5;
		 System.out.println("you won:"+lk);
	
		 }
	 else {
		 System.out.println("better  luck  next time!");
	    
	     
	 }
	 
		
	m=rem+lk;
			System.out.println("current balance:"+m+"$");
			boolean b=true;
			while(b) {
			System.out.println("do you want to paly again ? press (Y/N) :");
			String  kp=sc.next().toUpperCase();
			if(kp.equals("N")){
				j=false;
				b=false;
			}
			else if(kp.equals("Y")){
				j=true;
				b=false;
			}
			else {
				System.out.println("please enter right string");
				
			}
}
		  System.out.println("*****************************");	
  }
    System.out.println("thank you !!!");
  }

	
 }


