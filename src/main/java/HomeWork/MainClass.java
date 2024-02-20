package HomeWork;

import HomeWork.help.Human;
import HomeWork.help.ReaderFromConsole;

public class MainClass {
    public static void main(String[] args) {
        //Иванов Иван Иванович 12.01.2016 male 12213
        ReaderFromConsole myReader = new ReaderFromConsole();
        System.out.println("Введите данные о человеке в формате\n" +
                "Фамилия Имя Отчество ЧЧ.ММ.ГГГГ(датаРождения) пол(male/female) телефон");
        Human human = myReader.readNewHuman();

        System.out.println(human.toString());
    }
}
