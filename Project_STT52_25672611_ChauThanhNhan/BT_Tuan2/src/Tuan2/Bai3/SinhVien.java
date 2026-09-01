/**
 * 
 */
package Tuan2.Bai3;
import java.util.Scanner;

/**
 * 
 */
public class SinhVien {
	/**
	 * Khai bao thuoc tinh 
	 */
	private int maSV;
	private String hoTen;
	private float diemLT, diemTH;
	/**
	 * Dong goi 
	 */
	/**
	 * @return the maSV
	 */
	public int getMaSV() {
		return maSV;
	}
	/**
	 * @param maSV the maSV to set
	 * @throws Exception 
	 */
	public void setMaSV(int ma) throws Exception {
		if(ma>0) {
			this.maSV = ma;
		} else {
			throw new Exception("Loi! maSV phai lon hon 0");
		}
	}

	/**
	 * @return the hoTen
	 */
	public String getHoTen() {
		return hoTen;
	}
	/**
	 * @param hoTen the hoTen to set
	 */
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	/**
	 * @return the diemLT
	 */
	public float getDiemLT() {
		return diemLT;
	}
	/**
	 * @param diemLT the diemLT to set
	 */
	public void setDiemLT(float diemLT) throws Exception {
		if(diemLT >= 0 && diemLT <= 10) {
			this.diemLT = diemLT;	
		} else {
			throw new Exception("Loi! diemLT tu 0.0-10.0");
		}
	}
	
	/**
	 * @return the diemTH
	 */
	public float getDiemTH() {
		return diemTH;
	}
	/**
	 * @param diemTH the diemTH to set
	 */
	public void setDiemTH(float diemTH) throws Exception {
		if(diemTH >= 0 && diemTH <= 10) {
			this.diemTH = diemTH;	
		} else {
			throw new Exception("Loi! diemTH tu 0.0-10.0");
		}
	}
	/**
	 * Ham tao dung khoi tao doi tuong 
	 */
	/**
	 * @param maSV
	 * @param hoTen
	 * @param diemLT
	 * @param diemTH
	 */
	public SinhVien() {
		this.maSV = 1;
		this.hoTen = "Chua co";
		this.diemLT = 0.0f;
		this.diemTH = 0.0f;
	}
	/**
	 * @param maSV
	 * @param hoTen
	 * @param diemLT
	 * @param diemTH
	 * @throws Exception 
	 */
	public SinhVien(int ma, String hoTen, float diemLT, float diemTH) throws Exception {
		if(ma > 0) {
			this.maSV = ma;
		} else {
			throw new Exception("Loi! maSV phai lon hon 0");
		}
		this.hoTen = hoTen;
		if(diemLT >= 0 && diemLT <= 10) {
			this.diemLT = diemLT;	
		} else {
			throw new Exception("Loi! diemLT tu 0.0-10.0");
		}
		if(diemTH >= 0 && diemTH <= 10) {
			this.diemTH = diemTH;	
		} else {
			throw new Exception("Loi! diemTH tu 0.0-10.0");
		}
	}
	/**
	 * Xay dung phuong thuc tinh diem trung binh
	 */
	public double getDiemTB() {
		return (getDiemLT() + getDiemTH()) / 2;
	}
	/**
	 * In tieu de
	 */
	public static final void tieuDe() {
		for(int i = 0; i < 90; i++) {
			System.out.print("-");
		}
		System.out.println();
		String s = "";
		s = s + s.format("|%-15s|%-24s|%-15s|%-15s|%-15s|", "Ma sinh vien", "Ho Ten", "DiemLT", "DiemTH", "DiemTB" );
		System.out.println(s);
		for(int i = 0; i < 90; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	/*
	 * toString mau in 
	*/	
	@Override
	public String toString() {
		String s = "";
		s = s + s.format("|%-15s|%-24s|%-15s|%-15s|%-15s|", getMaSV(), getHoTen(), getDiemLT(), getDiemTH(), getDiemTB());
		return s;
	}
	/*
	 * Dong ke cuoi hang
	*/	
	public static final void keDong() {
		for(int i = 0; i < 90; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	
	public static SinhVien nhap() throws Exception {
		try (Scanner sc = new Scanner(System.in)) {
			int maSV;
			String hoTen;
			float diemLT, diemTH;
			System.out.println("Nhap ma sinh vien: ");
			maSV = sc.nextInt();
			sc.nextLine(); //xoa bo dem, tranh in thieu
			System.out.println("Nhap ho ten sinh vien: ");
			hoTen = sc.nextLine();
			System.out.println("Nhap diem li thuyet: ");
			diemLT = sc.nextFloat();
			System.out.println("Nhap diem thuc hanh: ");
			diemTH = sc.nextFloat();
			SinhVien s = new SinhVien(maSV, hoTen, diemLT, diemTH);
			return s;
		}
	}
	
	public static void xuat(SinhVien s) {
		System.out.println(s.toString());
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		tieuDe();
		SinhVien s1 = new SinhVien(25672611, "Chau Thanh Nhan", 9, 9);
		System.out.println(s1.toString());
		keDong();
		System.out.println("Nhap tu ban phim: ");
		xuat(nhap());
		tieuDe();
		keDong();
	}
}

