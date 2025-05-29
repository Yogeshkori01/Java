class Main {
    public static void main(String[] args) {
        int[] arr = {12, -7, 5, -3, -1, 9, -2, 4};

        System.out.print("Original array: ");
        printArray(arr);

        rearrange(arr);

        System.out.print("Rearranged array: ");
        printArray(arr);
    }

    public static void rearrange(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
