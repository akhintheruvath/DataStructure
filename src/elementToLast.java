public class elementToLast {
    public static void main(String[] args) {
        int[] arr = { 6, 1, 10, 8, 6, 20, 15, 6, 3, 6, 30 };
        int i = 0;
        int len = arr.length;
        int n = len;
        while (i < n - 1) {
            if (arr[i] == 6) {
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[n - 1] = 6;
                --n;
            } else
                ++i;
        }

        for (int k = 0; k < len; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
