package day36_mapsMethodlari;

import java.util.TreeMap;

public class P05_TreeMapMethodlari {

    public static void main(String[] args) {

        /*
             Map<String,Integer> map = new TreeMap<>();
             biz bu gösterimde objeyi treeMap yapmamıza rağmen
             data türü map seçildiği için
             BÜTÜN MAP özelliklerine ulaşabiliriz

             ama data türü de TreeMap seçilirse
             sadece treeMap'e özgü method'lar kullanılabilir

         */

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("H", 40);
        treeMap.put("T", 10);
        treeMap.put("M", 50);
        treeMap.put("L", 65);
        treeMap.put("C", 45);
        treeMap.put("SS", 25);
        System.out.println(treeMap); // {C=45, H=40, L=65, M=50, SS=25, T=10}

        // TreeMap index kullanmamasına rağmen doğal sıralı olduğu için
        // baştaki ve sondaki ya da onlardan bir önce veya sonraki elemana ulaşabiliriz

        System.out.println(treeMap.firstKey()); // C
        System.out.println(treeMap.lastKey()); // T
        System.out.println(treeMap.firstEntry()); // C=45
        System.out.println(treeMap.lastEntry()); // T=10

        System.out.println(treeMap.tailMap("M")); // {M=50, SS=25, T=10}
        System.out.println(treeMap.tailMap("L", true)); // {L=65, M=50, SS=25, T=10}
        System.out.println(treeMap.tailMap("L", false)); // {M=50, SS=25, T=10}

        // tailMap() verilen elemanda sona kadar olan entry'leri getirir
        // getirirken ikinci gösterimdeki false başlangıcı alma, true başlangıcı da al anlamı taşır
        // default olarak çalışırsa false çalışır

        System.out.println(treeMap.headMap("L")); // {C=45, H=40}
        System.out.println(treeMap.headMap("L", true)); // {C=45, H=40, L=65}
        // headMap() verilen keyden öncekileri getirir

        System.out.println(treeMap.higherKey("H")); // L
        System.out.println(treeMap.ceilingKey("H")); // H

        System.out.println(treeMap.descendingMap()); // sıralamayı tersine çevirir
        // {T=10, SS=25, M=50, L=65, H=40, C=45}
        System.out.println(treeMap.pollFirstEntry()); // C=45
        System.out.println(treeMap); // {H=40, L=65, M=50, SS=25, T=10}


    }
}
