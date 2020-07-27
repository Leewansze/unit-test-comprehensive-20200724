package example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AnswerGenerator answerGenerator = new AnswerGeneratorImp();
        GuessNumber guessNumber = new GuessNumber();
        int []answer = answerGenerator.answerNumber();
        Scanner sc = new Scanner(System.in);

        int[] guess = new int[4];
        int countInputTime = 0;
        while(sc.hasNextShort()){
            for(int i = 0; i < guess.length; i++){
                guess[i] = sc.nextInt();
            }
            if(!(guessNumber.isLegalGuessNum(guess))){
                System.out.println("illegal number input, try again");
                continue;
            }
            if(!(guessNumber.isDuplication(guess))){
                System.out.println("Can't have duplicate numbers, try again");
                continue;
            }
            countInputTime++;
            if(countInputTime >= 6){
                break;
            }
            System.out.println(guessNumber.guess(guess, answer));
        }
        System.out.printf("The answer is\n");
        for(int i = 0;i < answer.length; i++){
            System.out.print(answer[i]);
        }
    }
}
