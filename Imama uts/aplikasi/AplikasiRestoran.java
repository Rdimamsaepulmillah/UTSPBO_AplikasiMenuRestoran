package aplikasi;

// Package: aplikasi

import restoran.*;

public class AplikasiRestoran {
    public static void main(String[] args) {
        // Data restoran
        String namaRestoran = "Restoran Sederhana";
        int nomorMeja = 1;

        // Menu makanan
        Makanan makanan1 = new Makanan("Nasi Goreng", 25000, true);
        Makanan makanan2 = new Makanan("Ayam Bakar", 30000);

        // Menu minuman
        Minuman minuman1 = new Minuman("Es Teh", 8000, true);
        Minuman minuman2 = new Minuman("Es Jeruk", 10000, true);

        // Output restoran, nomor meja, menu makanan, dan minuman
        System.out.println("Restoran: " + namaRestoran);
        System.out.println("Nomor Meja: " + nomorMeja);
        System.out.println("Menu Makanan:");
        System.out.println("1. " + makanan1.getNama() + " - Rp" + makanan1.getHarga() + " - Pedas: " + makanan1.isPedas());
        System.out.println("2. " + makanan2.getNama() + " - Rp" + makanan2.getHarga() + " - Pedas: " + makanan2.isPedas());
        System.out.println("Menu Minuman:");
        System.out.println("1. " + minuman1.getNama() + " - Rp" + minuman1.getHarga() + " - Dingin: " + minuman1.isDingin());
        System.out.println("2. " + minuman2.getNama() + " - Rp" + minuman2.getHarga() + " - Dingin: " + minuman2.isDingin());
    }
}