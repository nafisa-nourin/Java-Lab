//27-01-26 Specialised Square Matrix Processor

class Matrix {
    int a[][] = {{1, 0}, {0, 1}};

    void displayProperties() {
        System.out.println("Rows: " + a.length);
        System.out.println("Columns: " + a[0].length);
    }
}

class SquareMatrix extends Matrix {

    void displayProperties() {
        super.displayProperties();
        int trace = 0;
        for (int i = 0; i < a.length; i++) {
            trace += a[i][i];
        }
        System.out.println("Trace: " + trace);
    }

    void checkIdentity() {
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j && a[i][j] != 1)
                    flag = false;
                if (i != j && a[i][j] != 0)
                    flag = false;
            }
        }

        if (flag)
            System.out.println("Identity Matrix");
        else
            System.out.println("Not an Identity Matrix");
    }

    public static void main(String args[]) {
        SquareMatrix sm = new SquareMatrix();
        sm.displayProperties();
        sm.checkIdentity();
    }
}

