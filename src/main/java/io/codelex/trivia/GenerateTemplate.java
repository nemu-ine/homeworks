package io.codelex.trivia;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GenerateTemplate {

    private final List<Question> questionList;

    public GenerateTemplate(Map<String, String> questions) {
        questionList = new ArrayList<>();
        questions.forEach((key, value) -> questionList.add(new Question(key, value)));
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

}
