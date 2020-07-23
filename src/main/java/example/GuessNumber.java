package example;

import java.util.ArrayList;
import java.util.List;

public class GuessNumber {
    public String guess(int[] guessNum, int[] answer) {
        int answerIndex;
        int guessIndex;
        int countA = 0;
        int countB = 0;
        String result;
        ArrayList<Integer> answerList = new ArrayList<>();
        ArrayList<Integer> guessList = new ArrayList<>();
        for(int i = 0; i< answer.length; i++){
            answerList.add(i, answer[i]);
        }
        for(int i = 0; i< guessNum.length; i++){
            guessList.add(i, guessNum[i]);
        }

        for(int i = 0; i < guessNum.length; i++){
            if(answerList.contains(guessList.get(i))){
                countB++;
                if(answerList.get(i) == guessList.get(i)){
                    countA++;
                }
            }
        }
        result = String.format("%dA%dB", countA, (countB - countA));
        return result;

    }

    public boolean isLegalGuessNum(int[] guessNum) {
        if(guessNum.length != 4){
            return false;
        }
        for(int index = 0; index < guessNum.length; index++){
            if(guessNum[index] < 0 || guessNum[index] > 9){
                return false;
            }
        }
        return true;
    }
}
