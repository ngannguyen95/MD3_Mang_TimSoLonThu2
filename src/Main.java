public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 6, 4, 9, 7};
        int max = 0;
        int max2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max2 = max;
//                max=arr[i];
            }
        }
        System.out.println("Max2: " + max2);

    }
}