package io.codelex.trivia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Question {

    private final String question;
    private final int answer;
    private final List<Integer> integerList;

    public Question(String answer, String question) {
        this.question = question;
        this.answer = Integer.parseInt(answer);

        integerList = new ArrayList<>();
        integerList.add(this.answer);
        generateWrongAnswers(this.answer);
        Collections.sort(integerList);
    }

    private void generateWrongAnswers(int answer) {
        Random rand = new Random();
        while (integerList.size() < 4) {
            int num = rand.nextInt(answer * (rand.nextInt(3) + 1)) + 1; // unfortunately it is still somewhat predictable
            if (!integerList.contains(num)) {
                integerList.add(num);
            }
        }
    }

    public String getQuestion() {
        return question;
    }

    public int getAnswer() {
        return answer;
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

}
