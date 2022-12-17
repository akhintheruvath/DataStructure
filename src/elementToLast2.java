public class elementToLast2 {
    public static void main(String[] args) {
        int[] arr = { 6, 1, 10, 8, 6, 10, 15, 10, 6, 10, 12, 6, 10, 30, 10 };
        int len = arr.length;
        int j = len - 1;
        int i = 0;
        while (i < j) {
            if (arr[i] == 10) {
                while (arr[j] == 10 && i<j) {
                    --j;
                }
                arr[i] = arr[j];
                arr[j] = 10;
            }
            ++i;
        }

        for (i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}