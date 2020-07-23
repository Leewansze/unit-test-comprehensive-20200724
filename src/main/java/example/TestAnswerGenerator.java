package example;

import java.util.Random;

public class TestAnswerGenerator implements AnswerGeneratorImp {
    @Override
    public int[] answerNumber() {
        System.out.println("Success");
        int arr[] = new Random().ints(0, 9).distinct().limit(4).toArray();
        for(int i= 0; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
        return  arr;
    }
}
