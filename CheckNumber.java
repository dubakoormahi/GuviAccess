import java.util.*;
 class CheckNumber
 {
     public static void main(String[] args)
     {
         Scanner s=new Scanner(System.in);
         int s1=s.nextInt();
         if(s1>0)
         System.out.println("Positive");
         else if(s1<0)
         System.out.println("Negative");
         else
         System.out.println("Zero");
     }
 }
