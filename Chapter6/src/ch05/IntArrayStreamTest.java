package ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        for ( int num: arr){
            System.out.println(num);
        }
        Arrays.stream(arr).forEach(n-> System.out.println(n)); //int stream반환

        IntStream is = Arrays.stream(arr);
        is.forEach(n->System.out.println(n));
        //is를 한번 사용했으면 다시 호출을 해야한다.

        long sum=Arrays.stream(arr).sum();
        System.out.println(sum);

    }
}
