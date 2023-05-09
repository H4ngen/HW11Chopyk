package Task3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LitteredStream {

    public static void main(String[] args) {


        String[] numbersOther = {"1, 2, 0", "4, 5"};
        System.out.println(Arrays.toString(numbersOther));


        System.out.println(Arrays.stream(numbersOther)
                .flatMap(n -> Arrays.stream(n.split("\\s*,\\s*")))
                .sorted()
                .collect(Collectors.joining(", ", "\"", "\"")));


    }
}
