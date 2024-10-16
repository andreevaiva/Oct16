import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.net.SocketOption;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Choose category \n1 - Science\n2 - History\n3 - Sport\n");
        int category= reader.nextInt();
        switch (category){
            case 1:
                scienceQuiz();
                break;
            case 2:
                historyQuiz();
                break;
            case 3:
                sportQuiz();
                break;
            default:
                System.out.println("Invalid category choice.");
        }
    }
    public static void scienceQuiz(){
        Scanner reader=new Scanner(System.in);
        System.out.println("What is the volume of a cube with a side 3 cm?(Write the unit)");
        if(reader.nextLine().equals("27cm^3")){
            System.out.println("Correct! You earned 1 point.");
        }else{
            System.out.println("Incorrect. The correct answer is 27cm^3.");
        }
    }
    public static void historyQuiz(){
        Scanner reader=new Scanner(System.in);
        System.out.println("What year did WW1 end?");
        if(reader.nextLine().equals("1918")){
            System.out.println("Correct! You earned 1 point.");
        }else{
            System.out.println("Incorrect. The correct answer is 1918.");
        }
    }
    public static void sportQuiz(){
        Scanner reader=new Scanner(System.in);
        System.out.println("How many players are needed in a volleyball game in order to play 5-1?");
        if(reader.nextLine().equals("7")){
            System.out.println("Correct! You earned 1 point.");
        }else{
            System.out.println("Incorrect. The correct answer is 7.");
        }
    }
}
