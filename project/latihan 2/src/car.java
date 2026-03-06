public class car {
    //atribut
    private String brand;
    private String color;
    private String type;
    private int speed;

    //constructor
    public car(){

    }
    public car(String brand, String color, String type, int speed){
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.speed = speed;
    }

    //method
    public void accelerate(int speedIncrease){

    }
    public String getBrand(){
        return brand;
    }
    public String getColor(){
        return color;
    }
    public String getType(){
        return type;
    }
    public int getSpeed(){
        return speed;
    }

}

