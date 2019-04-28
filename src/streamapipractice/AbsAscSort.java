package streamapipractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 数値を絶対値の昇順に並べるためのクラス。
 *
 */
public class AbsAscSort {

    /**
    * Stream APIとラムダ式を使用して
    * 数値を絶対値の昇順に並べる。
    *
    */
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(-2, 1, -6, 0, 3);

        // numbersを絶対値の昇順に並べ替えてListで返す。
        List<Integer> sorted = numbers.stream()
                .sorted((num1, num2) -> Math.abs(num1) - Math.abs(num2))
                .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(sorted);
    }

}
