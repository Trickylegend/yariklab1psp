public class IceCream {

    private String name;
    private boolean chocolate;

    private float fatPercentage;


    IceCream(){}

    IceCream( String name, boolean chocolate, float fatPercentage) {
        this.name = name;
        this.chocolate = chocolate;
        this.fatPercentage = fatPercentage;
    }
    IceCream ( String name, float fatPercentage) {
        this.name = name;
        this.chocolate = false;
        this.fatPercentage = fatPercentage;
    }

    public void printName() {
        System.out.println(name);
    }

    public void printChocolate() {
        System.out.println(chocolate);
    }

    public void printFatPercentage() {
        System.out.println(fatPercentage);
    }



}
