package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> fileContent = new ArrayList<>(Files.readAllLines(path, charset));
        int lines = 0, words = 0, chars = 0;
        for (String text : fileContent) {
            lines++;
            words += wordCount(text);
            chars += text.length();
        }
        System.out.println("Lines = " + lines + "\n" +
                            "Words = " + words + "\n" +
                            "Chars = " + chars);
    }

    public static int wordCount(String str) {
        int c = 0;
        String[] words = str.split(" ");
        for (String word : words) {
            if (!word.isEmpty() && Character.isLetterOrDigit(word.charAt(0))) {
                c++;
            }
        }
        return c;
    }

}
