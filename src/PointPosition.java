import java.util.Scanner;

public class PointPosition {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        System.out.println(
                "Enter three points, p0(x0, y0), p18x1, y1) and p2(x2, y2)"
        );
        System.out.println(
                "p0: "
        );
        System.out.println(
                "x0: "
        );
        double x0 = input.nextDouble();

        System.out.println(
                "y0: "
        );
        double y0 = input.nextDouble();

        System.out.println(
                "p1: "
        );
        System.out.println(
                "x1: "
        );
        double x1 = input.nextDouble();
        System.out.println(
                "y1: "
        );
        double y1 = input.nextDouble();

        System.out.print(
                "p2: "
        );
        System.out.println(
                "x2: "
        );
        double x2 = input.nextDouble();
        System.out.println(
                "y2: "
        );
        double y2 = input.nextDouble();



        // Calculation
        double result = (x1 - x0) * (y2-y0) - (x2 -x0)*(y1-y0);

        if (result < 0)
            System.out.print(
                    "p2 is on the right side of the line"
            );
        else if(result == 0)
            System.out.print(
                    "p2 is on the line"
            );
        else
            System.out.print(
                    "p2 is on the left side of the line"
            );
    }

}
