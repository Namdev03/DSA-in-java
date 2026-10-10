
import java.util.regex.*;
import java.util.*;

public class Main {

    static Map<String, Integer> numbers = new HashMap<>();

    static {
        numbers.put("zero", 0);
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);
        numbers.put("six", 6);
        numbers.put("seven", 7);
        numbers.put("eight", 8);
        numbers.put("nine", 9);
    }

    public static void main(String[] args) {
        String input = "threeplustwominuseightplussix";

        Pattern pattern = Pattern.compile(
            "zero|one|two|three|four|five|six|seven|eight|nine|plus|minus"
        );
        Matcher matcher = pattern.matcher(input);
        List<String> tokens = new ArrayList<>();

        int position = 0;

        while (matcher.find()) {
            if (matcher.start() != position) {
                System.out.println("Invalid input");
                return;
            }

            tokens.add(matcher.group());
            position = matcher.end();
        }

        if (position != input.length() || tokens.isEmpty()
                || tokens.size() % 2 == 0) {
            System.out.println("Invalid input");
            return;
        }

        int result = numbers.get(tokens.get(0));

        for (int i = 1; i < tokens.size(); i += 2) {
            String operator = tokens.get(i);
            int number = numbers.get(tokens.get(i + 1));

            if (operator.equals("plus")) {
                result += number;
            } else if (operator.equals("minus")) {
                result -= number;
            }
        }

        String[] words = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
        };

        StringBuilder output = new StringBuilder();

        for (char digit : String.valueOf(Math.abs(result)).toCharArray()) {
            output.append(words[digit - '0']);
        }

        if (result < 0) {
            output.insert(0, "minus");
        }

        System.out.println(output.reverse());
    }
}
