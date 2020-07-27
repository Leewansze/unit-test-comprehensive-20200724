package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class GuessNumberTest {
    @Test
    void should_return_4A0B_when_guess_given_answer_1234_and_input_guess_1234() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        AnswerGenerator answerGenerator = mock(AnswerGeneratorImp.class);
        when(answerGenerator.answerNumber()).thenReturn(new int[]{1, 2, 3, 4});

        int[] guessNum = {1,2,3,4};
        int[] answer = answerGenerator.answerNumber();

        //when
        String result = guessNumber.guess(guessNum, answer);

        //then
        assertEquals("4A0B",result);
    }

    @Test
    void should_return_0A0B_when_guess_given_answer_1234_and_input_guess_5678() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        AnswerGenerator answerGenerator = mock(AnswerGeneratorImp.class);
        when(answerGenerator.answerNumber()).thenReturn(new int[]{1, 2, 3, 4});

        int[] guessNum = {5,6,7,8};
        int[] answer = answerGenerator.answerNumber();

        //when
        String result = guessNumber.guess(guessNum, answer);

        //then
        assertEquals("0A0B", result);
    }

    @Test
    void should_return_0A4B_when_guess_given_answer_1234_and_input_guess_4312() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.answerNumber()).thenReturn(new int[]{1, 2, 3, 4});

        int[] guessNum = {4,3,1,2};
        int[] answer = answerGenerator.answerNumber();

        //when
        String result = guessNumber.guess(guessNum, answer);

        //then
        assertEquals("0A4B", result);
    }

    @Test
    void should_return_0A2B_when_guess_given_answer_1234_and_guess_3456() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.answerNumber()).thenReturn(new int[]{1, 2, 3, 4});

        int[] guessNum = {3,4,5,6};
        int[] answer = answerGenerator.answerNumber();

        //when
        String result = guessNumber.guess(guessNum, answer);

        //then
        assertEquals("0A2B", result);
    }

    @Test
    void should_return_2A2B_when_guess_given_answer_1234_and_guess_1243() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        int[] guessNum = {1,2,4,3};
        int[] answer = {1,2,3,4};

        //when
        String result = guessNumber.guess(guessNum, answer);

        //then
        assertEquals("2A2B", result);
    }

    @Test
    void should_return_2A0B_when_guess_given_answer_1234_and_guess_1256() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.answerNumber()).thenReturn(new int[]{1, 2, 3, 4});

        int[] guessNum = {1,2,5,6};
        int[] answer = answerGenerator.answerNumber();

        //when
        String result = guessNumber.guess(guessNum, answer);

        //then
        assertEquals("2A0B", result);
    }

    @Test
    void should_return_false_when_judge_guess_number_legal_given_input_number_12234(){
        //given
        GuessNumber guessNumber = new GuessNumber();
        int[] guessNum = {12,2,3,4};

        //when
        boolean result = guessNumber.isLegalGuessNum(guessNum);

        //then
        assertEquals(false, result);
    }

    @Test
    void should_return_wrong_input_when_guess_more_than_6_given_answer_1234() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.answerNumber()).thenReturn(new int[]{1, 2, 3, 4});

        int[] guessNum = {4,5,7,9};
        int[] answer = answerGenerator.answerNumber();

        //when
        String result = null;
        for(int i = 0; i < 8; i++){
            result = guessNumber.guess(guessNum, answer);
        }

        //then
        assertEquals("wrong input", result);
    }

    @Test
    void should_return_false_when_guess_number_duplication_given_guess_input_number_1123() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        int[] guessNum = {1,1,2,3};

        //when
        boolean result = guessNumber.isDuplication(guessNum);

        //then
        assertEquals(false, result);
    }
}
