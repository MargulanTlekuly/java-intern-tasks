public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 6, 7, 8};
        int targetSum = 11;

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];

            if (currentSum == targetSum) {
                System.out.println("Результат: " + numbers[left] + "+" + numbers[right] + " = " + targetSum);
                break;
            } else if (currentSum < targetSum) {
                left++;
            } else {
                right--;
            }
        }
    }
}