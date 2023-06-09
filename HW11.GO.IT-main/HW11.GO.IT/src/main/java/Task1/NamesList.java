package Task1;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;


public class NamesList {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ivan", "Petro", "John", "Bill", "Ivan", "Alice", "Mykola", "Sam");

        int[] i = {0};


        AtomicInteger index1 = new AtomicInteger(1);

        String filteredNames = names.stream()
                .map(name -> index1.getAndIncrement() + ". " + name)
                .filter(name -> index1.get() % 2 == 0)
                .collect(Collectors.joining(", "));

                System.out.println(filteredNames);
    }
}
