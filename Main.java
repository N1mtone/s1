public class Main {
    public static void main(String[] args) {
        // Bai 1
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Nhap so luong pizza: ");
        int soLuong=sc.nextInt();
        System.out.print("Nhap thoi gian giao hang (phut): ");
        int thoiGian=sc.nextInt();
        double donGia;
        if(thoiGian<10) donGia=5.5;
        else if(thoiGian<=20) donGia=4;
        else if(thoiGian<=30) donGia=2.5;
        else donGia=0;
        System.out.println("Tong tien: $"+soLuong*donGia);

        // Bai 2
        AirLine mb1=new AirLine();
        AirLine mb2=new AirLine();
        AirLine mb3=new AirLine();
        System.out.println("\nNhap thong tin chuyen bay 1");
        mb1.NhapTT();
        System.out.println("\nNhap thong tin chuyen bay 2");
        mb2.NhapTT();
        System.out.println("\nNhap thong tin chuyen bay 3");
        mb3.NhapTT();
        System.out.println("\n===== DANH SACH =====");
        mb1.XuatTT(); mb2.XuatTT(); mb3.XuatTT();
    }
}
