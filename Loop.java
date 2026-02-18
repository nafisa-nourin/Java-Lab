//13-01-26 Implementation of loops in java

public class Loop {

    void whileLoop() {
        int i = 0;
        System.out.println("While Loop:");
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    void doWhileLoop() {
        int j = 0;
        System.out.println("Do-While Loop:");
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 3);
        System.out.println();
    }

    void forLoop() {
        System.out.println("For Loop:");
        int arr[] = {10, 20, 30};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Loop obj = new Loop();
        obj.whileLoop();
        obj.doWhileLoop();
        obj.forLoop();
    }
}

