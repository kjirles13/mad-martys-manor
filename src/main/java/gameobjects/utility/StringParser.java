package gameobjects.utility;

import java.util.ArrayList;
import java.util.List;

public class StringParser {


    public static String[] parse(String string, int maxLineLength) {
        List<String> stringList = new ArrayList<>();
        int position = 0;
        int lineLength = 0;
        while (position < string.length()) {
            // Look at one character at a time.
            char currentChar = string.charAt(position);

            if (currentChar == '~') {
                // If a tilde is found, add all the characters up until it to a separate string
                // and add that string to stringList. Set the string we're searching equal
                // to the remaining text and set position back to 0 so we start at the beginning
                // of the new string.
                stringList.add(string.substring(0, position));
                string = string.substring(position + 1);
                position = 0;
                /** made line length 0 so it restarts the line count */
                lineLength = 0;
            } else if (currentChar == ' ' && lineLength > maxLineLength) {
                // If the lineLength exceeds the maxLineLength and a space is found, insert a
                // line break where the space using two substrings. Reset the lineLength to 0 to
                // start counting the length of the next line.
                string = string.substring(0, position) + "\n" + string.substring(position+1);
                lineLength = 0;
            } else {
                position++;
                lineLength++;
            }


        }
        stringList.add(string);

        // Convert the List of Strings into an array of Strings in the return statement.
        return stringList.toArray(stringList.toArray(new String[stringList.size()]));
    }


}
