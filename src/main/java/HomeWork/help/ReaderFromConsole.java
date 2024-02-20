package HomeWork.help;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ReaderFromConsole extends Reader{
    @Override
    public Human readNewHuman() {
        boolean flag = true;
        while (flag)
            try{
                Scanner scanner = new Scanner(System.in);
                String line = scanner.nextLine();
                String[] args  =  line.split(" ");
                if(args.length !=6) throw new IOException("Данные не введены не корректно. Мало аргументов");
                int[] date = parseInt(args[4]);
                Calendar calendar = new GregorianCalendar();
                calendar.set(Calendar.YEAR, 2017);
                calendar.set(Calendar.MONTH, 0);
                calendar.set(Calendar.DAY_OF_MONTH, 25);

                Human human = new Human(args[0],args[1],args[2],args[3],args[4],args[5],)
            }
            catch(IOException e){
                System.out.println("Попробуй еще раз\n");
            }
        return null;
    }
}
