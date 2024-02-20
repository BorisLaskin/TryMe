package HomeWork.help;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Human {

    private String family;
    private String name;
    private String Sername;
    private Calendar dateBirth;
    private SexEnum humanSex;

    private int phoneNumber;

    public Human(String family, String name, String Sername, Calendar dateBirth,
                 SexEnum humanSex, int phoneNumber) {
        this.family = family;
        this.name = name;
        this.Sername = Sername;
        this.dateBirth = dateBirth;
        this.humanSex = humanSex;
        this.phoneNumber = phoneNumber;

    }
    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd MMM yyyy");
        String result = "Фамилия: "+this.family+" Имя: "+this.name+" Отчество: "+this.Sername+
                "\nДата рождения: "+df.format(this.dateBirth.getTime())+
                "\nПол:"+this.humanSex.getTitle()+" Телефон: "+((Integer)this.phoneNumber).toString();
        return result;
    }
}
