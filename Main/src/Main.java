import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        long startTime = System.nanoTime();

        // Имя юзера равно имени txt файла
        User Andrew = new User("Andrew");
        TextSort.polit(Andrew);

        long endTime = System.nanoTime();

        System.out.println(endTime - startTime);
    }
}
