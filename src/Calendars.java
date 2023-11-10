import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Calendars {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Locale russianLocale = new Locale("ru");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E", russianLocale);
        String dayOfWeek = formatter.format(date.getDayOfWeek()); // форматируем день недели в соответствии с выбранной локалью
        String day = (dayOfWeek);
        String day2 = String.valueOf(date.getMonth());
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        switch (day){
            case "пн":
                System.out.println("Понедельник");
                break;
            case "вт":
                System.out.println("Вторник");
                break;
            case "ср":
                System.out.println("Среда");
                break;
            case "чт":
                System.out.println("Четверг");
                break;
            case "пт":
                System.out.println("Пятница");
                break;
            case "сб":
                System.out.println("Суббота");
                break;
            case "вс":
                System.out.println("Воскресенье");
                break;
        }

        switch (day2) {
            case "JANUARY":
                System.out.println("Январь");
                break;
            case "FEBRUARY":
                System.out.println("Февраль");
                break;
            case "MARCH":
                System.out.println("Март");
                break;
            case "APRIL":
                System.out.println("Апрель");
                break;
            case "MAY":
                System.out.println("Май");
                break;
            case "JUNE":
                System.out.println("Июнь");
                break;
            case "JULY":
                System.out.println("Июль");
                break;
            case "AUGUST":
                System.out.println("Август");
                break;
            case "SEPTEMBER":
                System.out.println("Сентябрь");
                break;
            case "OCTOBER":
                System.out.println("Октябрь");
                break;
            case "NOVEMBER":
                System.out.println("Ноябрь");
                break;
            case "DECEMBER":
                System.out.println("Декабрь");
                break;

        }
        System.out.println(name);
    }
}