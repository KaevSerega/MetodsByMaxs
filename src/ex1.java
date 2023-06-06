import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class InputHandler {
    private ArrayList<Man> manList;

    public InputHandler(ArrayList<Man> manList) {
        this.manList = manList;
    }

    public void addMan(Scanner scanner) {
        Man mans = new Man();
        manList.add(mans);
        manList.get(manList.size() - 1).name = scanner.nextLine();
        System.out.println(manList.get(manList.size() - 1).name + " это имя");
    }

    public void saveToFile() throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter("text.txt", true));
        for (Man element : manList) {
            writer.println(element.name);
        }
        writer.close();
    }

    public void displayMan(Scanner scanner) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
        String line;
        int index = 0;
        while ((line = reader.readLine()) != null) {
            System.out.println("Строка " + index + ": " + line);
            index++;
        }

        int number = scanner.nextInt();
        System.out.println(manList.get(number).name);
        reader.close();

    }
}

class Man {
    String name;
}


