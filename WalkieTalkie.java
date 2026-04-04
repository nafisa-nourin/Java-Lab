
class RadioChannel {
    boolean isQuestionTurn = true;

    synchronized void askQuestion(String msg) {
        try {
            if (!isQuestionTurn)
                wait();

            System.out.println("Question: " + msg);
            isQuestionTurn = false;
            notify();
        } catch (Exception e) {}
    }

    synchronized void answerQuestion(String msg) {
        try {
            if (isQuestionTurn)
                wait();

            System.out.println("Answer: " + msg);
            isQuestionTurn = true;
            notify();
        } catch (Exception e) {}
    }
}

class QuestionThread extends Thread {
    RadioChannel rc;
    String[] questions = {"Hi?", "How are you?", "Bye"};

    QuestionThread(RadioChannel rc) {
        this.rc = rc;
    }

    public void run() {
        for (String q : questions)
            rc.askQuestion(q);
    }
}

class AnswerThread extends Thread {
    RadioChannel rc;
    String[] answers = {"Hello!", "Fine!", "Goodbye!"};

    AnswerThread(RadioChannel rc) {
        this.rc = rc;
    }

    public void run() {
        for (String a : answers)
            rc.answerQuestion(a);
    }
}

public class WalkieTalkie {
    public static void main(String[] args) {
        RadioChannel rc = new RadioChannel();

        new QuestionThread(rc).start();
        new AnswerThread(rc).start();
    }
}