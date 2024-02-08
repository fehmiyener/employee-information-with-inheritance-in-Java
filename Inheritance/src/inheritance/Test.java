package week3OOP;

public class Test {

	public static void main(String[] args) {
		
		Person person1 = new Person("John", 45, 165, 92);
		Employee employee = new Employee("Maria", 20, 175.0, 70.0, 123, 10.0);
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Height: " + employee.getHeight() + " cm");
        System.out.println("Weight: " + employee.getWeight() + " kg");
        System.out.println("Id: " + employee.getId());
        System.out.println("Hourly Pay: " + employee.getHourlyPay() + " dollars");
        System.out.println("Info of person: "+person1.getInfo());
        System.out.println("Info of employee: "+employee.getInfo());
		
		
	}

}
