package jobsheet5;
import java.util.Scanner;

public class nestedUjianSkripsi17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();

        
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        String pesan = "";

        
        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8) {
                if (bimbinganP2 >= 4) {
                    pesan = "Mahasiswa dapat mendaftar ujian skripsi";
                } else {
                    pesan = "Gagal! Log bimbingan Pembimbing 2 belum mencapai 4 kali";
                }
            } else {
                pesan = "Gagal! Log bimbingan Pembimbing 1 belum mencapai 8 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }

        
        System.out.println(pesan);

        sc.close();
    }
}
