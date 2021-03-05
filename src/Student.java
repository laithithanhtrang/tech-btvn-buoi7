import java.util.Scanner;

class Student extends Person {
    protected String masv;
    protected float diemtrungbinh;
    protected String email;

    public void intPutStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien");
        this.masv = input.nextLine();
        System.out.println("Nhap diem trung binh");
        this.diemtrungbinh = input.nextFloat();
        System.out.println("Nhap email");
        this.email = input.nextLine();
        // input.close();
    }

    public void showStudent() {
        System.out.println("Ma sinh vien : " + this.masv + " Diem trung binh " + this.diemtrungbinh + "Email: " + this.email);
    }

}
