public abstract class Machine {

    abstract void purpose();

    static boolean isOn = false;

    public static void  turnOn() {

       isOn = true;
    }

    public static void turnOff() {
        isOn = false;

    }


}
