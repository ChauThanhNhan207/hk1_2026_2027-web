package tuan1.HinhTron;

public class ToaDo {
	private String ten;
	private double x;
	private double y;
	// Dong goi
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}

	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	// Contruction
	public ToaDo(String ten, double x, double y) {
		this.ten = ten;
		this.x = x;
		this.y = y;
	}
	
	public ToaDo() {
		this.ten = "Chua co";
		this.x = 0;
		this.y = 0;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
