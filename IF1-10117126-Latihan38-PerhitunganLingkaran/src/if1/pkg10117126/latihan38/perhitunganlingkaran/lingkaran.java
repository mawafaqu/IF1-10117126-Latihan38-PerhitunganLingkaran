/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117126.latihan38.perhitunganlingkaran;

/**
 *
 * @author MAWA
 */
public class lingkaran {

    public static final double PHI = 3.14159;

    private int diameter;

    public lingkaran(int diameter) {
        this.diameter = diameter;
    }

    public double getJariJari() {
        return diameter / 2;
    }

    public double getKelilingLingkaran() {
        return PHI * diameter;
    }

    public double getLuasLingkaran() {
        return PHI * (getJariJari() * getJariJari());
    }

    /**
     * @param args the command line arguments
     */
    public void printResult() {
        System.out.println("\n=========== Hasil Perhitungan Lingkaran =============");
        System.out.println("Jari jari Lingkaran\t: ".concat(String.valueOf(getJariJari())));
        System.out.printf("Luas Lingkaran\t\t: %.2f\n", getLuasLingkaran());
        System.out.printf("Keliling Lingkaran\t: %.2f\n", getKelilingLingkaran());
    }

}
