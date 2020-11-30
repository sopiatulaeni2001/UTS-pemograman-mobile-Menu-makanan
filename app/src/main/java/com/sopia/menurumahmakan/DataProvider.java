package com.sopia.menurumahmakan;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.sopia.menurumahmakan.makanan.Menu;
import com.sopia.menurumahmakan.makanan.Makanan;
import com.sopia.menurumahmakan.makanan.Minuman;

public class DataProvider {
    private static List<Menu> menus = new ArrayList<>();

    private static List<Makanan> initDataMakanan(Context ctx) {
        List<Makanan> makanans = new ArrayList<>();
        makanans.add(new Makanan("Sambal terasi", "Rp5.000",
                "Bahan-bahan:\n" +
                        "- 10 buah cabai rawit\n" +
                        "- 2 buah cabai merah\n" +
                        "- 10 buah rampai/tomat kecil cherry\n" +
                        "- 2 buah terasi ready pakai\n" +
                        "- 1 sdt gula pasir\n" +
                        "- 1/2 sdt garam", R.drawable.sambal_terasa));
        makanans.add(new Makanan("Cah kangkung terasi", "Rp5.000",
                "Bahan-bahan:\n" +
                        "- 1 ikat kangkung\n" +
                        "- 4 butir bawang merah\n" +
                        "- garam secukupnya\n" +
                        "- 5 buah cabai rawit merah\n" +
                        "- minyak goreng secukupnya\n" +
                        "- 2 siung bawang putih\n" +
                        "- 1/2 sendok teh terasi bakar\n" +
                        "- gula pasir secukupnya", R.drawable.cah_kangkung));
        makanans.add(new Makanan("Sayur lodeh nangka", "Rp10.000",
                "Cara memasak:\n" +
                        "1. Rebus santan, bumbu halus, daun salam dan lengkuas sampai harum\n" +
                        "2. Masukkan nangka muda, gula merah, serta garam. kemudian rebus hingga matang\n" +
                        "3. Masukkan labu siam, terong, kacang panjang, cabai hijau, dan daun melinjo. Masak hingga lodeh matang.", R.drawable.sayur_lodeh));
        makanans.add(new Makanan("Teri tumis cabai bawang", "Rp15.000",
                "Bahan-bahan:\n" +
                        "- 200 gr teri jengki\n" +
                        "- 150 gr bawang merah, iris\n" +
                        "- cabai rawit hijau secukupnya, iris\n" +
                        "- cabai rawit merah secukupnya, iris\n" +
                        "- cabai merah keriting secukupnya, iris\n" +
                        "- 3 lembar daun jeruk, iris tipis\n" +
                        "- 1 sdt terasi", R.drawable.teri_tumis));
        makanans.add(new Makanan("Teri kacang bumbu balado", "Rp15.000",
                "Bahan-bahan:\n" +
                        "- 150 gr kacang tanah, goreng\n" +
                        "- 250 gr teri medan, goreng\n" +
                        "- 2 lembar daun salam\n" +
                        "- 1 cm lengkuas, memarkan\n" +
                        "- 3 sdm air asam Jawa\n" +
                        "- 2 sdm gula putih\n" +
                        "- 2 lembar daun jeruk iris halus buang tulangnya\n" +
                        "- minyak goreng secukupnya untuk menumis", R.drawable.teri_sambal));
        makanans.add(new Makanan("Gulai daun singkong", "Rp25.000",
                "Bahan-bahan:\n" +
                        "- daun singkong (siangi, rebus, lalu cuci bersih, tiriskan)" +
                        "Bumbu:\n" +
                        "- 13 buah cabai rawit\n" +
                        "- 5 siung bawang merah\n" +
                        "- 4 siung bawang putih\n" +
                        "- 3 butir kemiri (sangrai)\n" +
                        "- 1 sdt ketumbar (sangrai)\n" +
                        "- 1 sdt merica\n" +
                        "- 1 sdt kunyit bubuk\n" +
                        "- 1 kotak santan kara\n" +
                        "- garam, gulpas dan penyedap rasa secukupnya\n", R.drawable.daun_singkong));
        return makanans;
    }

    private static List<Minuman> initDataMinuman(Context ctx) {
        List<Minuman> minumans = new ArrayList<>();
        minumans.add(new Minuman("Es jelly mangga", "Rp10.000",
                "Bahan-bahan:\n" +
                        "- 1 saset Nutrijell mangga\n" +
                        "- Gula pasir secukupnya\n" +
                        "- 1 kaleng susu kental manis\n" +
                        "- 1,5 liter air\n" +
                        "- 2 buah mangga manis\n" +
                        "- 3 saset Nutrisari mangga\n" +
                        "- 2 saset Nutrisari jeruk manis", R.drawable.minuman1));
        minumans.add(new Minuman("Es cappucino cincau", "Rp10.000 ",
                "Bahan-bahan:\n" +
                        "- 2 saset cappucino cincau\n" +
                        "- 2 saset kental manis\n" +
                        "- 5 sdm fiber cream, larutkan dengan 750 ml air\n" +
                        "- Es batu secukupnya\n" +
                        "- Gula pasir dilarutkan secukupnya\n" +
                        "- Air secukupnya\n" +
                        "- 1 buah cincau potong dadu, sebagian diserut", R.drawable.minuman2));
        minumans.add(new Minuman("Es mangga kelapa muda", "Rp15.000",
                "Bahan-bahan:\n" +
                        "- 3 cup mangga potong dadu\n" +
                        "- 2 cup kelapa muda kerok\n" +
                        "- 2 cup nata de coco\n" +
                        "- 2 sdm biji selasih, rendam air panas\n" +
                        "- 900 ml air kelapa\n", R.drawable.minuman3));
        minumans.add(new Minuman("Es thai tea", "Rp10.000",
                "Bahan-bahan:\n" +
                        "- 1/2 gelas teh panas\n" +
                        "- 3 sdm bubuk creamer\n" +
                        "- 2 sdm gula pasir\n" +
                        "- 2 sdm susu kental manis putih\n" +
                        "- Es batu", R.drawable.minuman4));
        minumans.add(new Minuman("Soda gembira", "Rp10.000",
                "Bahan-bahan:\n" +
                        "- Daun mint\n" +
                        "- Strawberry\n" +
                        "- Mangga\n" +
                        "- Sprit atau soda\n" +
                        "- 1 sdt gula pasir\n" +
                        "- Es batu", R.drawable.minuman6));
        minumans.add(new Minuman("Es semangka susu", "Rp5000",
                "Bahan-bahan:\n" +
                        "- 1/2 buah semangka, cacah kasar atau sesuai selera\n" +
                        "- 1000 ml susu cair full cream\n" +
                        "- 250 ml sirup marjan coco pandan atau sesuai selera ", R.drawable.minuma5));
        return minumans;
    }

    private static void initAllMenus(Context ctx) {
        menus.addAll(initDataMakanan(ctx));
        menus.addAll(initDataMinuman(ctx));
    }

    public static List<Menu> getAllMenu(Context ctx) {
        if (menus.size() == 0) {
            initAllMenus(ctx);
        }
        return  menus;
    }

    public static List<Menu> getMenusByTipe(Context ctx, String nama) {
        List<Menu> menusByType = new ArrayList<>();
        if (menus.size() == 0) {
            initAllMenus(ctx);
        }
        for (Menu h : menus) {
            if (h.getNama().equals(nama)) {
                menusByType.add(h);
            }
        }
        return menusByType;
    }

}