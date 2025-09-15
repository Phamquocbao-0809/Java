package Lec10_DanhSachNguoi;

import java.util.Scanner;

public class SinhVien extends Nguoi {

    private String maSinhVien;
    private String renLuyen;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String renLuyen) {
        this.maSinhVien = maSinhVien;
        this.renLuyen = renLuyen;
    }

    public SinhVien(String maSinhVien, String renLuyen, String hoVaTen, String gioiTinh, int cmnd) {
        super(hoVaTen, gioiTinh, cmnd);
        this.maSinhVien = maSinhVien;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getRenLuyen() {
        return renLuyen;
    }

    public void setRenLuyen(String renLuyen) {
        this.renLuyen = renLuyen;
    }

    void danhGiaRenLuyen() {
        int luaChonRenLuyen;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Danh gia ren luyen: 1-Gioi, 2-Kha, 3-Trung binh, 4-Yeu: ");
        luaChonRenLuyen = Integer.parseInt(scanner.nextLine());
        switch (luaChonRenLuyen) {
            case 1:
                System.out.println("Ren luyen gioi");
                setRenLuyen("Gioi");
                break;
            case 2:
                System.out.println("Ren luyen kha");
                setRenLuyen("Kha");
                break;
            case 3:
                System.out.println("Ren luyen trung binh");
                setRenLuyen("Trung binh");
                break;
            case 4:
                System.out.println("Ren luyen yeu");
                setRenLuyen("Yeu");
                break;
        }
    }

    @Override
    void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Ma sinh vien: ");
        setMaSinhVien(scanner.nextLine());
        System.out.print("Ren luyen: ");
        danhGiaRenLuyen();
    }

    void capNhatNguoiBangCmnd(int cmnd) {
        Scanner scanner = new Scanner(System.in);
        super.capNhatNguoiBangCmnd(cmnd);
        System.out.print("Ma sinh vien: ");
        setMaSinhVien(scanner.nextLine());
        System.out.print("Ren luyen: ");
        danhGiaRenLuyen();
    }

    @Override
    

    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.println(", Ma sinh vien: " + getMaSinhVien() + ", Ren luyen: " + getRenLuyen());
    }
    @Override
    public void traTienDoXe() {
        System.out.println("“Sinh vien: 2000d/ luot");
    }

}
