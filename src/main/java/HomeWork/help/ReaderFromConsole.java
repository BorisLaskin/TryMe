package HomeWork.help;

import HomeWork.help.MyExceptions.WrongDateFormatEx;
import HomeWork.help.MyExceptions.WrongNumberOfArguments;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ReaderFromConsole extends Reader{
    @Override
    public Human readNewHuman() {
        boolean flag = true;
        Human result = null;
        while (flag) {
            try {
                Scanner scanner = new Scanner(System.in);
                String line = scanner.nextLine();
                String[] args = line.split(" ");

                if (args.length != 6) throw new WrongNumberOfArguments("Данные не введены не корректно. Мало аргументов\n");
                String[] date = args[3].split(".");
                if (date.length != 3) throw new WrongDateFormatEx("Число аргументов не 3 при разбиении\n");
                int[] intDate = new int[date.length];
                for (int i = 0; i < date.length; i++) {
                    intDate[i] = parseInt(date[i]);
                }
                Calendar calendar = new GregorianCalendar();
                calendar.set(Calendar.YEAR, intDate[2]);
                calendar.set(Calendar.MONTH, intDate[1]);
                calendar.set(Calendar.DAY_OF_MONTH, intDate[0]);

                Human human = new Human(args[0], args[1], args[2], calendar, args[4], args[5], args[6]);
            } catch (WrongDateFormatEx e) {
                System.out.println("Дату следует вводить в формате ЧЧ.ММ.ГГГГ:"+e.getMessage());
                System.out.println("Попробуй еще раз\n");
            }
        }
        return result;
    }
}
