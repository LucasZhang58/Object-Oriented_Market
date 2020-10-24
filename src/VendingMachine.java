public class VendingMachine extends Machine{
    // String[] snacks = {}
    int numOfCheetos = 10;
    int numOfDoritos = 10;
    int numOfFritos = 10;

    static final double cheetosPrice = 1.0; //price of cheetos is the same for all vending machine so we make it static
    static final double doritosPrice = 1.5; //price of doritos is a constant
    static final double fritosPrice = 2.0;



    void purpose() {
        System.out.println("My purpose is to sell snacks.");
    };

    public void buyCheetos(int numOfCheetos) {
        this.numOfCheetos = numOfCheetos;
    }

    public void buyDoritos(int numOfDoritos) {
        this.numOfDoritos = numOfDoritos;
    }

    public void buyFritos(int numOfFritos) {
        this.numOfFritos = numOfFritos;
    }

    public int getNumOfCheetos() {
        return numOfCheetos;
    }

    public int getNumOfDoritos() {
        return numOfDoritos;
    }

    public int getNumOfFritos() {
        return numOfFritos;
    }

    public static double getCheetosPrice() {
        return cheetosPrice;
    }

    public static double getDoritosPrice() {
        return doritosPrice;
    }

    public static double getFritosPrice() {
        return fritosPrice;
    }


}
