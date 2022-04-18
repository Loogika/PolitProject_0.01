package loogika;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        long startTime = System.nanoTime();
        User Andrew = new User("Andrew");
        TextSort.polit(Andrew);
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }
}
