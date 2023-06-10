import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ScannerTestReader {
     static void removeFromFile(String filename, int index) {
        try {
            File inputFile = new File(filename);

            // Создаем временный ArrayList, чтобы хранить строки
            ArrayList<String> tempArrayList = new ArrayList<>();

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line = null;

            // Читаем строки из файла и добавляем их во временный ArrayList
            while ((line = reader.readLine()) != null) {
                tempArrayList.add(line);
            }
            reader.close();

            // Удаляем нужную строку из ArrayList

            tempArrayList.remove(index);

            // Записываем изменения в файл
            BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile));
            for (String currentLine : tempArrayList) {
                writer.write(currentLine + System.getProperty("line.separator"));
            }
            writer.close();

            System.out.println("Удалено из файла!!!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


        static void add(Scanner text) throws IOException {      //Scanner str = new Scanner(System.in);
        Writer writer = new BufferedWriter(new FileWriter("sexs.txt", true));
        writer.write(text.nextLine() + "\n");
        writer.close();
    }

    public static void main(String[] args) throws IOException {

        File file = new File("sexs.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        Scanner text = new Scanner(System.in);
        add(text);

        ArrayList<String> str = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        removeFromFile("sexs.txt",x);


    }
}
