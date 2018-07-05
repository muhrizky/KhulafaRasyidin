package id.ac.undip.ce.student.muhammadrizqi.khulafarasyidin;

import java.util.ArrayList;

public class KhulafaData {
    public static String[][] data = new String[][]{
            {
                "Abu Bakar Ash-Shiddiq",
                    "Khalifah Islam Ke-1",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/Rashidun_Caliph_Abu_Bakr_as-%C8%98idd%C4%ABq_%28Abdullah_ibn_Abi_Quhafa%29_-_%D8%A3%D8%A8%D9%88_%D8%A8%D9%83%D8%B1_%D8%A7%D9%84%D8%B5%D8%AF%D9%8A%D9%82_%D8%B9%D8%A8%D8%AF_%D8%A7%D9%84%D9%84%D9%87_%D8%A8%D9%86_%D8%B9%D8%AB%D9%85%D8%A7%D9%86_%D8%A7%D9%84%D8%AA%D9%8A%D9%85%D9%8A_%D8%A7%D9%84%D9%82%D8%B1%D8%B4%D9%8A_%D8%A3%D9%88%D9%84_%D8%A7%D9%84%D8%AE%D9%84%D9%81%D8%A7%D8%A1_%D8%A7%D9%84%D8%B1%D8%A7%D8%B4%D8%AF%D9%8A%D9%86.svg/600px-thumbnail.svg.png",
                    " Abu Bakar menjadi khalifah Islam yang pertama pada tahun 632 hingga tahun 634 Masehi. Lahir dengan nama asli Abdul ka'bah bin Abi Quhafah.",
                    "Oktober 573 Mekkah, Jazirah Arab",
                    "23 Agustus 634 Madinah"
            },
            {
                "Umar bin Khattab",
                    "Khalifah Islam Ke-2",
                    "http://3.bp.blogspot.com/-2xsFstemj4s/WgS9fOJ8W3I/AAAAAAAAAUc/mcqaNEIbGwg_ErcatVlxmKBzxXHyU5IGQCK4BGAYYCw/s1600/2000px-rashidun_caliphs_umar_ibn_al-khattc481b_-_d8b9d98fd985d8b1_d8a8d986_d8a7d984d8aed8b7d991d8a7d8a8_d8abd8a7d986d98a_d8a7d984d8aed984d981d8a7d8a1_.png",
                "Umar bin Khattab berasal dari Bani Adi, salah satu rumpun suku Quraisy, suku terbesar di kota Mekkah saat itu. Ayahnya bernama Khattab bin Nufail Al Shimh Al Quraisyi dan ibunya Hantamah binti Hasyim, dari Bani Makhzum",
                    "c.583 Mekkah, Jazirah Arab","3 November 644 Madinah, Jazirah Arab"},
            {"Utsman bin Affan","Khalifah Islam Ke-3", "https://upload.wikimedia.org/wikipedia/commons/7/71/Uthman.png", "Utsman bin Affan adalah sahabat nabi dan juga khalifah ketiga dalam Khulafaur Rasyidin. Beliau dikenal sebagai pedagang yang kaya raya dan handal dalam bidang ekonomi namun sangat dermawan",
            "574 Ta'if, Jazirah Arab", "17 Juli 656 Madinah, Jazirah Arab"},
            {"Ali bin Abi Thalib", "Khalifah Islam Ke-4", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/Rashidun_Caliph_Ali_ibn_Abi_Talib_-_%D8%B9%D9%84%D9%8A_%D8%A8%D9%86_%D8%A3%D8%A8%D9%8A_%D8%B7%D8%A7%D9%84%D8%A8.svg/440px-Rashidun_Caliph_Ali_ibn_Abi_Talib_-_%D8%B9%D9%84%D9%8A_%D8%A8%D9%86_%D8%A3%D8%A8%D9%8A_%D8%B7%D8%A7%D9%84%D8%A8.svg.png",
            "Ali bin Abi Thalib sepupu dan sekaligus mantu Nabi Muhammad, setelah menikah dengan Fatimah az-Zahra. Ia pernah menjabat sebagai salah seorang khalifah pada tahun 656 sampai 661.", "599 Mekkah, Jazirah Arab","28 Januari 661 Najaf, Irak"}
    };
    public static ArrayList<Khulafa> getListData(){
        Khulafa khulafa = null;
        ArrayList<Khulafa> list = new ArrayList<>();
        for (int i = 0; i<data.length; i++){
            khulafa = new Khulafa();
            khulafa.setName(data[i][0]);
            khulafa.setRemarks(data[i][1]);
            khulafa.setPhoto(data[i][2]);
            khulafa.setDeskripsi(data[i][3]);
            khulafa.setLahir(data[i][4]);
            khulafa.setWafat(data[i][5]);

            list.add(khulafa);
        }

    return list;
    }

}
