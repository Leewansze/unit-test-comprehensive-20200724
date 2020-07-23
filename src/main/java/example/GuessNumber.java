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
        List<Integer> answerList = new ArrayList<>();
        List<Integer> guessList = new ArrayList<>();
        for(int i = 0; i< answer.length; i++){
            answerList.add(answer[i]);
        }
        for(int i = 0; i< guessNum.length; i++){
            guessList.add(guessNum[i]);
        }

        for(int i = 0; i < guessNum.length; i++){
            if(answerList.contains(guessList.get(i))){
                answerIndex = answerList.indexOf(answerList.get(i));
                guessIndex = guessList.indexOf(guessList.get(i));
                if(answerIndex == guessIndex){
                    countA++;
                }else{
                    countB++;
                }
            }
        }
        result = String.format("%dA%dB", countA, countB);
        return result;

    }
}
