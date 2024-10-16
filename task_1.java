import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner reader=new Scanner(System.in);
       int num=5;
       System.out.print("Guess the number: ");
       int guess1= reader.nextInt();
       printing(check(guess1, num));
       if(!check(guess1, num).equals("equal")){
           System.out.print("Guess the number: ");
           int guess2= reader.nextInt();
           printing(check(guess2, num));
           if(!check(guess2, num).equals("equal")){
               System.out.print("Guess the number: ");
               int guess3= reader.nextInt();
               if(!check(guess3, num).equals("equal")){
                   System.out.println("You lost!");
               }else{
                   printing("equal");
               }
           }
       }
   }


   public static String check(int num, int og){


       if(num==og){
           return "equal";
       }else{
           if(num<og){
               return "smaller";
           }else{
               return "bigger";
           }
       }
   }
   public static void printing(String a){
       if(a.equals("equal")){
           System.out.println("This guess is correct. Congratulations!");
       }else{
           if(a.equals("smaller")){
               System.out.println("This guess is smaller than the correct number.");
           }else{
               if(a.equals("bigger")){
                   System.out.println("This guess is bigger than the correct number.");
               }
           }
       }
   }
}
