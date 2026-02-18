//27-01-26 Method overloading in Matrix Operations

class MatrixMath {

    void add(int matrix[][], int scalar) {
        System.out.println("Scalar Addition:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print((matrix[i][j] + scalar) + " ");
            }
            System.out.println();
        }
    }

    void add(int a[][], int b[][]) {
        System.out.println("Matrix Addition:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print((a[i][j] + b[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        MatrixMath obj = new MatrixMath();

        int m1[][] = {{1, 2}, {3, 4}};
        int m2[][] = {{5, 6}, {7, 8}};

        obj.add(m1, 2);
        obj.add(m1, m2);
    }
}

