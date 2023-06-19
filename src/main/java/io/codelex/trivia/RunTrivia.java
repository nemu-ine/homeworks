package io.codelex.trivia;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Scanner;

public class RunTrivia {

    public static int currentWins = 0;
    public static boolean hasWrongAnswer = false;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws URISyntaxException, InterruptedException, IOException {

        GenerateRandomURL randomURL = new GenerateRandomURL();
        GenerateQuestionMap questions = new GenerateQuestionMap(randomURL.getURL());
        GenerateTemplate template = new GenerateTemplate(questions.getQuestionMap());

        for (Question question : template.getQuestionList()) {
            System.out.println(question.getQuestion());
            List<Integer> integerList = question.getIntegerList();
            System.out.println("Options: " + integerList);

            System.out.println("Enter your guess:");
            int guess = input.nextInt();

            while (!integerList.contains(guess)) {
                System.out.println("Incorrect answer, please enter again: " + integerList);
                guess = input.nextInt();
            }

            if (guess != question.getAnswer()) hasWrongAnswer = true;

            if (hasWrongAnswer) {
                System.out.println("Correct answer : " + question.getAnswer());
                break;
            }
            currentWins++;
            System.out.println();
        }
        System.out.println("Correctly guessed: " + currentWins);

    }

}
