package tugaspertemuan7;
import java.util.Scanner;
public class LinearEquation {
    private double a,b,c,d,e,f;
    public LinearEquation() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }
    private void setA(double a) {
        this.a = a;
    }

    private void setB(double b) {
        this.b = b;
    }

    private void setC(double c) {
        this.c = c;
    }

    private void setD(double d) {
        this.d = d;
    }

    private void setE(double e) {
        this.e = e;
    }

    private void setF(double f) {
        this.f = f;
    }
    
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
    
    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai a: ");
        double a = input.nextDouble();
        System.out.print("Masukkan nilai b: ");
        double b = input.nextDouble();
        System.out.print("Masukkan nilai c: ");
        double c = input.nextDouble();
        System.out.print("Masukkan nilai d: ");
        double d = input.nextDouble();
        System.out.print("Masukkan nilai e: ");
        double e = input.nextDouble();
        System.out.print("Masukkan nilai f: ");
        double f = input.nextDouble();
        
        LinearEquation fungsi = new LinearEquation();
        fungsi.setA(a);
        fungsi.setB(b);
        fungsi.setC(c);
        fungsi.setD(d);
        fungsi.setE(e);
        fungsi.setF(f);
        
        if (fungsi.isSolvable()) {
            System.out.println("x adalah " + fungsi.getX() + " dan y adalah " + fungsi.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi.");
        }
    }   
}
