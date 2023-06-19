package io.codelex.trivia;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class GenerateRandomURL {

    private final URL url;

    public GenerateRandomURL() throws MalformedURLException, URISyntaxException {
        int NUMBER_MIN = 1;
        int NUMBER_MAX = 200;

        StringBuilder sb = new StringBuilder("http://numbersapi.com/");
        List<Integer> randomNumbers = new ArrayList<>(generateRandomNumbers(NUMBER_MIN, NUMBER_MAX));
        //so that we only need to call the api once
        sb.append(randomNumbers.stream()
                .map(Object::toString)
                .collect(Collectors.joining(",")));
        sb.append("/trivia?fragment");
        url = new URI(sb.toString()).toURL();
    }

    private List<Integer> generateRandomNumbers(int min, int max) {
        final int MAX_BATCH_SIZE = 100; //batch request limit
        final int BATCH_SIZE = 20;
        List<Integer> nums = new ArrayList<>();
        Random rand = new Random();

        while (nums.size() < MAX_BATCH_SIZE && nums.size() < BATCH_SIZE) {
            int value = rand.nextInt(max + 1 - min) + min;
            if (!nums.contains(value)) {
                //will not check for "uninteresting/boring" number
                nums.add(value);
            }
        }
        return nums;
    }

    public URL getURL() {
        return url;
    }

}
