import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import PoliticalWords.*;

public class TextSort {
    static void polit(User user) throws IOException {
        String statement;
        int libScore;
        int autScore;
        int rigScore;
        int lefScore;

        Path dir = Paths.get("C:\\JavaT\\PolitProject 0.01");
        Path path = dir.resolve(user.name+".txt");
        statement = Files.readString(path,StandardCharsets.UTF_8);
        /*
        while(!statement.equals("stop")){
            statement = in.next();
        }*/
        lefScore=checkFor(LeftWords.values(),statement);
        rigScore=checkFor(RightWords.values(),statement);
        autScore=checkFor(AuthoritarianWords.values(),statement);
        libScore=checkFor(LiberalWords.values(), statement);

        user.changeParameters(lefScore,rigScore,autScore,libScore);
        user.showParameters();
    }

    static <T extends Enum<T>> int checkFor(T[] triggers,String statement){
        int count=0;
        for (T trigger : triggers) {
            Pattern LibWord = Pattern.compile(trigger.toString());
            Matcher m = LibWord.matcher(statement);
            while (m.find()) {
                count++;
            }
        }
        return count;
    }
}
