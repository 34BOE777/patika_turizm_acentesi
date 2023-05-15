/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acenta;

/**
 *
 * @author castl
 */
public class OtelOdasi extends Otel {
    int odaID; 
    int odaNO;
    int yatakSayisi;
    boolean tv;
    boolean konsol;
    double metre;
    boolean minibar;
     boolean rezerve;
     
    public OtelOdasi(int odaID, String isim, String konum, boolean otopark, boolean wifi, boolean havuz, boolean gym, boolean spa, boolean sezon,int odaNO, int yatakSayisi, boolean tv, boolean konsol, double metre, boolean minibar,boolean rezerve){
        super(isim, konum, otopark, wifi, havuz, gym, spa, sezon);
        this.odaNO = odaNO;
        this.yatakSayisi = yatakSayisi;
        this.tv=tv;
        this.konsol = konsol;
        this.metre = metre;
        this.minibar = minibar;

    };

    public int getOdaID() {
        return odaID;
    }

    public boolean isRezerve() {
        return rezerve;
    }

    public int getOdaNO() {
        return odaNO;
    }

    public int getYatakSayisi() {
        return yatakSayisi;
    }

    public boolean isTv() {
        return tv;
    }

    public boolean isKonsol() {
        return konsol;
    }

    public double getMetre() {
        return metre;
    }

    public boolean isMinibar() {
        return minibar;
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

    public void setOdaNO(int odaNO) {
        this.odaNO = odaNO;
    }

    public void setYatakSayisi(int yatakSayisi) {
        this.yatakSayisi = yatakSayisi;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public void setKonsol(boolean konsol) {
        this.konsol = konsol;
    }

    public void setMetre(double metre) {
        this.metre = metre;
    }

    public void setMinibar(boolean minibar) {
        this.minibar = minibar;
    }

    public void setOdaID(int odaID) {
        this.odaID = odaID;
    }

    public void setRezerve(boolean rezerve) {
        this.rezerve = rezerve;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setKonum(String konum) {
        this.konum = konum;
    }

     @Override
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
    
    
    public double FiyatHesap(){
        double fiyat = metre * 3;
        if(tv){
            fiyat += 10;
        }
        if(konsol){
            fiyat += 35;
        }
        if(minibar){
            fiyat += 10;
        }
        fiyat += yatakSayisi*25;
        if(otopark){
            fiyat += 50;
        }
        if(wifi)
            fiyat += 100;

        if(havuz)
            fiyat += 300;
        if(gym)
            fiyat += 50;
        if(spa)
            fiyat += 150;

        return fiyat;

    }
    
}
