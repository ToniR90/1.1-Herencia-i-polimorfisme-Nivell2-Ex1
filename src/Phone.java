public class Phone {

    private String brand;
    private String model;


    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }


    public String call(String phoneNum) {
        return "Calling " + phoneNum;
    }

}
