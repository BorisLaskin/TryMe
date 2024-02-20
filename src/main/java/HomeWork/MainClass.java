package HomeWork;

import HomeWork.help.Human;
import HomeWork.help.ReaderFromConsole;


import java.io.FileWriter;
import java.io.IOException;


public class MainClass {
    public static void main(String[] args) {
        //Иванов Иван Иванович 12.01.2016 male 89123458912
        //Иванов Петр Иванович 01.01.2010 male 89123458912
        //Петров Петр Петрович 01.11.2000 male 89123458912
        ReaderFromConsole myReader = new ReaderFromConsole();
        System.out.println("Введите данные о человеке в формате\n" +
                "Фамилия Имя Отчество ЧЧ.ММ.ГГГГ(датаРождения) пол(male/female) телефон");
        Human human = myReader.readNewHuman();
        String filename = human.getFamily();
        try(FileWriter writer = new FileWriter(filename+".txt",true)){
            writer.write(human.toString()+"\n");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(human.toString());
    }
}
