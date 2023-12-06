package com.example.myapplication4;

import java.util.ArrayList;
import java.util.List;

public class Monhoc {
   private String TenHinh;
   private String MaMh;
   private String TenMH;
   private String TenGV;

    public Monhoc(String tenHinh, String maMh, String tenMH, String tenGV) {
        TenHinh = tenHinh;
        MaMh = maMh;
        TenMH = tenMH;
        TenGV = tenGV;
    }

    public String getTenHinh() {
        return TenHinh;
    }

    public void setTenHinh(String tenHinh) {
        TenHinh = tenHinh;
    }

    public String getMaMh() {
        return MaMh;
    }

    public void setMaMh(String maMh) {
        MaMh = maMh;
    }

    public String getTenMH() {
        return TenMH;
    }

    public void setTenMH(String tenMH) {
        TenMH = tenMH;
    }

    public String getTenGV() {
        return TenGV;
    }

    public void setTenGV(String tenGV) {
        TenGV = tenGV;
    }
    static public  List<Monhoc> getlist (){
        List<Monhoc> monhocList = new ArrayList<>();
        monhocList.add(new Monhoc("didong","CMP123","di động","Toàn"));
        monhocList.add(new Monhoc("didong","CMP123","di động","Nguyễn Mạnh Toàn"));
        monhocList.add(new Monhoc("didong","CMP123","di động","XXXXXXX"));

        return monhocList;
    }

}
