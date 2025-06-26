package javaz;

import java.util.*;
class quiz {
 public static void main(String[] args) {
 int t=0;
 int w=0;
 int l=0;
     
     while(w<4) {
      Random  r=new Random();
      int r1=r.nextInt(0,2);
      String array[]={"R","P","S"};
      String cm=array[r1];
     System.out.println("rock paper sessor game!\n win 3 game with me");
      System.out.println("please choose the option \n rock = r \n paper= p \n sessor= s");
      
while(w<3){
Scanner sc=new Scanner(System.in);
      System.out.print("enter the option:");
      String  get=sc.nextLine().toUpperCase();
     System.out.println("the  computer move  is:"+cm);
     if(get.equals(cm)){
          System.out.println("tie!");
      t++;
     }
     else if(get.equals("R") && !get.equals(array[r1]) && cm.equals("P") || get.equals("P") && !get.equals(array[r1]) && cm.equals("R") || get.equals("S") && !get.equals(array[r1]) && cm.equals("p")){
         w++;
         System.out.println("you win");
     }
    else{
        l++;
           System.out.println("you loss");
     }
System.out.println("totalscore: wins "+w+ "losses:  "+l+ "ties: "+t);
System.out.println("***************************************************************");
}
    System.out.println("thanks for your time");
 }
}}
