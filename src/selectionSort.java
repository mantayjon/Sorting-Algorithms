
public class selectionSort {

    public static void main(String[] arg) {

        int[] arr1 = {-3,-6,1,-10000,-4,0,4,8,2,5,9,22,66,2678,54,1};

        sort(arr1);
    }

    public static void sort(int[] arr) {
        System.out.println("before sorting: ");
        print(arr);
        System.out.println("________");

        for (int king = 0; king <= arr.length - 1; king++) {
            int jack = king; //off
            for (int queen = king + 1; queen < arr.length; queen++) {
                if (arr[jack] > arr[queen]) {
                    jack = queen;
                }
                swap(king, jack, arr);
            }
        }
        System.out.println("after sorting: ");
        print(arr);
    }

    public static void swap(int king, int jack, int[] arr) {

        int stored = arr[king];
        arr[king] = arr[jack];
        arr[jack] = stored;

    }

    public static void print(int[] arr) {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i] + ", ";
        }
        System.out.println(s);
    }
}
