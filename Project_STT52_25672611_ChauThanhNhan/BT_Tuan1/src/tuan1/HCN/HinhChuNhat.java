package tuan1.HCN;

public class HinhChuNhat {
	//Khai bao cac thuoc tinh
	private double chieuDai;
	private double chieuRong;
	//Dong doi
	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double cD) throws Exception {
		if (cD > 0) { 
			this.chieuDai = cD;
		} else {
			throw new Exception("Chieu dai phai lon hon 0");
		}
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double cR) throws Exception {
		if (cR > 0) { 
			this.chieuRong = cR;
		} else {
			throw new Exception("Chieu rong phai lon hon 0");
		}
	}
	
	public HinhChuNhat(double cD, double cR) throws Exception {
		if (cD > 0) { 
			this.chieuDai = cD;
		} else {
			throw new Exception("Chieu dai phai lon hon 0");
		}
		
		if (cD > 0) { 
			this.chieuRong = cR;
		} else {
			throw new Exception("Chieu rong phai lon hon 0");
		}
	}
	
	public HinhChuNhat() {
		chieuDai = 0;
		chieuRong = 0;
	}
	
	public double getDienTich() {
		return this.chieuDai * this.chieuRong;
	}
	public double getChuVi() {
		return (this.chieuDai + this.chieuRong) * 2;
	}
	
	public static void main(String[] args) throws Exception {
		// Khoi tao doi tuong
		HinhChuNhat h1 = new HinhChuNhat(3, 6);
		// Xuat thong tin
		System.out.println("Chieu dai hinh chu nhat la " + h1.getChieuDai());
		System.out.println("Chieu rong hinh chu nhat la " + h1.getChieuRong());
		System.out.println("Dien tich HCN = " + h1.getDienTich());
		System.out.print("Chu vi HCN = " + h1.getChuVi());
	}

	
}
