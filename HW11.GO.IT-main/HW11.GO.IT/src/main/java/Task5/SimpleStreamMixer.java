package Task5;


import java.util.*;
import java.util.stream.Stream;

public class SimpleStreamMixer {

    public static void main(String[] args) {
        List<Integer> first1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> second2 = Arrays.asList(1, 2, 3, 4, 5, 6, 9);

        zip(first1.stream(), second2.stream()).forEach(System.out::print);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {


        List<T> firstList = first.toList();
        List<T> secondList = second.toList();
        int limit = 2 * Math.min(firstList.size(), secondList.size());
        Iterator<T> iterator1 = firstList.stream().iterator();
        Iterator<T> iterator2 = secondList.stream().iterator();

        return Stream.iterate(true, b -> b)
                .flatMap(b -> Stream.of(iterator1.next(), iterator2.next()))
                .limit(limit);

    }
}