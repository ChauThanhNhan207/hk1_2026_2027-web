/**
 * 
 */
package Tuan05;
import java.util.Scanner;
/**
 *  Class Main
 */
public class Main {
	static Scanner sc = new Scanner(System.in);
	/**
	 * @param args
	 */
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        CDList ql = new CDList();
        int luaChon = -1;

        do {
            System.out.println("\n================ MENU QUAN LY CD ================");
            System.out.println("| 1. Them CD (tu mo rong mang khi day)          |");
            System.out.println("| 2. Xoa CD theo ma                             |");
            System.out.println("| 3. Sua / Cap nhat CD theo ma                  |");
            System.out.println("| 4. Tim kiem theo ma                           |");
            System.out.println("| 5. Tim theo tua - TIEN TO (ben trai)          |");
            System.out.println("| 6. Tim theo tua - HAU TO (ben phai)           |");
            System.out.println("| 7. Tim theo tua - GAN GIONG (chua)            |");
            System.out.println("| 8. Hien thi danh sach                         |");
            System.out.println("| 9. Thong ke                                   |");
            System.out.println("| 8. Hien thi danh sach                         |");
            System.out.println("| 9. Thong ke                                   |");
            System.out.println("| 10. Sap xep giam dan theo gia thanh           |");
            System.out.println("| 11. Sap xep tang dan theo tua CD              |");
            System.out.println("| 0. Thoat                                      |");
            System.out.println("=================================================");
            System.out.print(" Chon chuc nang: ");

            try {
                luaChon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(" Vui long nhap so!");
                continue;
            }

            switch (luaChon) {
                case 1: themCD(ql); break;
                case 2: xoaCD(ql); break;
                case 3: capNhatCD(ql); break;
                case 4: timTheoMa(ql); break;
                case 5: timTheoTienTo(ql); break;
                case 6: timTheoHauTo(ql); break;
                case 7: timGanGiong(ql); break;
                case 8: ql.hienThiDanhSach(); break;
                case 9: thongKe(ql); break;
                case 10: ql.sapXepGiamDanTheoGia(); ql.hienThiDanhSach(); break;
                case 11: ql.sapXepTangDanTheoTua(); ql.hienThiDanhSach(); break;
                case 0: System.out.println(" Tam biet!"); break;
                default: System.out.println(" Lua chon khong hop le!");
            }
        } while (luaChon !=0);
        
        sc.close();
    }
            
	// Cac ham ho tro menu
	static void themCD(CDList ql) {
        try {
            System.out.print("Nhap ma CD (>0): ");
            int ma = Integer.parseInt(sc.nextLine());
            System.out.print("Nhap tua CD: ");
            String tua = sc.nextLine();
            System.out.print("Nhap so bai hat (>0): ");
            int sbh = Integer.parseInt(sc.nextLine());
            System.out.print("Nhap gia thanh (>0): ");
            double gia = Double.parseDouble(sc.nextLine());
            if (ql.themCD(new CD(ma, tua, sbh, gia)))
                System.out.println(" Them CD thanh cong!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
	
	static void xoaCD(CDList ql) {
        try {
            System.out.print("Nhap ma CD can xoa: ");
            int ma = Integer.parseInt(sc.nextLine());
            if (ql.xoaCD(ma)) System.out.println(" Da xoa CD ma " + ma);
        } catch (NumberFormatException e) {
            System.out.println(" Ma phai la so nguyen!");
        }
    }

    static void capNhatCD(CDList ql) {
        try {
            System.out.print("Nhap ma CD can sua: ");
            int ma = Integer.parseInt(sc.nextLine());
            System.out.print("Tua CD moi: ");
            String tua = sc.nextLine();
            System.out.print("So bai hat moi: ");
            int sbh = Integer.parseInt(sc.nextLine());
            System.out.print("Gia thanh moi: ");
            double gia = Double.parseDouble(sc.nextLine());
            if (ql.capNhatCD(ma, tua, sbh, gia))
                System.out.println(" Da cap nhat CD ma " + ma);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void timTheoMa(CDList ql) {
        try {
            System.out.print("Nhap ma CD can tim: ");
            int ma = Integer.parseInt(sc.nextLine());
            CD kq = ql.timTheoMa(ma);
            if (kq != null) {
                System.out.println(" Tim thay:");
                System.out.println(kq);
            } 
            else System.out.println(" Khong co CD ma " + ma);
        } catch (NumberFormatException e) {
            System.out.println(" Ma phai la so!");
        }
    }
    
    static void timTheoTienTo(CDList ql) {
        System.out.print("Nhap tien to tua CD (so khop BEN TRAI): ");
        String tk = sc.nextLine();
        CDList kq = ql.timTheoTienTo(tk);
        System.out.println(" Tim thay " + kq.laySoLuong() + " ket qua (bat dau bang '" + tk + "'):");
        kq.hienThiDanhSach();
    }

    static void timTheoHauTo(CDList ql) {
        System.out.print("Nhap hau to tua CD (so khop BEN PHAI): ");
        String tk = sc.nextLine();
        CDList kq = ql.timTheoHauTo(tk);
        System.out.println(" Tim thay " + kq.laySoLuong() + " ket qua (ket thuc bang '" + tk + "'):");
        kq.hienThiDanhSach();
    }

    static void timGanGiong(CDList ql) {
        System.out.print("Nhap tu khoa (tim GAN GIONG, chua o bat ky vi tri): ");
        String tk = sc.nextLine();
        CDList kq = ql.timGanGiong(tk);
        System.out.println(" Tim thay " + kq.laySoLuong() + " ket qua (chua '" + tk + "'):");
        kq.hienThiDanhSach();
    }
    
    static void thongKe(CDList ql) {
        System.out.println("\n===== THONG KE =====");
        System.out.println(" So luong CD: " + ql.tinhSoLuongCD());
        System.out.printf(" Tong gia thanh: %,.2f VND\n", ql.tinhTongGiaThanh());
        System.out.printf(" Gia trung binh: %,.2f VND\n", ql.tinhGiaTrungBinh());
        CD max = ql.timCDDatNhat();
        CD min = ql.timCDReNhat();
        if (max != null) {
            System.out.println(" CD dat nhat:");
            System.out.println(" " + max);
            System.out.println(" CD re nhat:");
            System.out.println(" " + min);
        }
    }
        
}

