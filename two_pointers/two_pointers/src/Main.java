import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 3};

        if (nums.length == 0) {
            System.out.println("Результат: []");
            return;
        }

        int j = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        int[] result = Arrays.copyOf(nums, j + 1);

        System.out.println("Результат: " + Arrays.toString(result));
    }
}