/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lop_polygon;

/**
 *
 * @author P51
 */
public class Polygon {
    private Point[] points;

    public Polygon(Point[] points) {
        this.points = points;
    }
    public String getArea() {
        int n = points.length;
        double res = 0.0;
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            res += points[i].getX() * points[j].getY();
            res -= points[j].getX() * points[i].getY();
        }
        res *= 0.5;
        return String.format("%.3f", res);
    }
}
