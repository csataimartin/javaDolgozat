public class Functions {

    public int dividersNumber(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    public int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public Object fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return number;
        }
    }

    public boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }}