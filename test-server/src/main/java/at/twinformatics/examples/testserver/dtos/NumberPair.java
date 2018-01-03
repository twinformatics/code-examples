package at.twinformatics.examples.testserver.dtos;

public class NumberPair {

    private int a;

    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "NumberPair{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
