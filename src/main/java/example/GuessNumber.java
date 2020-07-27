package example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GuessNumber{
    private int guessTimes;

    public GuessNumber() {
        this.guessTimes = 0;
    }

    public String guess(int[] guessNum, int[] answer) {
        if(!(vailInputTime(answer))){
            return "wrong input";
        }
        int correctNum = 0;
        int correctPosition = 0;
        String result;
        List<Integer> answerList = Arrays
                .stream(answer)
                .boxed()
                .collect(Collectors.toList());;
        List<Integer> guessList = Arrays
                .stream(guessNum)
                .boxed()
                .collect(Collectors.toList());

        for(int i = 0; i < guessNum.length; i++){
            if(answerList.contains(guessList.get(i))){
                correctPosition++;
                if(answerList.get(i).equals(guessList.get(i))){
                    correctNum++;
                }
            }
        }
        result = String.format("%dA%dB", correctNum, (correctPosition - correctNum));
        return result;

    }

    public boolean isLegalGuessNum(int[] guessNum) {
        if(guessNum.length != 4){
            return false;
        }
        return Arrays.stream(guessNum).noneMatch(i -> i < 0 || i > 9);
    }

    public Boolean vailInputTime(int[] guessNum) {
        boolean valid = true;
        this.guessTimes++;
        if(this.guessTimes > 6){
            valid = false;
        }
        return valid;
    }
}
