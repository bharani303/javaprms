package javaz;
import java.util.*;
public class quiz {
	public static void main (String []ds) {
		System.out.println("*************");
System.out.println("QUIZ  GAME ");
System.out.println("*************");
int r=0;
		 String[] q= {"1. What does CPU stand for?\r\n A) Central Process Unit\r\n B) Central Processing Unit\r\n C) Computer Personal Unit\r\n D) Central Performance Unit\n"
		 
		 	
		 		,"2. Which one is an input device?\r\n A) Monitor\n B) Printer\n C) Keyboard\n D) Speaker\n"

		 		, "3. Which of the following is software?\r\n A) Mouse\r\n A) Mouse\n B) RAM\n C) MS Word\n d) Hard Disk\n"
		 };
		 			
		 String[]  ans= {"B","A","c" };
		 

		 for(int i=0;i<=q.length;i++) {
			 System.out.println(q[i]);
			Scanner sc=new Scanner(System.in);
			System.out.println("enter  your  ans:");
			String get =sc.nextLine().toUpperCase();
			if(get.equals(ans[i])){
			System.out.println("u right");	
			r++;
			
		 }
			else {
				System.out.println("u worng");	
			}
		
		
		
		
	}

	System.out.println("total score("+r+"out of 3)");
}
}
