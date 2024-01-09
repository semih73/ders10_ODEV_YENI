import java.util.*;

public class TekrarEdenHarfleriOlanKelimeler {

    public static String[] tekrarEdenHarfleriOlanKelimeleriBul(String[] kelimeler) {
        List<String> sonucListesi = new ArrayList<>();

        for (String kelime : kelimeler) {
            if (tekrarEdenHarfVarMi(kelime)) {
                sonucListesi.add(kelime);
            }
        }

        // Listeyi String dizisine çevirme
        String[] sonucDizisi = new String[sonucListesi.size()];
        sonucDizisi = sonucListesi.toArray(sonucDizisi);

        return sonucDizisi;

    }


    private static boolean tekrarEdenHarfVarMi(String kelime) {
        Map<Character, Integer> harfSayilari = new HashMap<>();

        for (char harf : kelime.toCharArray()) {
            harfSayilari.put(harf, harfSayilari.getOrDefault(harf, 0) + 1);
        }

        for (int sayi : harfSayilari.values()) {
            if (sayi > 1) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String[] kelimelerDizisi = {"elma", "armut", "lama", "mal", "tala", "kavak"};
        System.out.println("Tüm Metin: ");
        for (String tumMetin : kelimelerDizisi) {
            System.out.println(tumMetin);
        }

        String[] sonuclar = tekrarEdenHarfleriOlanKelimeleriBul(kelimelerDizisi);
        System.out.println("Aynı karakterden içeren eleman listesi: ");
        for (String kelime : sonuclar) {
            System.out.println(kelime);
        }

        if (sonuclar.length > 2) {
            String[] yeniDizi = new String[2];  // Yeni diziyi oluştur

            for (int i = 0; i < yeniDizi.length; i++) {
                yeniDizi[i] = sonuclar[i];
            }
            System.out.println("Seçilen 2 kleime: " + Arrays.toString(yeniDizi));
            // İki kelimeli bir dizi tanımla
            String[] harfler = yeniDizi;
            // Harf dizisini oluştur ve yazdır
            char[] harfDizisi = harfDizisiOlustur(harfler);
            System.out.println(harfDizisi);
        }
    }

    // İki kelimeli dizinin harflerinden yeni bir harf dizisi oluştur
    public static char[] harfDizisiOlustur(String[] harfler) {
        // Toplam harf sayısını hesapla
        int toplamHarfSayisi = 0;
        for (String kelime : harfler) {
            toplamHarfSayisi += kelime.length();
        }

        // Harf dizisini oluştur
        char[] harfDizisi = new char[toplamHarfSayisi];
        int index = 0;
        for (String kelime : harfler) {
            for (int i = 0; i < kelime.length(); i++) {
                harfDizisi[index] = kelime.charAt(i);
                index++;
            }

        }
        //String[] sonHarfler = harfDizisi;
// Rastgele sıralama için Random nesnesi oluştur

        Random random = new Random();

        // Harf dizisindeki karakterleri rastgele sırayla yazdır
        for (int i = 0; i < harfDizisi.length; i++) {
            int randomIndex = random.nextInt(harfDizisi.length);
            System.out.print(harfDizisi[randomIndex]);
        }
        return harfDizisi;
    }

}




