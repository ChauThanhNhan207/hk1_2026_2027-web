package tuan.Tuan3.Bai8;

public class TestCD {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CD cd1 = new CD("Cd10000", "Gia vo", "Phung Khanh Linh", 6, 10000);
		CD cd2 = new CD("Cd20000", "Usewa", "Ado", 2, 6000);
		CD cd3 = new CD("Cd30000", "Goi gam", "Phuong My Chi", 4, 6000);
		CD.tieuDe();
		System.out.println(cd1);
		System.out.println(cd2);
		System.out.println(cd3);
	}

}
