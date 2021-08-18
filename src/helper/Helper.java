package helper;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {
    public Optional acceptLine(String line) {

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]" +
                "+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(line);
        if (line.isEmpty() || !matcher.matches()) {
            return Optional.empty();
        }
        return Optional.of(line);
    }
}
