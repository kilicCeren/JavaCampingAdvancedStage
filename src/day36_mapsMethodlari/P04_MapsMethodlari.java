package day36_mapsMethodlari;

import java.util.Map;
import java.util.TreeMap;

public class P04_MapsMethodlari {

    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<>();

        map.put("W", 10);
        map.put("I", 40);
        map.put("S", 25);
        map.put("E", 100);
        System.out.println("İlk map: " + map); // İlk map: {E=100, I=40, S=25, W=10}

        map.replace("I", 60);
        System.out.println(map); // {E=100, I=60, S=25, W=10}

        map.put("S", 30); // map.put("S",30); ile aynı sonucu verir
        // Varolan key'lerde put ile replace arasında bir fark yoktur
        System.out.println(map); // {E=100, I=60, S=30, W=10}
        map.put("W", 140);
        System.out.println(map); // {E=100, I=60, S=30, W=140}

        map.replace("Y", 2024);
        // var olmayan key için put kullanırsanız ekler ama replace derseniz hiçbir işlem yapmaz
        System.out.println(map); // {E=100, I=60, S=30, W=140}

        map.replace("W", 140, 1980);
        System.out.println(map); // {E=100, I=60, S=30, W=1980}
        // Bu methodda önce eski değere(ilk yazılana) bakar doğru ise 2.yazılanı onunla değiştirir

        map.replace("W", 140, 145);
        System.out.println(map); // {E=100, I=60, S=30, W=1980}

        System.out.println(map.getOrDefault("X", 500)); // 500
        System.out.println(map);

        map.remove("W", 1980);
        System.out.println(map); // {E=100, I=60, S=30}


    }
}
