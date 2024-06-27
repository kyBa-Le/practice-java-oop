package Exercise_OOP;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public MyComplex() {

    }

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return this.imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return String.format("(%1.2f + %1.2fi)", this.real, this.imag);
    }

    public boolean isReal() {
        return (this.imag == 0);
    }

    public boolean isImag() {
        return (this.real == 0);
    }

    public boolean equals(double real, double imag) {
        double epison = 0.0000001;
        return (Math.abs(this.real - real) < epison && Math.abs(this.imag - imag) < epison);
    }

    public boolean equals(MyComplex another) {
        return this.equals(another.real, another.imag);
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argumentInRadians() {
        return Math.atan2(this.real, this.imag);
    }

    // in the document, this method is return int but I could'nt return int when
    // using interface Math
    public double argumentInDegrees() {
        return Math.toDegrees(this.argumentInRadians());
    }

    public MyComplex conjugate() {
        return new MyComplex(this.real, -this.imag);
    }

    public MyComplex add(MyComplex another) {
        return new MyComplex(this.real + another.real, this.imag + another.imag);
    }

    public MyComplex subtract(MyComplex another) {
        return new MyComplex(this.real - another.real, this.imag - another.imag);
    }

    public MyComplex multiplyWith(MyComplex another) {
        double multiReal = (this.real * another.real - this.imag * another.imag);
        double multiImag = (this.real * another.imag + this.imag * another.real);
        return new MyComplex(multiReal, multiImag); // this method need to return this according to document's Hint
    }

    public MyComplex divideBy(MyComplex another) {
        double divideReal = (this.real * another.real - this.imag * another.imag)
                / (another.real * another.real + another.imag * another.imag);
        double divideImag = (this.real * another.real - this.imag * another.imag)
                / (another.real * another.real + another.imag * another.imag);
        return new MyComplex(divideReal, divideImag);

    }
}
