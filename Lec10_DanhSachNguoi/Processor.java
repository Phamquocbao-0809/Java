
package Lec10_DanhSachNguoi;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        DanhSachNguoi danhSachNguoi = new DanhSachNguoi();
        Scanner scanner = new Scanner(System.in);
        int luaChonTiepTuc;
        
        do{
            System.out.println("\nMENU:");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("1. Nhap thong tin (Sinh vien / Giao vien)");
            System.out.println("2. Xuat danh sach");
            System.out.println("3. Cap nhat danh sach");
            System.out.println("4. Xoa");
            System.out.println("5. Tim kiem");
            System.out.print("Chon chuc nang: ");
            luaChonTiepTuc = Integer.parseInt(scanner.nextLine());
            switch(luaChonTiepTuc){
                case 1:
                    System.out.println("\nThem moi mot nguoi vao danh sach");
                    System.out.println("Nhap ai? 1-Sinh vien, 2-Giao vien: ");
                    int luaChonChucNang = Integer.parseInt(scanner.nextLine());
                    if(luaChonChucNang==1){
                        SinhVien sinhVien = new SinhVien();
                        danhSachNguoi.themDanhSach(sinhVien);
                    } else if(luaChonChucNang==2){
                        GiaoVien giaoVien = new GiaoVien();
                        danhSachNguoi.themDanhSach(giaoVien);
                    } else {
                        System.out.println("Nhap sai ");
                    }
                    break;
                case 2: 
                    System.out.println("\n-Danh sach tat ca moi nguoi:");
                    danhSachNguoi.xuatDanhSach();
                    break;
                case 3:
                    System.out.print("Nhap CMND cua nguoi can cap nhat: ");
                    danhSachNguoi.capNhatDanhSachBangCmnd(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.print("Nhap CMND cua nguoi can xoa: ");
                    danhSachNguoi.xoaDanhSachBangCmnd(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.print("Nhap CMND cua nguoi can tim: ");
                    danhSachNguoi.timKiemNguoiBangCmnd(scanner.nextInt());
                    scanner.nextLine();
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai!");
                    break;
            }
            System.out.println("Tiep tuc khong? 1-co, 0-khong");
            luaChonTiepTuc = Integer.parseInt(scanner.nextLine());
        }while(luaChonTiepTuc != 0);
    }
}
