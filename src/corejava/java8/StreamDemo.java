package corejava.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc","","bc","abcd","","jkl");
        List<String> filtered = strings.stream().filter(str->!str.isEmpty()).collect(Collectors.toList());
        System.out.println("Non empty string count : "+filtered.size());
        long count = strings.stream().filter(String::isEmpty).count();
        long cnt = strings.parallelStream().filter(String::isEmpty).count();
        System.out.println("Empty String count : "+cnt);
        String mergedString = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.joining(","));
        System.out.println("mergedString : "+mergedString);
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5);
        List<Integer> squareList = numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
        squareList.forEach(System.out::println);

        IntSummaryStatistics statistics = numbers.stream().mapToInt((num)-> num).summaryStatistics();
        System.out.println("Max : "+statistics.getMax());
        System.out.println("Min : "+statistics.getMin());
        System.out.println("Sum of all : "+statistics.getSum());
        System.out.println("Avg : "+statistics.getAverage());
    }
}
