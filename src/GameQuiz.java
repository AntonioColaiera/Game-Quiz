
import java.util.Scanner;


public class GameQuiz {

	public static void main(String[] args) {
		
String [][] quiz = {
		{"who won the golden ball in 2000?", "Luis Figo" },
		{"who won the golden ball in 2001?", "Michael Owen"},
		{"who won the golden ball in 2002?", "Ronaldo"},
		{"who won the golden ball in 2003?", "Pavel Nedved"},
		{"who won the golden ball in 2004?", "Andriy Shevchenko"}	
}; 

 int playerScore = 0; // initialize score to 0 
 
 for (int i = 0; i < quiz.length; i++) {
	 String question = quiz[i][0]; 
	 String answer= quiz[i][1]; 
	 
	 System.out.println("Hey, Can you answer at this question: " + question);
	 Scanner scanner = new Scanner (System.in); 
	String userAnswer = scanner.nextLine(); 
	
	if(userAnswer.equalsIgnoreCase(answer)){ 
		System.out.println("Well done!");
	}else {
		System.out.println("Ops! The correct answer is: " + answer + ".");
		
	};
	
	
	if(userAnswer.equalsIgnoreCase(answer)) {
		playerScore++; 
     } 
	
	System.out.println("Your final score is: " + playerScore + "!");
 
 
	}
	}
	}


