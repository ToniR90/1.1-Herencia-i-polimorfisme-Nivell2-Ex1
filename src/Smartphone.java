public class Smartphone extends Phone implements Camera , Clock {


    public Smartphone(String brand , String model) {
        super(brand , model);
    }

    public String photo() {
        return "Taking a photo";
    }

    public String alarm() {
        return "The alarm is ringing";
    }

}
