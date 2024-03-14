package bee2202;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        ArrayList<Double> results = new ArrayList<>();

        while (true) {
            Integer numPoints = scan.nextInt();
            scan.nextLine();

            if (numPoints == 0) {
                break;
            }

            Polygon polygon = new Polygon(numPoints);

            for (int i = 0; i < numPoints; i++) {
                Integer cordX = scan.nextInt();
                Integer cordY = scan.nextInt();
                scan.nextLine();

                polygon.points[i] = new Point(cordX, cordY);
            }

            double minWidth = Double.MAX_VALUE;

            for (int i = 0; i < numPoints; i++) {
                int j = (i + 1) % numPoints;
                int k = (i + 2) % numPoints;

                double width = calculateWidth(polygon.points[i], polygon.points[j], polygon.points[k]);
                minWidth = Math.min(minWidth, width);
            }

            results.add(minWidth);
        }

        DecimalFormat df = new DecimalFormat("0.00");

        for (int i = 0; i < results.size(); i++) {
            String formatted = df.format(roundToNearestHundredth(results.get(i))).replace(",", ".");

            System.out.printf("Case %d: %s\n", i + 1, formatted);
        }

        scan.close();
    }

    private static double calculateWidth(Point p1, Point p2, Point p3) {
        double a = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
        double b = Math.sqrt(Math.pow(p2.x - p3.x, 2) + Math.pow(p2.y - p3.y, 2));
        double c = Math.sqrt(Math.pow(p3.x - p1.x, 2) + Math.pow(p3.y - p1.y, 2));

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        double height = 2 * area / a;

        return height;
    }

    private static Double roundToNearestHundredth(double value) {
        return Math.ceil(value * 100.0) / 100.0 ;
    }
}

class Polygon {

    public Point[] points;

    public Polygon(Integer numPoints) {
        this.points = new Point[numPoints];
    }

    @Override
    public String toString() {
        return "Polygon [points=" + Arrays.toString(points) + "]";
    }
}

class Point {
    public Integer x;
    public Integer y;

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}
