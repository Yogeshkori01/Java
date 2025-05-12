public class Main {
    public static void main(String[] args) {
        int[] arr = {10, -4, 7, -1, 0, -9, 3};

       
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                result[index] = arr[i];
                index++;
            }
        }

for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
        }

        System.out.print("answer");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
