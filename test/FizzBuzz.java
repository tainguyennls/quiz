import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FizzBuzz {

    public static void fizzBuzz(int loop) {
        for (int i = 1; i <= loop; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            int numberOfTestCase = Integer.parseInt(input.readLine());
            String strTest = input.readLine();
            StringTokenizer token = new StringTokenizer(strTest, " ");
            for (int k = 0; k < numberOfTestCase; k++) {
                fizzBuzz(Integer.parseInt(token.nextToken()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
