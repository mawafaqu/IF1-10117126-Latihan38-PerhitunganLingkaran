/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117126.latihan38.perhitunganlingkaran;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author
 * Nama : Mawa Faqu Rochman
 * Kelas : IF-1
 * NIM : 10117126
 * Deskripsi Program : Program ini berisi perhitungan lingkaran
 */
public class IF110117126Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        int diameter = 0;

        System.out.println("\n=============== Perhitungan Lingkaran ===============");

        do {
            try {
                System.out.print("\nMasukan Nilai diameter Lingkaran : ");
                diameter = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Nilai Diameter tidak sesuai\n");
                scanner = new Scanner(System.in);
            }
        } while (!valid);

        lingkaran lingkaran = new lingkaran(diameter);
        lingkaran.printResult();
    }

}
