import java.util.*;
public class Main {
  public static void main(String[] args) {
  int g=0;
  int r=0;
   Scanner scan=new Scanner(System.in);
   System.out.print("Enter units :");
   g=scan.nextInt();
     if (g<=100) {
     r = g*5;
      System.out.println(r);
     }
     else if(g>=100 && g<=150){
    int tp1=g-100;
    r=500+tp1*7;
    System.out.println(r); 
    }
    else if(g>=150 && g<=200){
    int tp1=g-150;
    r=850+tp1*8;
    System.out.println(r); 
    }}}
