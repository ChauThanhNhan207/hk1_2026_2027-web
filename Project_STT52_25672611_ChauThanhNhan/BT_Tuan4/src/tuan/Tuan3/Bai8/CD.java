/**
 * 
 */
package tuan.Tuan3.Bai8;

/**
 * Bai tap tuan 3, bai 8, masv: 25672611, hoten: Chau Thanh Nhan
 */
public class CD {
	/**
	 * Khai bao thuoc tinh cho object CD
	 */
	private String maCD;      
	private String tuaCD;     
	private String caSy;      
	private int soBaiHat;   
	private float gia;       
	
	/**
	 * Dong goi va rang buoc
	 */
	/**
	 * @return the maCD
	 */
	public String getMaCD() {
		return maCD;
	}
	/**
	 * @param maCD the maCD to set
	 */
	public void setMaCD(String maCD) {
		this.maCD = maCD;
	}
	/**
	 * @return the tuaCD
	 */
	public String getTuaCD() {
		return tuaCD;
	}
	/**
	 * @param tuaCD the tuaCD to set
	 */
	public void setTuaCD(String tuaCD) {
		this.tuaCD = tuaCD;
	}
	/**
	 * @return the caSy
	 */
	public String getCaSy() {
		return caSy;
	}
	/**
	 * @param caSy the caSy to set
	 */
	public void setCaSy(String caSy) {
		this.caSy = caSy;
	}
	/**
	 * @return the soBaiHat
	 */
	public int getSoBaiHat() {
		return soBaiHat;
	}
	/**
	 * @param soBaiHat the soBaiHat to set
	 * @throws Exception 
	 */
	public void setSoBaiHat(int soBaiHat) throws Exception {
		if (soBaiHat > 0) {
            this.soBaiHat = soBaiHat;
        } else {
            throw new Exception("So bai hat phai lon hon 0");
        }
	}
	/**
	 * @return the gia
	 */
	public float getGia() {
		return gia;
	}
	/**
	 * @param gia the gia to set
	 */
	public void setGia(float gia) {
		this.gia = gia;
	}
	
	/**
	 * Ham tao 
	 */
	/**
	 * @param maCD
	 * @param tuaCD
	 * @param caSy
	 * @param soBaiHat
	 * @param gia
	 * @throws Exception 
	 */
	public CD(String maCD, String tuaCD, String caSy, int soBaiHat, float gia) throws Exception {
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.caSy = caSy;
		if (soBaiHat > 0) {
            this.soBaiHat = soBaiHat;
        } else {
            throw new Exception("So bai hat phai lon hon 0");
        }
		this.gia = gia;
	}
	
	/**
	 * Tao tieu de
	 */
	public static void tieuDe() {
		System.out.println("In danh sach CD");
		for (int i = 0; i < 107; i++) {
			System.out.print("-"); // in khong xuong dong
		}
		System.out.println(); // xuong dong
		
		String s = "";
		s = String.format(
	            "|%10s|%30s|%30s|%10s|%10s|%10s|",
	            "Ma CD", "Tua CD", "Ca Sy",
	            "So Bai", "Don Gia", "Thanh Tien");
	        System.out.println(s);
		
		for (int i = 0; i < 107; i++) {
			System.out.print("-"); // in khong xuong dong
		}
		System.out.println(); // xuong dong
	}
	
	public double getThanhTien() {
		return getSoBaiHat() * getGia();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format(
	            "|%10s|%30s|%30s|%10d|%10.2f|%10.2f|",
	            maCD, tuaCD, caSy, soBaiHat, gia, getThanhTien());
	}
	
}
