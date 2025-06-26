package javaz;
import java.util.*;
public class quiz {
	public static void main (String []ds) {
		System.out.println("*************");
System.out.println("QUIZ  GAME ");
System.out.println("*************");
int r=0;


		 String[] q= {"1. What does CPU stand for?\r\n"
	            ,"2. Which one is an input device?\r\n "
		 		, "3. Which of the following is software?\r\n "	
		 		 };
		 
		 String[][] ans= {{" A) Central Process Unit\r\n B) Central Processing Unit\r\n C) Computer Personal Unit\r\n D) Central Performance Unit\n"},
				 {"A) Monitor\n B) Printer\n C) Keyboard\n D) Speaker\n"},
				 { "A) Mouse\n B) RAM\n C) MS Word\n d) Hard Disk\n"}				};
		 
		 String[]  anser= {"B","C","C" };
		
		 
		 for(int i=0;i<q.length;i++) {
			 System.out.println(q[i]);
			
			 for(int j=0;j<=i;j++) {
			      
			     System.out.println(ans[i][j]);
				 
				 
				 
				 System.out.print("enter  your  ans:");
				 Scanner sc= new Scanner(System.in);
					String get =sc.nextLine().toUpperCase();
					if(get.equals(anser[i])){
					    System.out.println("*************");
					System.out.println("u r right");	
					System.out.println("*************");
					r++;
					
				 }
					else {
					    System.out.println("*************");
						System.out.println("u r worng");
						System.out.println("*************");
					}
					break;
			 }
			
		 }
		
		 
		 
		 
		
		

			System.out.println("total score("+r+" out of 3)");		
		
	}
}
