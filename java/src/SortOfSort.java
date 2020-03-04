public class SortOfSort {
    public static void sortOfSort(int[] nums) {
        int begin = 1;
        int end = nums.length - 1;
        int max = nums[0];
        int counter = 0;
        while (begin != end) {
            for (int i = end; i > begin; i--) {
                if (nums[i] > max) {
                    max = nums[i];
                }
                if (counter % 2 == 0) {

                }
            }
            counter++;
        }
    }
}