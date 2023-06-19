package io.codelex.trivia;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class GenerateQuestionMap {

    private final Map<String, String> questionMap;

    public GenerateQuestionMap(URL url) throws URISyntaxException, InterruptedException, IOException {
        questionMap = convertJSONToMap(getJSON(url));
    }

    private String getJSON(URL url) throws URISyntaxException, InterruptedException, IOException {
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder().uri(url.toURI()).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    private Map<String, String> convertJSONToMap(String json) throws JsonProcessingException {
        //why make your life harder if you can just do this:
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, Map.class);
    }

    public Map<String, String> getQuestionMap() {
        return questionMap;
    }
}
