package HomeWork.help;
import java.util.Calendar;

public class Human {

    private String family;
    private String name;
    private String Sername;
    private Calendar dateBirth;
    private SexEnum humanSex;

    private int phoneNumber;

    public human(String family, String name, String Sername, Calendar dateBirth,
                 SexEnum humanSex, int phoneNumber) {
        this.family = family;
        this.name = name;
        this.Sername = Sername;
        this.dateBirth = dateBirth;
        this.humanSex = humanSex;
        this.phoneNumber = phoneNumber;

    }
}
