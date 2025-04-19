import java.util.regex.*;

public class BadWordCensor {
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        String[] badWords = {"damn", "stupid"};

        String patternString = "\\b(" + String.join("|", badWords) + ")\\b";
        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        String censored = matcher.replaceAll("****");
        System.out.println(censored);
    }
}
