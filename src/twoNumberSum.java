import java.util.HashSet;

class twoNumberSum {
    public static void main(String[] args) {
        int[] arr = { 6, 5, 7, 9, 4, 0, 2 };
        int target = 10;
        int[] result = new int[2];
        result = sumElements(arr, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public static int[] sumElements(int[] arr, int target) {
        HashSet<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            int match = target - elem;
            if (numberSet.contains(match)) {
                return new int[] { elem, match };
            } else {
                numberSet.add(elem);
            }
        }
        return new int[] { 0 };
    }
}