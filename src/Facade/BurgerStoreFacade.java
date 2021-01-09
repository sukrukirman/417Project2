package Facade;

public class BurgerStoreFacade {
    Radio radio;
    Oven oven;
    Frier frier;

    public BurgerStoreFacade(Radio radio, Oven oven, Frier frier) {
        this.radio = radio;
        this.oven = oven;
        this.frier = frier;
    }

    public void openStore(){
        radio.on();
        oven.on();
        frier.on();
    }

    public void closeStore(){
        radio.off();
        oven.off();
        frier.off();
    }
}
