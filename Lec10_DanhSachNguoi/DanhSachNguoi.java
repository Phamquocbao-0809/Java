package Lec10_DanhSachNguoi;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachNguoi {

    ArrayList<Nguoi> danhSachNguoi = new ArrayList<>();

    public void themDanhSach(Nguoi nguoi) {
        nguoi.nhapThongTin();
        danhSachNguoi.add(nguoi);
        System.out.println("Them thanh cong");
    }

    public void xuatDanhSach() {
        if (danhSachNguoi.size() == 0) {
            System.out.println("Danh sach rong");
        } else {
            for (int i = 0; i < danhSachNguoi.size(); i++) {
                danhSachNguoi.get(i).xuatThongTin();
            }
        }
    }

    public void capNhatDanhSachBangCmnd(int cmnd) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < danhSachNguoi.size(); i++) {
            if (cmnd == danhSachNguoi.get(i).getCmnd()) {
                danhSachNguoi.get(i).capNhatNguoiBangCmnd(cmnd);
                break;
            }
        }
        System.out.println("-> Cap nhat thanh cong!");
    }

    public void xoaDanhSachBangCmnd(int cmnd) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < danhSachNguoi.size(); i++) {
            if (cmnd == danhSachNguoi.get(i).getCmnd()) {
                danhSachNguoi.remove(i);
                break;
            }
        }
        System.out.println("-> Xoa thanh cong!");
    }

    public void timKiemNguoiBangCmnd(int cmnd) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < danhSachNguoi.size(); i++) {
            if (cmnd == danhSachNguoi.get(i).getCmnd()) {
                danhSachNguoi.get(i).xuatThongTin();
                break;
            }
        }
        System.out.println("-> Tim kiem thanh cong!");
    }
}
