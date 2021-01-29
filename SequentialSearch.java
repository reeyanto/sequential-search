/**
 * Dibuat oleh: Riyanto
 * Github: https://github.com/reeyanto
 */

public class SequentialSearch {

    private final String[] orang = {"Budi", "Adi", "Dodi", "Cindy", "Evi", "Fani"};

    private void tampil() {
        for (int i=0; i<orang.length; i++) {
            System.out.println((i+1) + ". " + orang[i]);
        }
        System.out.println();
    }

    private void cari(String key) {
        boolean ketemu = false;
        int posisi = 0;

        for (int i=0; i<orang.length; i++) {
            if (key.equalsIgnoreCase(orang[i])) {
                ketemu = true;
                posisi = i;
                break;
            }
        }

        if (ketemu) System.out.println(key + " ditemukan pada posisi ke: " + (posisi+1));
        else System.out.println(key + " tidak ditemukan!");
    }

    public static void main(String[] args) {
        SequentialSearch sequentialSearch = new SequentialSearch();
        sequentialSearch.tampil();
        sequentialSearch.cari("Evi");
    }
}
