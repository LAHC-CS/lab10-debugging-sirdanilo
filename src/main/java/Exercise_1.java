class Exercise_1 {

    public static int numElements = 100;

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: ./Exercise_1 value");
            return;
        }

        int n = Integer.parseInt(args[0]);

        int[] arr = new int[numElements];

        for (int i = 0; i < numElements; i++) {
            arr[i] = i;
        }

        findDivisibleBy(arr, n);
    }

    public static void findDivisibleBy(int arr[], int n) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % n == 0) {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println();
    }
}
