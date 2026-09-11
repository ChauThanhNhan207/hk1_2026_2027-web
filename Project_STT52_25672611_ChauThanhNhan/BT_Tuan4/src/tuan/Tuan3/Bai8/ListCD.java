package tuan.Tuan3.Bai8;

public class ListCD {
	
	private CD[] cdr;    
    private int count;   
    
    /**
     * Constructor: tao mang co suc chua ban dau la n
     * @param n so phan tu toi da ban dau
     */
    public ListCD(int n) {
        this.cdr = new CD[n];   
        this.count = 0;
    }
    
    /**
     * Mo rong mang
     */
    public void tangKT() {
        if (cdr.length == count) {                       
            CD[] tam = new CD[cdr.length * 2];     
            System.arraycopy(cdr, 0, tam, 0, count); 
            cdr = tam;                                  
        }
    }  
    
    /**
     * Them 1 CD vao danh sach
     * @param crom
     * @return
     */
    public boolean themCD(CD crom) {
        // Kiem tra trung ma
        for (int i = 0; i < count; i++) {
            if (cdr[i].getMaCD().equalsIgnoreCase(crom.getMaCD())) {
                return false;   
            }
        }
        // Dam bao con cho
        tangKT();
        // Gan vao cuoi mang
        cdr[count] = crom;
        count++;
        return true;
    }
    
    /**
     * Xoa CD theo ma
     * @param maXoa
     * @return
     */
    public boolean xoa(String maXoa) {
        for (int i = 0; i < count; i++) {
            if (cdr[i].getMaCD().equalsIgnoreCase(maXoa)) {
                for (int j = i; j < count - 1; j++) {
                    cdr[j] = cdr[j + 1];
                }
                cdr[count - 1] = null; 
                count--;
                return true;
            }
        }
        return false;
    }
    
    /**
     * Cap nhat gia
     * @param maCD
     * @param gia
     * @return
     */
    public boolean capNhatCD(String maCD, float gia) {
        for (int i = 0; i < count; i++) {
            if (cdr[i].getMaCD().equalsIgnoreCase(maCD)) {
                cdr[i].setGia(gia);  
                return true;
            }
        }
        return false;
    }
    
    /**
     * In ket qua
     */
    public CD[] getAll() {
    	return cdr;
    }

}
