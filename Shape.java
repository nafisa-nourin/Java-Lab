//20-01-26 Area & Perimeter using method overriding

class Shape {
    void area() {}
    void perimeter() {}
}

class Circle extends Shape {
    int r = 5;

    void area() {
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }

    void perimeter() {
        System.out.println("Perimeter of Circle = " + (2 * 3.14 * r));
    }
}

class Square extends Shape {
    int s = 4;

    void area() {
        System.out.println("Area of Square = " + (s * s));
    }

    void perimeter() {
        System.out.println("Perimeter of Square = " + (4 * s));
    }
}

class Rectangle extends Shape {
    int l = 6, b = 3;

    void area() {
        System.out.println("Area of Rectangle = " + (l * b));
    }

    void perimeter() {
        System.out.println("Perimeter of Rectangle = " + (2 * (l + b)));
    }
}

class Main {
    public static void main(String args[]) {
        Shape s;

        s = new Circle();
        s.area();
        s.perimeter();

        s = new Square();
        s.area();
        s.perimeter();

        s = new Rectangle();
        s.area();
        s.perimeter();
    }
}

