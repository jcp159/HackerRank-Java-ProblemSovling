import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        double posCount = 0;
        double negCount = 0;
        double zeroCount = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                posCount += 1;
            } else if (arr.get(i) < 0) {
                negCount += 1;
            } else {
                zeroCount += 1;
            }
        }

        System.out.println(String.format("%.5f", posCount/arr.size()));
        System.out.println(String.format("%.5f", negCount/arr.size()));
        System.out.println(String.format("%.5f", zeroCount/arr.size()));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
