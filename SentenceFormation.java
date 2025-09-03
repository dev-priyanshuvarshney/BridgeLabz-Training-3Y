public class SentenceFormation  {

    public static String formatParagraph(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }

        text = text.trim();
        StringBuilder cleaned = new StringBuilder();
        boolean lastWasSpace = false;

        for (char c : text.toCharArray()) {
            if (c == ' ') {
                if (!lastWasSpace) {
                    cleaned.append(c);
                }
                lastWasSpace = true;
            } else {
                cleaned.append(c);
                lastWasSpace = false;
            }
        }

        StringBuilder withSpaces = new StringBuilder();
        for (int i = 0; i < cleaned.length(); i++) {
            char c = cleaned.charAt(i);
            withSpaces.append(c);

            if ((c == '.' || c == '!' || c == '?') && i + 1 < cleaned.length()) {
                if (cleaned.charAt(i + 1) != ' ') {
                    withSpaces.append(' ');
                }
            }
        }

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < withSpaces.length(); i++) {
            char c = withSpaces.charAt(i);

            if (capitalizeNext && Character.isLetter(c)) {
                result.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                result.append(c);
            }

            if (c == '.' || c == '!' || c == '?') {
                capitalizeNext = true;
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "hello   world.this   is   a test!are you ready?   yes, i am.";
        String output = formatParagraph(input);
        System.out.println("Before: " + input);
        System.out.println("After : " + output);
    }
}
