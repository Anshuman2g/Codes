package Arrays;

public class sortArr {
    static boolean sor(int[] arr, int i) {
        if (i == arr.length - 1)
            return true;
        return arr[i] < arr[i + 1] && sor(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 33, 4, 5 };
        System.out.println(sor(arr, 0));
    }
}
