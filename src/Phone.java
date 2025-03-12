public class Phone {

    private String brand;
    private String model;


    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getMarca() {
        return this.brand;
    }
    public String getModel() {
        return this.model;
    }

    public void setMarca(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }


    public String call(String phoneNum) {

        return "Calling " + phoneNum;
    }

}
