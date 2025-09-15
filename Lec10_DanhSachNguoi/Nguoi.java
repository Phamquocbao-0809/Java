package Lec10_DanhSachNguoi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Nguoi {

    private String hoVaTen;
    private Date ngaySinh = new Date();
    private String gioiTinh;
    private int cmnd;

    public Nguoi() {
    }

    public Nguoi(String hoVaTen, String gioiTinh, int cmnd) {
        this.hoVaTen = hoVaTen;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Ho va ten: ");
        setHoVaTen(scanner.nextLine());
        System.out.print("Ngay sinh: ");
        String ngaySinhString = scanner.nextLine();
        try {
            setNgaySinh(formatter.parse(ngaySinhString));
        } catch (ParseException ex) {
//            System.getLogger(Nguoi.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            System.out.println("Loi: " + ex.getMessage());
        }
        System.out.print("Gioi tinh: ");
        setGioiTinh(scanner.nextLine());
        System.out.print("CMND: ");
        //setCmnd(Integer.parseInt(scanner.nextLine()));
        setCmnd(scanner.nextInt());
    }
    void capNhatNguoiBangCmnd(int cmnd){
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Ho va ten: ");
        setHoVaTen(scanner.nextLine());
        System.out.print("Ngay sinh: ");
        String ngaySinhString = scanner.nextLine();
        try {
            setNgaySinh(formatter.parse(ngaySinhString));
        } catch (ParseException ex) {
//            System.getLogger(Nguoi.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            System.out.println("Loi: " + ex.getMessage());
        }
        System.out.print("Gioi tinh: ");
        setGioiTinh(scanner.nextLine());
        setCmnd(cmnd);
    }

    void xuatThongTin(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Ho va ten: " + getHoVaTen() + ", Ngay sinh: " + sdf.format(getNgaySinh()) +
                ", Gioi tinh: " + getGioiTinh() + ", CMND: " + getCmnd());
    }
    
    public abstract void traTienDoXe();
}
