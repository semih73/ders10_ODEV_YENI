package org.example;

public class OdevDers10 {
    public enum gezegenler {
        MERKUR(1, 579000, 2439.7, 58.6),
        VENUS(2, 1082000, 6051.8, 243),
        DUNYA(3, 1496000, 6371, 1),
        MARS(4, 2279000, 3389.5, 1.03),
        JUPITER(5, 7783000, 69911, 0.41),
        SATURN(6, 14200000, 58232, 0.45),
        URANUS(7, 28700000, 25362, 0.72),
        NEPTUN(8, 45000000, 2439.7, 0.67),
        PLUTON(9, 95000000, 1234.7, 0.42);
        public final int Sirano;
        public final int GuneseUzaklik;
        public final double YariCap;
        public final double DonmeSuresi;
        public int getSirano() {
            return Sirano;
        }
        public int getGuneseUzaklik() {
            return GuneseUzaklik;
        }
        public double getYariCap() {
            return YariCap;
        }
        public double getDonmeSuresi() {
            return DonmeSuresi;
        }
        gezegenler(int Sirano, int GuneseUzaklik, double YariCap, double DonmeSuresi) {
            this.Sirano = Sirano;
            this.GuneseUzaklik = GuneseUzaklik;
            this.YariCap = YariCap;
            this.DonmeSuresi = DonmeSuresi;
        }
        public void yazdir() {
            System.out.println(Sirano + "--> " + name() + " -->" + " Güneşe Uzaklık " + GuneseUzaklik + " km -->" + " Yarıçap " + YariCap + " km -->" + " Dönme süresi " + DonmeSuresi + " gün");
        }
    }
    public static void main(String[] args) {

        gezegenler.MERKUR.yazdir();
        gezegenler.VENUS.yazdir();
        gezegenler.DUNYA.yazdir();
        gezegenler.MARS.yazdir();
        gezegenler.JUPITER.yazdir();
        gezegenler.SATURN.yazdir();
        gezegenler.URANUS.yazdir();
        gezegenler.NEPTUN.yazdir();
        gezegenler.PLUTON.yazdir();

    }
}
