public class array_k_rotate {
    public static void rotate(int array[], int k) {
        if (array == null || array.length < 0 || k < 0) {
            System.out.println("Input error : re enter the input values");

        }
        if (k > array.length) {
            k = k % array.length;
        }
        int section1 = array.length - k;
        reverse(array, 0, section1 - 1);
        reverse(array, section1, array.length - 1);
        reverse(array, 0, array.length - 1);
        for (int i : array) {
            System.out.print("\t" + i);

        }

    }

    public static void reverse(int array[], int section1, int section2) {
        if (array == null | array.length == 1) {
            return;
        }
        while (section1 < section2) {
            int temp = array[section1];
            array[section1] = array[section2];
            array[section2] = temp;
            section1++;
            section2--;
        }
    }

    public static void main(String args[]) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int k = 3;
        for (int i : array) {
            System.out.print("\t" + i);

        }
        System.err.println("");
        rotate(array, k);

    }
}
