public class elementToLast2 {
    public static void main(String[] args) {
        int[] arr = { 6, 1, 10, 8, 6, 10, 15, 10, 6, 10, 12, 6, 10, 30, 10 };
        int len = arr.length;
        int n = len - 1;
        int j = len - 1;
        int i = 0;
        while (i < n - 1) {
            if (arr[i] == 10) {
                while (arr[j] == 10) {
                    --j;
                }
                arr[i] = arr[j];
                arr[j] = 10;
                n = j;
            }
            ++i;
        }

        for (i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}