/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg5;

import java.text.DecimalFormat;

/**
 *
 * @author ASUS
 */
public class SaldoTarget {
    public static void main(String[] args) {
        // Deklarasi variabel
        double saldoAwal = 3500000;
        double bunga = 0.08; // 8% bunga per bulan
        double saldoTarget = 6000000;

        // Format untuk menampilkan angka dengan titik sebagai pemisah ribuan
        DecimalFormat formatRupiah = new DecimalFormat("#,###.00");

        int bulan = 0;

        // Loop hingga saldo mencapai atau melebihi saldo target
        while (saldoAwal < saldoTarget) {
            bulan++;
            saldoAwal += saldoAwal * bunga; // Hitung bunga per bulan
            System.out.println("Saldo di bulan ke-" + bulan + " Rp. " + formatRupiah.format(saldoAwal));
        }
    }
}


