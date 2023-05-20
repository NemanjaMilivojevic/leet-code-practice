import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {10, 13, 14, 16, 25, 30, 32};
        System.out.println(countDivisibleBy(arr, 17));
        System.out.println(anyDivisibleBy(arr, 2));
        System.out.println(Arrays.toString(summing(5)));
        System.out.println(isArmstrong(371));

    }

    public static int countDivisibleBy(int[] arr, int x) {

        return (int) Arrays.stream(arr)
                .filter(i -> i % x == 0)
                .count();
    }

    public static boolean anyDivisibleBy(int[] arr, int x) {

        return Arrays.stream(arr).anyMatch(i -> i % x == 0);
    }

    public static int [] summing(int x){
        int [] arr = new int[9];
        int sum = 0;
        for (int i = 0; i<9; i ++){
            sum += x;
            arr[i] = sum;
        }
        return arr;
    }

        public static boolean isArmstrong(int number) {
            int originalNumber = number;
            int result = 0;
            int digits = String.valueOf(number).length();

            while (number > 0) {
                int remainder = number % 10;
                result += Math.pow(remainder, digits);
                number /= 10;
            }

            return result == originalNumber;
        }
    }
