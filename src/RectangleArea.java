import java.util.Scanner;

public class RectangleArea {
    private double sideA;
    private double  sideB;
    private double area;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void getData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter sideA");
        this.sideA = input.nextDouble();
        System.out.println("Please enter sideB");
        this.sideB = input.nextDouble();
    }

    public void computeField(){

        this.area = this.sideA * this.sideB;
        System.out.println("Area of rectangle is : "
                + area);
    }

    public void fieldDisplay() {
        System.out.println("SideA = " + this.sideA);
        System.out.println("SideB = " + this.sideB);
        System.out.println("Area = " + this.area);
    }
}



