package HomeWork.help;

import HomeWork.help.MyExceptions.SexFormatEx;
import HomeWork.help.MyExceptions.WrongDateFormatEx;
import HomeWork.help.MyExceptions.WrongNumberOfArguments;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ReaderFromConsole extends Reader {
    @Override
    public Human readNewHuman() {
        boolean flag = true;
        Human human = null;
        while (flag) {
            try {
                Scanner scanner = new Scanner(System.in);
                String line = scanner.nextLine();
                String[] args = line.split(" ");

                if (args.length != 6)
                    throw new WrongNumberOfArguments("Данные введены не корректно. Мало аргументов");
                String[] date = args[3].replace('.',' ').split(" ");
                if (date.length != 3) throw new WrongDateFormatEx("Число аргументов не 3 при разбиении");
                int[] intDate = new int[date.length];
                for (int i = 0; i < date.length; i++) {
                    intDate[i] = parseInt(date[i]);
                }
                Calendar calendar = null;
                try {
                    calendar = new GregorianCalendar();
                    calendar.set(Calendar.YEAR, intDate[2]);
                    calendar.set(Calendar.MONTH, intDate[1]);
                    calendar.set(Calendar.DAY_OF_MONTH, intDate[0]);
                } catch (Exception e) {
                    throw new WrongDateFormatEx("Неверное значение года, месяца или числа");
                }
                SexEnum humanSex = switch (args[4]) {
                    case "male" -> SexEnum.valueOf("MALE");
                    case "female" -> SexEnum.valueOf("FEMALE");
                    default -> throw new SexFormatEx("Возможные варианты только male и female");
                };
                human = new Human(args[0], args[1], args[2], calendar, humanSex, parseInt(args[5]));
                flag = false;
            } catch (WrongDateFormatEx e) {
                System.out.println("Дату следует вводить в формате ЧЧ.ММ.ГГГГ:" + e.getMessage());
                System.out.println("Попробуй еще раз\n");
            } catch (SexFormatEx|WrongNumberOfArguments e) {
                System.out.println(e.getMessage());
                System.out.println("Попробуй еще раз\n");
            }
        }
        return human;
    }
}
