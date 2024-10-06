    package ba.shop;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Quiz {
    private List<Question>questions;
    private int score;

    public Quiz(List<Question>questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions){
            System.out.println(question.getText());
            List <String> answers = question.getAnswers();

            for (int i = 0; i < answers.size(); i++) {
            System.out.println((i + 1) + ". " + answers.get(i));
        }

            System.out.println("Enter the number of your answer :");
            int userAnswer = scanner.nextInt();

            if (userAnswer - 1 == question.getCorrectAnswerIndex()) {
                System.out.println("Correct !\n");
                score++;
            } else {
                System.out.println("Incorrect ! The right answer is " + (question.getCorrectAnswerIndex() + 1 + "\n"));
            }
        }

        System.out.println("Quiz completed. Your score : " + score + "/" + questions.size());
    }

    public static void main(String[] args) {
        // Kreiranje pitanja..

        List<Question>questions = new ArrayList<>();
        questions.add(new Question("What is the capital of France ?", List.of("Pariz", "Madrid", "Moscow", "Lisabon"), + 0));
        questions.add(new Question("Which planet is knows as the Red Planet ?", List.of("Uranus", "Saturn", "Earth", "Mars"), + 3));
        questions.add(new Question("Who is the first man on Planet Earth ?", List.of("Lucas", "Adem", "Faramir", "Lut"), + 1));
        questions.add(new Question("The main character of the famous trilogy 'The Lord of the Rings' is :", List.of("Faramir", "Gandalf", "Frodo", "Sam"), + 2));
        questions.add(new Question("What is the longest river in the world ?", List.of("Amazon", "Yangtze", "Volga", "Nile"), + 3));

        Quiz quiz = new Quiz(questions);

        quiz.startQuiz();

        System.out.println("Congratulations you won nothing hehehe...");
    }
}
