import java.util.Scanner;

public class CallCulytor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Выберите действие какое хотите выполнить между ними");
        String c = scanner.next();
        boolean x = true;
        while (x) {


            switch (c) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "pow":
                    System.out.println(Math.pow(a, b));
                    break;
                case "%":
                    System.out.println(a % b);
                    break;
                case "exit":
                    System.out.println("Конец програмы");
                    x=false;
            } if (x) {
                System.out.println("Введите первое число");
                a= scanner.nextInt();
                System.out.println("Введите второе число");
                b=scanner.nextInt();
                System.out.println("Выберите действие какое хотите выполнить между ними");
                c = scanner.next();
            }
        }
    }
}


