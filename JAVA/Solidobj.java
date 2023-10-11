import java.util.Scanner;
import java.lang.Math;

class SolidnewObj {
    Scanner sc = new Scanner(System.in);

    SolidnewObj() {
    }

    public double volume() {
        return 0;
    }

    public double SurfaceArea() {
        return 0;
    }
}

class CylinderObj extends SolidnewObj {

    private double radius;
    private double height;

    CylinderObj() {
        System.out.println("Enter the radius for Cylinder");
        radius = sc.nextDouble();
        System.out.println("Enter the height for Cylinder");
        height = sc.nextDouble();
    }

    public double volume() {
        System.out.print("The Volume is ");
        return Math.PI * radius * radius * height;
    }

    public double SurfaceArea() {
        System.out.print("The Surface Area is ");
        return 2 * Math.PI * radius * height;
    }
}

class CubeObj extends SolidnewObj {
    private double side;

    CubeObj() {
        System.out.println("Enter the side of cube");
        side = sc.nextDouble();
    }

    public double volume() {
        System.out.print("The Volume is ");
        return side * side * side;
    }

    public double SurfaceArea() {
        System.out.print("The Surface Area is ");
        return 6 * side;
    }
}

class BoxObj extends SolidnewObj {
    private double length;
    private double breadth;
    private double height;

    BoxObj() {
        System.out.println("Enter the length of Box");
        length = sc.nextDouble();
        System.out.println("Enter the breadth of Box");
        breadth = sc.nextDouble();
        System.out.println("Enter the height of Box");
        height = sc.nextDouble();
    }

    public double volume() {
        System.out.print("The Volume is ");
        return length * breadth * height;
    }

    public double SurfaceArea() {
        System.out.print("The Surface Area is ");
        return 2 * (length * breadth + breadth * height + length * height);
    }
}

class ConeObj extends SolidnewObj {
    private double radius;
    private double height;
    private double slantheight;

    ConeObj() {
        System.out.println("Enter the radius for Cone");
        radius = sc.nextDouble();
        System.out.println("Enter the height for Cone");
        height = sc.nextDouble();
        System.out.println("Enter the slant height for Cone");
        slantheight = sc.nextDouble();
    }

    public double volume() {
        System.out.print("The Volume is ");
        return (Math.PI * radius * radius * height) * 0.33;
    }

    public double SurfaceArea() {
        System.out.print("The Surface Area is ");
        return Math.PI * radius * slantheight;
    }
}

public class SolidObj {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        int a = 0;
        while (a != 5) {
            System.out.println("----MENU----\n ENTER WHICH SHAPE TO USE\n1)Cylinder 2)Cube 3)Box 4)Cone 5)Exit");
            a = sd.nextInt();
            switch (a) {
                case 1:
                    CylinderObj cy = new CylinderObj();
                    System.out.println(cy.volume());
                    System.out.println(cy.SurfaceArea());
                    break;
                case 2:
                    CubeObj cu = new CubeObj();
                    System.out.println(cu.volume());
                    System.out.println(cu.SurfaceArea());
                    break;
                case 3:
                    BoxObj b = new BoxObj();
                    System.out.println(b.volume());
                    System.out.println(b.SurfaceArea());
                    break;
                case 4:
                    ConeObj c = new ConeObj();
                    System.out.println(c.volume());
                    System.out.println(c.SurfaceArea());
                    break;
            }
        }
        sd.close();
    }
}
