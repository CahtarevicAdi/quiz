package ba.shop;

import java.util.List;

public class Question {
    private String text;
    private List<String>answers;
    private int correctAnswerIndex;

    public Question(String text, List<String>answers, int correctAnswerIndex) {
        this.text = text;
        this.answers = answers;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getText() {
        return text;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
    public static void main(String[]args){

    }
}