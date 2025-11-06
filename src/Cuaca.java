/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Cuaca {
    private String area;
    private String cuaca;
    private String suhu;
    private String kelembapan;
    private String bujur;
    private String lintang;

    public Cuaca(String area, String cuaca, String suhu, String kelembapan, String bujur, String lintang) {
        this.area = area;
        this.cuaca = cuaca;
        this.suhu = suhu;
        this.kelembapan = kelembapan;
        this.bujur = bujur;
        this.lintang = lintang;
    }

    public String getArea() { return area; }
    public String getCuaca() { return cuaca; }
    public String getSuhu() { return suhu; }
    public String getKelembapan() { return kelembapan; }
    public String getBujur() { return bujur; }
    public String getLintang() { return lintang; }
}

