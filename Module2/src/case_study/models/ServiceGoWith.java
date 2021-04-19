package case_study.models;

public class ServiceGoWith {
    private  String name;
    private  double cost;

    public String getName() {
        return name;
    }

    public ServiceGoWith(String name) {
        this.name = name;
        switch (name){
            case "massage":
                this.cost=100;
                break;
                case "karaoke":
                this.cost=300;
                break;
                case "food":
                this.cost=200;
                break;
                case "drink":
                this.cost=50;
                break;
            case "car":
                this.cost = 150;
                break;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ServiceGoWith{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
