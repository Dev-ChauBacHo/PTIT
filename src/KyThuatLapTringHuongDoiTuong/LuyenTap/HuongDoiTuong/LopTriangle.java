package KyThuatLapTringHuongDoiTuong.LuyenTap.HuongDoiTuong;

import java.util.Scanner;

public class LopTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            Triangle a = new Triangle(sc.nextLine());
            if (!a.valid()) {
                System.out.println("INVALID");
            } else {
                System.out.println(a.getPerimeter());
            }
//            System.out.println(a);
        }
    }

    private static class Triangle {
        Point a, b, c;
        float ab, ac, bc;

        public Triangle(String x) {
            String[] s = x.split(" ");
            this.a = new Point(Float.parseFloat(s[0]), Float.parseFloat(s[1]));
            this.b = new Point(Float.parseFloat(s[2]), Float.parseFloat(s[3]));
            this.c = new Point(Float.parseFloat(s[4]), Float.parseFloat(s[5]));
            ab = calDistance(a, b);
            ac = calDistance(a, c);
            bc = calDistance(b, c);
        }

        public boolean valid() {
            return ab + ac > bc && ab + bc > ac && ac + bc > ab;
        }

        private String getPerimeter() {
            float result = ab + ac + bc;
//            return (float) Math.round(result * 1000f) / 1000f;
            return String.format("%.3f", result);
        }

        private float calDistance(Point p1, Point p2) {
            return (float) Math.sqrt(
                    ((p1.x - p2.x) * (p1.x - p2.x)) + ((p1.y - p2.y) * (p1.y - p2.y))
            );
        }

        @Override
        public String toString() {
            return "Triangle{" +
                    "a=" + a +
                    ", b=" + b +
                    ", c=" + c +
                    ", ab=" + ab +
                    ", ac=" + ac +
                    ", bc=" + bc +
                    '}';
        }
    }

    private static class Point {
        float x, y;

        public Point(float x, float y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
