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
}
