package demo;

import java.util.Scanner;

public class test {
    static Triangle getTriangle(Scanner scanner){
        double side1 = 1;
        double side2 = 1;
        double side3 = 1;
        while (true){
            System.out.println("Mời nhập cạnh 1: ");
            side1 = scanner.nextDouble();
            System.out.println("Mời nhập cạnh 2: ");
            side2 = scanner.nextDouble();
            System.out.println("Mời nhập cạnh 3: ");
            side3 = scanner.nextDouble();
            if((side1+side2)<=side3||(side1+side3)<=side2||(side2+side3)<=side1 ||side1<=0||side2<=0||side3<=0){
                System.out.println("Bạn đã nhập sai, mời nhập lại,các cạnh phải lớn hơn 0 \n và 2 cạnh bất kỳ phải có tổng lớn hơn cạnh còn lại!!!");
            }
            else {
                break;
            }
        }
        System.out.println("Mời nhập màu cho tam giác");
        String color = new Scanner(System.in).nextLine();
        Triangle triangle = new Triangle(side1,side2,side3);
        triangle.setColor(color);
        return triangle;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = getTriangle(scanner);
        System.out.println(triangle);

    }
}
