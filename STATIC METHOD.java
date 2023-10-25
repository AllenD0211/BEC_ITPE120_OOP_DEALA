public class StaticMethod {

    public static void main(String[] args) {
        int[] numbers = { 2,4,6,7,3,1,9 };
        int average = average(numbers);

        System.out.println("Average: " + average);
    }
    public static int average(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
         int  sum = 0;
        for (int number = 0; number < 10; number++) {
            sum += number;
        }
        return (int) (sum / numbers.length);
    }
}