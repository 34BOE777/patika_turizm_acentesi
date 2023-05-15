/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acenta;

/**
 *
 * @author castl
 */
public class Otel {
    String isim;
    String konum;
    boolean sezon;
    boolean otopark;
    boolean wifi;
    boolean havuz;
    boolean gym;
    boolean spa;

    public Otel(String isim, String konum, boolean sezon, boolean otopark, boolean wifi, boolean havuz, boolean gym, boolean spa) {
        this.isim = isim;
        this.konum = konum;
        this.sezon = sezon;
        this.otopark = otopark;
        this.wifi = wifi;
        this.havuz = havuz;
        this.gym = gym;
        this.spa = spa;
    }

    public String getIsim() {
        return isim;
    }

    public String getKonum() {
        return konum;
    }

    public boolean isSezon() {
        return sezon;
    }

    public boolean isOtopark() {
        return otopark;
    }

    public boolean isWifi() {
        return wifi;
    }

    public boolean isHavuz() {
        return havuz;
    }

    public boolean isGym() {
        return gym;
    }

    public boolean isSpa() {
        return spa;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setKonum(String konum) {
        this.konum = konum;
    }

    public void setSezon(boolean sezon) {
        this.sezon = sezon;
    }

    public void setOtopark(boolean otopark) {
        this.otopark = otopark;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public void setHavuz(boolean havuz) {
        this.havuz = havuz;
    }

    public void setGym(boolean gym) {
        this.gym = gym;
    }

    public void setSpa(boolean spa) {
        this.spa = spa;
    }
    
}
