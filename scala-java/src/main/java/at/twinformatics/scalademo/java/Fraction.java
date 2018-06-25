package at.twinformatics.scalademo.java;

public class Fraction {
    private final long num;
    private final long denom;

    public Fraction(final long num, final long denom) {
        this.num = num;
        this.denom = denom;
    }

    public long num() {
        return num;
    }

    public long denom() {
        return denom;
    }

    public Fraction mul(final Fraction other) {
        return new Fraction(
            num*other.num,
            denom*other.denom
        );
    }

    @Override
    public int hashCode() {
        return Long.hashCode(num)^Long.hashCode(denom);
    }

    @Override
    public boolean equals(final Object obj) {
        return obj == this ||
            obj instanceof Fraction &&
            num == ((Fraction)obj).num &&
            denom == ((Fraction)obj).denom;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", num, denom);
    }

    public static Fraction of(final long num, final long denom) {
        return new Fraction(num, denom);
    }

    public static Fraction of(final long v) {
        return of(v, 1);
    }

}
