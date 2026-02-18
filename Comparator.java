//20-01-26 Find the Largest & Smallest element in an array

class Comparator {

    int largest(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    int smallest(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}

class Main {
    public static void main(String[] args) {

        int l, s;
        int arr[] = {1, 2, 3, 4, 5};

        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        Comparator obj = new Comparator();

        l = obj.largest(arr);
        s = obj.smallest(arr);

        System.out.println("\nLargest element : " + l);
        System.out.println("Smallest element : " + s);
    }
}

