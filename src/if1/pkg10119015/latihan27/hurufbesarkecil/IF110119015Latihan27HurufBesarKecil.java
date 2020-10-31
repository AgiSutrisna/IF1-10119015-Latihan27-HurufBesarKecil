/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan27.hurufbesarkecil;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class IF110119015Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String besar, kecil ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan kalimat : ");
        String nama = scanner.nextLine();
        System.out.println("=====Hasil Formatting=====");
        System.out.println("Huruf Besar : "+ nama.toUpperCase());
        System.out.println("Huruf Kecil : "+ nama.toLowerCase());
    }
}
