package HomeWork.help;

public enum SexEnum {
    MALE("male"),
    FEMALE("female");

    private String title;

    SexEnum(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}
