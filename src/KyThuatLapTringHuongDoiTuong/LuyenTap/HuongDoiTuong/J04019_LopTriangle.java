package KyThuatLapTringHuongDoiTuong.LuyenTap.HuongDoiTuong;

import java.util.Scanner;

public class J04019_LopTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if (!a.valid()) {
                System.out.println("INVALID");
            } else {
                System.out.println(a.getPerimeter());
            }
        }
    }

    private static class Triangle {
        Point a, b, c;
        float ab, ac, bc;

        public Triangle(Point a, Point b, Point c) {
            this.a = a;
            this.b = b;
            this.c = c;
            ab = calDistance(a, b);
            ac = calDistance(a, c);
            bc = calDistance(b, c);
        }

        public boolean valid() {
            return ab + ac > bc && ab + bc > ac && ac + bc > ab;
        }

        private float getPerimeter() {
            float result = ab + ac + bc;
            return (float) Math.round(result * 1000f) / 1000f;
        }

        private float calDistance(Point p1, Point p2) {
            return (float) Math.sqrt(
                    ((p1.x - p2.x) * (p1.x - p2.x)) + ((p1.y - p2.y) * (p1.y - p2.y))
            );
        }
    }

    private static class Point {
        float x, y;

        public Point(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public static Point nextPoint(Scanner sc) {
            return new Point(
                    sc.nextFloat(),
                    sc.nextFloat()
            );
        }
    }
}
