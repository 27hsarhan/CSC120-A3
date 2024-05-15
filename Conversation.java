import java.util.Scanner;
import java.util.ArrayList;
class Conversation {

  public static void main(String[] arguments) {
    ArrayList<String> transcript = new ArrayList<String>();
    // You will start the conversation here.
    //nRounds=input("How many rounds?: ")
    System.out.print("How many rounds?");
    transcript.add("How many rounds?");
    Scanner input = new Scanner(System.in);
    int nRounds = input.nextInt();
    input.nextLine(); //clearing new line character
    transcript.add(String.valueOf(nRounds));
    System.out.println("Hi there! What's on your mind?"); 
    transcript.add("Hi there! What's on your mind?");
    for (int i = 0; i < nRounds; i++){
       String user_input = input.nextLine();
      transcript.add(user_input);
      System.out.println("Uh-huh...");
      transcript.add("Uh-huh...");

//I -> you
// me -> you
// am -> are
// you -> I
// my -> your
// your -> my
      //String strArray[];
        //String inputArray = new strArray[];
      // pass lines through a new array, print the arry
      if(user_input.contains("you") 
         && user_input.contains("?")
         && user_input.contains("me")
         && user_input.contains("am")
         && user_input.contains("my")){
        this.user_input.replace("you", "I").replace("?", ".").replace("am","are").replace("my","your");
      }
      //System.out.println("Transcript:" + )
      //if input contains i:
        //print(f{"you" + input})
      //elif input contains am:
        //print(f{"are" + input})
    }
    System.out.println("Goodbye.");
    transcript.add("Goodbye.");
    System.out.println(transcript);
  }
}
