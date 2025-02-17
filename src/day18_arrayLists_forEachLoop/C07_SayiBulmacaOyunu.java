package day18_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C07_SayiBulmacaOyunu {

    public static void main(String[] args) {


        // 0 ile 100 arasinda rastgele bir sayi olusturun

        Random random = new Random();
        int tutulanSayi = random.nextInt(100);

        // Kullanicilardan herkesin bir sayi tahmin etmesini isteyin
        // girilen sayilari bir liste olarak kaydedin
        // Kullanicilar Q girdiginde tahminlemeyi bitir
        // - olusturulan rastgele sayiyi
        // - yapilan tahminleri
        // - rastgele sayiya en yakin tahmini yazdirin


        List<Integer> tahminlerListesi = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String giris;  // Kullanıcı girişini tutacak değişken

        do {

            System.out.println("Bir tahmin giriniz! (Çıkmak için 'q' tuşuna basın...)");
            giris = scanner.nextLine();  // Kullanıcının girdisini string olarak al

            if (!giris.equalsIgnoreCase("q")) {


                int girilenSayi = Integer.parseInt(giris);  // String'i sayıya çevir

                if (girilenSayi >= 0 && girilenSayi < 100) {
                    tahminlerListesi.add(girilenSayi);
                } else {
                    System.out.println("Lütfen 0 ile 100 arasında bir sayı girin.");
                }


            }
        } while (!giris.equalsIgnoreCase("q"));  // Kullanıcı 'q' girene kadar döngü devam eder

        // - olusturulan rastgele sayiyi
        System.out.println("Tuttugum sayi : " + tutulanSayi);
        // - yapilan tahminleri
        System.out.println("Yapilan tahminler listesi : " + tahminlerListesi);

        // - rastgele sayiya en yakin tahmini yazdirin

        // [2,56,78,12,67,97]    tutulanSayi = 44


        int enYakinTahmin = tahminlerListesi.get(0);
        int enAzFark = enYakinTahmin > tutulanSayi ? enYakinTahmin - tutulanSayi : tutulanSayi - enYakinTahmin;


        for (int each : tahminlerListesi) {

            int eachFark = each > tutulanSayi ? each - tutulanSayi : tutulanSayi - each;


            if (eachFark < enAzFark) {
                enYakinTahmin = each;
                enAzFark = eachFark;
            }

        }

        System.out.println("En yakin tahmin : " + enYakinTahmin);


        // [2,56,78,12,67,97]    tutulanSayi = 44

    }
}


