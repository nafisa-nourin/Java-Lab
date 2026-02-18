//20-01-26 Grade Check using Switch Case

class GradeCheck {
    public static void main(String args[]) {
        int marks = 85;
        char grade;

        if (marks >= 90)
            grade = 'A';
        else if (marks >= 75)
            grade = 'B';
        else if (marks >= 60)
            grade = 'C';
        else
            grade = 'D';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Fail");
                break;
        }
    }
}

