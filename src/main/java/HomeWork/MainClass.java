package HomeWork;

import HomeWork.help.Human;
import HomeWork.help.ReaderFromConsole;

public class MainClass {
    public static void main(String[] args) {
        ReaderFromConsole myReader = new ReaderFromConsole();
        Human human = myReader.readNewHuman();
        System.out.println(human.toString());
    }
}
