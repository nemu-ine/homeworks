package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String[] scores = fileContent().split(" ");
        Map<Integer, Integer> scoreList = new HashMap<>();
        for (String val : scores) {
            int number = Integer.parseInt(val) / 10;
            try {
                int value = scoreList.get(number);
                scoreList.put(number, value + 1);
            } catch (NullPointerException e) {
                scoreList.put(number, 1);
            }
        }
        for (int i = 0; i <= 10; i++) {
            try {
                if (i == 10) {
                    System.out.println("  100: " + "*".repeat(scoreList.get(i)));
                    break;
                }
                System.out.println(i+"0-"+i+"9: " + "*".repeat(scoreList.get(i)));
            } catch (NullPointerException e) {
                System.out.println(i+"0-"+i+"9: ");
            }
        }
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
