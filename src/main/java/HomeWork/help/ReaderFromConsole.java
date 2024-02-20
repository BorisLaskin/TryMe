package HomeWork.help;

import java.util.Scanner;

public class ReaderFromConsole extends Reader{
    @Override
    Human readNewHuman() {
        try{
            Scanner scanner = new Scanner();
            String line = scanner.nextLine();
            String[] args  =  line.split(" ");
        }
        catch(Exception e){}
        return null;
    }
}
