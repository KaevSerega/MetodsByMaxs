import java.util.ArrayList;

public class While {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("0");
            }
            System.out.println();

        }
        ArrayList<String> lines = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String zeros = "0".repeat(i + 1);
            lines.add(zeros);
        }
        for (String line : lines) {
            System.out.println(line);
        }
    }
}