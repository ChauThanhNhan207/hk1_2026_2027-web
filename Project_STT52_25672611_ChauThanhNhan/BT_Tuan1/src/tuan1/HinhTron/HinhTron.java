package tuan1.HinhTron;

public class HinhTron {
	private double banKinh;
	private ToaDo tam;
	public final double PI = 3.1416;
	// Dong goi
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	
	public ToaDo getTam() {
		return tam;
	}
	public void setTam(ToaDo tam) {
		this.tam = tam;
	}
	// Contruction
	/**
	 * @param banKinh
	 * @param tam
	 */
	public HinhTron(double banKinh, ToaDo tam) {
		this.banKinh = banKinh;
		this.tam = tam;
	}
	
	public static void main(String[] args) {
		HinhTron h1 = new HinhTron(7, new ToaDo("O", 4, 7));
		System.out.println("Thong tin hinh tron");
		System.out.println("Hinh tron tam: " + h1.getTam().getTen());
		System.out.println("Hinh tron co ban kinh: " + h1.getBanKinh());
	}
	
}
