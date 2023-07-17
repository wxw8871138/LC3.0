package jianzhi;

public class minArray {
    public int minArray(int[] numbers) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (numbers[mid] > numbers[j]) {
                i = mid + 1;
            }
            if (numbers[mid] < numbers[i]) {

            }
        }
    }
}
