package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberTest {
    @Test
    void should_return_4A0B_when_guess_given_answer_1234_and_input_guess_1234() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        int[] guessNum = {1,2,3,4};
        int[] answer = {1,2,3,4};

        //when
        String result = guessNumber.guess(guessNum, answer);

        //then
        assertEquals("4A0B",result);
    }

    @Test
    void should_return_0A0B_when_guess_given_answer_1234_and_input_guess_5678() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        int[] guessNum = {5,6,7,8};
        int[] answer = {1,2,3,4};

        //when
        String result = guessNumber.guess(guessNum, answer);

        //then
        assertEquals("0A0B", result);
    }

    @Test
    void should_return_0A4B_when_guess_given_answer_1234_and_input_guess_4312() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        int[] guessNum = {4,3,1,2};
        int[] answer = {1,2,3,4};

        //when
        String result = guessNumber.guess(guessNum, answer);

        //then
        assertEquals("0A4B", result);
    }

    @Test
    void should_return_0A2B_when_guess_given_answer_1234_and_guess_3456() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        int[] guessNum = {3,4,5,6};
        int[] answer = {1,2,3,4};

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
}
