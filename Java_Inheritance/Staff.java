package Java_Inheritance;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff() {
        super();
    }

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return this.school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return this.pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    @Override
    public String toString() {
        return String.format("Staff [%s , school = %s, pay = %1.2f]",super.toString(),this.school, this.pay);
    }
    public static void main(String[] args) {
        Staff staff1 = new Staff("Ba", "Binh Dinh", "PNV", 3000);
        System.out.println(staff1);
    }
}
