public class insertionSort {

    public static void main(String[] arg) {

        int[] arr1 = {-3, -6, 1, -10000, -4, 0, 4, 8, 2, 5, 9, 22, 66, 2678, 54, 1};
        printBefore(arr1);
        sort(arr1);
        printAfter(arr1);
    }

    public static void insertion(int array[]) {

        for (int checking = 1; checking < array.length; checking++) {
            int toMove = array[checking];
            int i = checking-1;
            while ( (i > -1) && ( array [i] > toMove ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = toMove;
            print(array);
        }

    }

    public static void sort(int[] array) {

        for (int c = 1; c < array.length; c++) { // c = checking
            int m = c; // m = moving element

            while ( (m > 0) && ( array [m] < array[m-1] ) ) {
                swap(m, m-1, array);
                m--;
                print(array);
            }
        }

    }

    public static void swap(int m, int king, int[] arr) {

        int stored = arr[m];
        arr[m] = arr[king];
        arr[king] = stored;

    }

    public static void print(int[] arr) {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i] + ", ";
        }
        System.out.println(s);
    }
    public static void printBefore(int[] arr) {
        String s = "";
        System.out.println("Before Sorting:");
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i] + ", ";
        }
        System.out.println(s);
        System.out.println("__________________");
    }
    public static void printAfter(int[] arr) {
        String s = "";
        System.out.println("__________________");
        System.out.println("After Sorting:");

        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i] + ", ";
        }
        System.out.println(s);

    }
}

