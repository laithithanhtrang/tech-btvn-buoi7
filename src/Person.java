import java.util.Scanner;

class Person {
	protected String name;
	protected String gender;
	protected String adrress;
	protected String ngaysinh;
		public void intputPerson(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap Ten :");
		this.name = scanner.nextLine();
		System.out.println("Nhap gioi tinh");
		this.gender = scanner.nextLine();
		System.out.println("Nhap dia chi");
		this.adrress = scanner.nextLine();
		System.out.println("Nhap ngay sinh");
		this.ngaysinh = scanner.nextLine();
        // scanner.close();
	}
	public void showPerson(){
		System.out.println("Ho Ten : " +this.name + " Gioi Tinh : " +this.gender +" Dia chi : " +this.adrress +" Ngay sinh : " +this.ngaysinh);
	}
	}