package Facade;

public class Radio {
    String description;
    int fm;

    public Radio(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void setFm(int fm){this.fm=fm;}


}
