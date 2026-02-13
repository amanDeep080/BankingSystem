import assignment4_shapes.Shape;
import assignment4_shapes.Circle;
import assignment4_shapes.Rectangle;
import assignment4_shapes.Triangle;

import assignment5_vehicles.Vehicle;
import assignment5_vehicles.Car;
import assignment5_vehicles.Bike;

import assignment6_employees.Payable;
import assignment6_employees.SalariedEmployee;
import assignment6_employees.ContractEmployee;

public class AssignmentMain {
    public static void main(String[] args) {

        System.out.println("=== Assignment 4: Shapes ===");
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);
        Shape t = new Triangle(3, 4, 5);

        System.out.println("Circle Area: " + c.area());
        System.out.println("Circle Perimeter: " + c.perimeter());

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Rectangle Perimeter: " + r.perimeter());

        System.out.println("Triangle Area: " + t.area());
        System.out.println("Triangle Perimeter: " + t.perimeter());

        System.out.println("\n=== Assignment 5: Vehicles ===");
        Vehicle v = new Vehicle();
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        v.start();
        car.start();
        bike.start();

        System.out.println("\n=== Assignment 6: Employees ===");
        Payable salaried = new SalariedEmployee(600000);
        Payable contract = new ContractEmployee(500, 40);

        System.out.println("Salaried Monthly Pay: " + salaried.calculatePay());
        System.out.println("Contract Total Pay: " + contract.calculatePay());
    }
}
