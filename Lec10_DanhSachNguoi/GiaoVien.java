package Lec10_DanhSachNguoi;

import java.util.Scanner;

public class GiaoVien extends Nguoi {

    private String maGiaoVien;
    private String loaiThiDua;

    public GiaoVien() {
    }

    public GiaoVien(String maGiaoVien, String loaiThiDua) {
        this.maGiaoVien = maGiaoVien;
    }

    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    public void setMaGiaoVien(String maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
    }

    public String getLoaiThiDua() {
        return loaiThiDua;
    }

    public void setLoaiThiDua(String loaiThiDua) {
        this.loaiThiDua = loaiThiDua;
    }

    void xepLoaiThiDua() {
        Scanner scanner = new Scanner(System.in);
        int luaChonThiDua;
        System.out.print("Lua chon thi dua: 1-Loai A, 2-Loai B, 3-Loai C: ");
        luaChonThiDua = Integer.parseInt(scanner.nextLine());
        switch (luaChonThiDua) {
            case 1:
                System.out.println("Thi dua loai A");
                setLoaiThiDua("Loai A");
                break;
            case 2:
                System.out.println("Thi dua loai B");
                setLoaiThiDua("Loai B");
                break;
            case 3:
                System.out.println("Thi dua loai C");
                setLoaiThiDua("Loai C");
                break;
        }
    }
    void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Ma giao vien: ");
        setMaGiaoVien(scanner.nextLine());
        System.out.print("Loai thi dua: ");
        xepLoaiThiDua();
    }

    @Override
    
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.println(", Ma giao vien: " + getMaGiaoVien() + ", Loai thi dua: " + getLoaiThiDua());
    }
    @Override
    public void traTienDoXe() {
        System.out.println("Giao vien: mien phi");
    }
}
