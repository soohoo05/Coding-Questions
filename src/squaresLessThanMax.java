import java.util.ArrayList;
import java.util.Scanner;
/*
* question: create a method that will find all the squares that are less than the max number inputted
* ex: max=10, perfect squares: 1,4,9. method will return arrayList with elements 1, 2 and 3.
*/
public class squaresLessThanMax {
   public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);  // Reading from System.in
      System.out.println("Enter a number greater then 0 for n: ");
         int n = reader.nextInt();
      
      if(n<=0){
         System.out.print("n needs to be greater then 0, try again");
         System.exit(1);
      }//if
      
      ArrayList<Integer>Squares=squaresLTM(n);
      for(int i=0;i<Squares.size();i++){
         System.out.println(Squares.get(i)+" ("+squared(Squares.get(i))+") is a square less than "+n);
      }
   }//main
   
   private static Integer squared(Integer integer) {
      return integer*integer;
   }
   
   private static ArrayList<Integer> squaresLTM(int n) {
      ArrayList<Integer> squares=new ArrayList<Integer>();
      for(int i=1;i<n;i++){
         if(i*i<n){
            squares.add(i);
         }//if
      }//for
      return squares;
   }//squaresLessThanMax
}//class
