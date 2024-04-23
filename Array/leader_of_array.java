class leader_of_array {

    public static void lead(int array[], int n) {
        int max = array[n - 1];
        System.out.println(max);
        for (int i = n - 2; i >= 0; i--) {
            if (array[i] > max) {
                max = array[i];
                System.out.println(max);
            }
        }
    }

    public static void main(String args[]) {
        int array[] = { 16, 17, 5, 3, 4, 2 };
        int n = array.length;
        lead(array, n);
    }
}
