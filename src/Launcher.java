import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Launcher {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        ArrayList<Man> litlMan = new ArrayList<>();
        InputHandler inputHandler = new InputHandler(litlMan);

        int x = 0;
        boolean qwest = true;
        while (qwest) {
            Scanner str = new Scanner(System.in);
            String str2 = str.nextLine();
            switch (str2) {
                case "add" -> {
                    Man mens = new Man();
                    litlMan.add(mens);
                    inputHandler.addMan(str);
                    x++;
                }
                case "exit" -> {
                    inputHandler.saveToFile();
                    qwest = false;
                }
                case "displ" -> {
                    BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
                    String line;
                    int index = 0;
                    while ((line = reader.readLine()) != null) {
                        System.out.println("Строка " + index + ": " + line);
                        index++;
                    }
                    reader.close();

                    int number = str.nextInt();
                    System.out.println(litlMan.get(number).name);
                }
                default -> System.err.println("Ошибка");
            }
        }
    }
}
