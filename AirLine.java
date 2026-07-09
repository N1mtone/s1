import java.util.Scanner;
public class AirLine{
private String maChuyenBay,diemDi,diemDen; private int soLuong,ngay,thang,nam;
public AirLine(){}
public AirLine(String m,int s,String dd,String dn,int ng,int t,int n){maChuyenBay=m;soLuong=s;diemDi=dd;diemDen=dn;ngay=ng;thang=t;nam=n;}
public void NhapTT(){Scanner sc=new Scanner(System.in);System.out.print("Ma chuyen bay: ");maChuyenBay=sc.nextLine();System.out.print("So luong: ");soLuong=Integer.parseInt(sc.nextLine());System.out.print("Diem di: ");diemDi=sc.nextLine();System.out.print("Diem den: ");diemDen=sc.nextLine();System.out.print("Ngay: ");ngay=Integer.parseInt(sc.nextLine());System.out.print("Thang: ");thang=Integer.parseInt(sc.nextLine());System.out.print("Nam: ");nam=Integer.parseInt(sc.nextLine());}
public void XuatTT(){System.out.println(maChuyenBay+" | "+soLuong+" | "+diemDi+" -> "+diemDen+" | "+ngay+"/"+thang+"/"+nam);}
public String getMaChuyenBay(){return maChuyenBay;} public void setMaChuyenBay(String x){maChuyenBay=x;}
public int getSoLuong(){return soLuong;} public void setSoLuong(int x){soLuong=x;}
public String getDiemDi(){return diemDi;} public void setDiemDi(String x){diemDi=x;}
public String getDiemDen(){return diemDen;} public void setDiemDen(String x){diemDen=x;}
}
