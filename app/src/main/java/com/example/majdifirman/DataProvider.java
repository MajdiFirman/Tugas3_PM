package com.example.majdifirman;

import android.content.Context;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.example.majdifirman.model.Anjing;
import com.example.majdifirman.model.Hewan;
import com.example.majdifirman.model.Kucing;
import com.example.majdifirman.model.Dinosaurus;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Dinosaurus> initDataDinosaurus(Context ctx) {
        List<Dinosaurus> dinosauruses = new ArrayList<>();
        dinosauruses.add(new Dinosaurus("T rex", "Zaman Purba",
                "Tyrannosaurus rex atau T-rex bisa dibilang sebagai spesies dinosaurus paling populer di dunia", R.drawable.dino_tyranno));
        dinosauruses.add(new Dinosaurus("Annkilosaurus", "Zaman Purba",
                "Mereka sering kali disamakan seperti tank hidup karena bagian punggungnya dilapisi deretan tulang keras berbentuk seperti bonggol besar. ", R.drawable.dino_ankilo));
        dinosauruses.add(new Dinosaurus("Brontosaurus", "Zaman Purba",
                "Nama Brontosaurus sendiri ternyata punya arti yang keren yaitu 'kadal petir'.", R.drawable.dino_bronto));
        dinosauruses.add(new Dinosaurus("Pteranodon", "Zaman Purba",
                "Bentang sayap mereka mencapai 6 meter dan beratnya bisa mencapai 36 kg.   ", R.drawable.dino_ptera));
        dinosauruses.add(new Dinosaurus("Stegosasurus", "Zaman Purba",
                "memiliki penampilan yang sangat ikonik dengan lempeng duri-duri di sepanjang punggungnya.", R.drawable.dino_stego));
        dinosauruses.add(new Dinosaurus("Triceratops", "Zaman Purba",
                "Triceratops secara harfiah berarti 'wajah bertanduk tiga' dan memang tiga tanduknya itulah yang jadi ciri khas mereka. ", R.drawable.dino_tricera));
        return dinosauruses;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataDinosaurus(ctx));
    }


    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
