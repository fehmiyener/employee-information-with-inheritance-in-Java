package week3OOP;


public class Employee extends Person {
    private int id;
    private double hourlyPay;

    public Employee(String name, int age, double height, double weight, int id, double hourlyPay) {
        super(name, age, height, weight);
        this.id = id;
        this.hourlyPay = hourlyPay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
    
    @Override
    public String getInfo() {
        return super.getInfo() + ", Id: " + id + ", hourlyPay: " + hourlyPay + " dollars";// super classtan getınfo metodunu çağırdık
    }
    
    
    
}
