public class Maths {
    private int a;
    private int b;
    public Maths(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int add() {
        return a+b;
    }
    public int sub() {
        return a-b;
    }
    public int mult() {
        return a*b;
    }
    public double div() {
        return (double)a/b;
    }
    public String displayAll() {
        return (a + b) + " " + (a - b) + " " + (a * b) + " " + ((double)a/b);
    }
}