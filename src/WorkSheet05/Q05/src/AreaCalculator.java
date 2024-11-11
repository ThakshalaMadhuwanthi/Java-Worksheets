public class AreaCalculator {
    static void calculateRectangleArea(double length,double width){
        double area;
        area = length*width;
        System.out.println("The area of rectangle is : "+area);

    }
    static void  calculateSquareArea(double length){
        double area;
        area = length*length;
        System.out.println("The area of square is : "+area);

    }

    public static void main(String[] args) {
        double  rectangleLength = 5;
        double  rectangleWidth = 8;
        double squareSideLength = 4;
        calculateRectangleArea(rectangleLength,rectangleWidth);
        calculateSquareArea(squareSideLength);
    }
}
