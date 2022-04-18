package loogika;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextSort {
    static void polit(User user) throws IOException {
        Scanner in = new Scanner(System.in);
        String statement = "";
        int libScore=0;

        Path dir = Paths.get("C:\\JavaT\\PolitProject 0.01");
        Path path = dir.resolve(user.name+".txt");
        String content = Files.readString(path,StandardCharsets.UTF_8);
        statement = content;
        /*
        while(!statement.equals("stop")){
            System.out.println(statement);

            for (LiberalWords lib:LiberalWords.values()){
                if (statement.contains(lib.toString())){
                    libScore++;
                }
            }
            statement = in.next();
        }
        */

        /*
        while(!statement.equals("stop")){
            statement = in.next();
        }*/

        //System.out.println(statement);

        for (LiberalWords lib:LiberalWords.values()){
            Pattern LibWord = Pattern.compile(lib.toString());
            Matcher m = LibWord.matcher(statement);
            while (m.find()){
                libScore++;
            }
        }






        System.out.println("libScore: "+libScore);
    }
}
