package com.bizantech.resepmakanan

object FoodData {
    private val foodName = arrayOf(
        "Keripik Tahu",
        "Keripik Tempe",
        "Omlet Telur",
        "Oncom Goreng",
        "Sambel Tempe",
        "Tahu Petis",
        "Telur Balado",
        "Telur Gulung Sosis",
        "Tempe Teriyaki",
        "Tim Telur"
    )

    private val foodLevel = arrayOf(
        "Level : Mudah\nWaktu : 30 Menit",
        "Level : Mudah\nWaktu : 25 Menit",
        "Level : Sulit\nWaktu : 40 Menit",
        "Level : Mudah\nWaktu : 45 Menit",
        "Level : Mudah\nWaktu : 25 Menit",
        "Level : Sulit\nWaktu : 50 Menit",
        "Level : Mudah\nWaktu : 25 Menit",
        "Level : Mudah\nWaktu : 30 Menit",
        "Level : Mudah\nWaktu : 30 Menit",
        "Level : Sedang\nWaktu : 45 Menit"
    )

    private val foodIngredients = arrayOf(
        "- Tempe, 2 papan - 300 gram\n" +
                "- Bawang bombay, iris lebar - 1/2 buah\n" +
                "- Bawang putih, cincang - 4 siung\n" +
                "- Cabai merah, iris serong - 3 buah\n" +
                "- Kecap manis - 1 sdm\n" +
                "- Saus teriyaki - 2 sdm\n" +
                "- Daun bawang, potong-potong - 2 tangkai\n" +
                "- Garam - secukupnya\n" +
                "- Gula - secukupnya\n" +
                "- Wijen sangrai, untuk taburan - secukupnya\n" +
                "- Minyak goreng - secukupnya",
        "- Telur - 3 butir\n" +
                "- Air - 50 ml\n" +
                "- Tepung tapioka - 1/2 sdm\n" +
                "- Sosis, potong jadi 2 - 6 buah\n" +
                "- Garam - 1/4 sdt\n" +
                "- Merica bubuk - 1/4 sdt\n" +
                "- Kaldu bubuk - 1/4 sdt\n" +
                "- Tusuk sate - 10 buah\n" +
                "- Saus sambal - secukupnya\n" +
                "- Mayonaise - secukupnya",
        "- Tahu putih - 10 potong\n" +
                "- Garam - 1 sdt\n" +
                "- Air - secukupnya\n" +
                "- Tepung terigu - 100 gram\n" +
                "- Tepung beras - 1 sdm\n" +
                "- Garam - 1 sdt\n" +
                "- Kaldu bubuk - 1/2 sdt\n" +
                "- Bubuk bawang putih - 1 sdt",
        "- Tempe (besar - kurang lebih 500 gram) - 2 papan\n" +
                "- Tepung beras - 80 gram\n" +
                "- Tepung tapioka - 20 gram\n" +
                "- Air - 200 ml\n" +
                "- Daun jeruk, iris halus - 2 lembar\n" +
                "- Bawang putih - 2 siung\n" +
                "- Kemiri - 2 butir\n" +
                "- Daun jeruk - 3 lembar\n" +
                "- Garam - 1 sdt\n" +
                "- Ketumbar bubuk - 1/2 sdm",
        "- Oncom ukuran sedang - 1 papan\n" +
                "- Bawang merah, cincang halus - 2 butir\n" +
                "- Bawang putih, cincang halus - 2 siung\n" +
                "- Daun bawang, cincang kasar - 1 batang\n" +
                "- Terigu - 8 sdm\n" +
                "- Tepung beras - 2 sdm\n" +
                "- Garam - 1/2 sdt\n" +
                "- Lada bubuk - 1/2 sdt\n" +
                "- Ketumbar bubuk - 1/4 sdt\n" +
                "- Kaldu ayam bubuk - secukupnya\n" +
                "- Air dingin - 150 ml\n" +
                "- Minyak goreng - secukupnya",
        "- Daging sapi cincang - 125 gram\n" +
                "- Telur, kocok lepas - 1 butir\n" +
                "- Bawang putih, cincang halus - 1 siung\n" +
                "- Kecap asin - 1 sdt\n" +
                "- Minyak wijen - 1 sdt\n" +
                "- Gula pasir - 1/4 sdt\n" +
                "- Merica bubuk - 1/4 sdt\n" +
                "- Garam - 1/4 sdt\n" +
                "- Air - 100 ml\n" +
                "- Cabai rawit, biarkan utuh - 6 buah\n" +
                "- Daun bawang, iris halus - 1 batang\n" +
                "- Bawang putih, cincang lalu goreng - 1 sdm\n",
        "- Telur ayam - 2 butir\n" +
                "- Bawang bombai, cincang kasar - 2 sdm\n" +
                "- Paprika, potong kotak-kotak - 2 sdm\n" +
                "- Tomat. potong kotak-kotak - 2 sdm\n" +
                "- Jamur champignon, iris tipis - 2 buah\n" +
                "- Sosis, iris tipis - 2 buah\n" +
                "- Keju mozzarella atau cheddar cepat leleh, potong kotak-kotak - 1 sdm\n" +
                "- Keju cheddar, parut - 1 sdm\n" +
                "- Susu cair - 3 sdm\n" +
                "- Garam - 1/2 sdt\n" +
                "- Merica - 1/4 sdt\n" +
                "- Margarin, untuk menumis - 2 sdm\n",
        "- Tahu putih, goreng - 6 potong\n" +
                "- Bawang putih, haluskan - 5 siung\n" +
                "- Cabai merah, haluskan - 2 buah\n" +
                "- Serai, memarkan - 2 batang\n" +
                "- Petis - 100 gram\n" +
                "- Garam - 1/2 sdt\n" +
                "- Gula - 1/2 sdt\n" +
                "- Air - 50 ml\n" +
                "- Minyak, untuk menumis - secukupnya\n",
        "- Tempe - 1/2 bungkus\n" +
                "- Daun kemangi - 1/2 bungkus\n" +
                "- Minyak untuk menumis - 2 sdm\n" +
                "- Garam - 1/4 sdt\n" +
                "- Kaldu jamur - 1/4 sdt\n" +
                "- Gula pasir - 1/4 sdt\n" +
                "- Bawang merah - 3 siung\n" +
                "- Bawang putih - 2 siung\n" +
                "- Cabe rawit, sesuai selera - 4 biji\n" +
                "- Cabe keriting merah - 3 biji\n" +
                "- Kencur - 1 ruas",
        "- Telur - 7 butir\n" +
                "- Bawang merah - 8 siung\n" +
                "- Bawang putih - 2 siung\n" +
                "- Cabe keriting merah - 8 biji\n" +
                "- Cabe rawit merah - 3 biji\n" +
                "- Serai, memarkan - 1 batang\n" +
                "- Daun jeruk - 3 lembar\n" +
                "- Garam - 1 sdt\n" +
                "- Gula - 1/2 sdt\n" +
                "- Minyak untuk menumis - 3 sdm\n" +
                "- Air - secukupnya\n"
    )

    private val foodDirections = arrayOf(
        "1. Potong-potong tempe kecil memanjang kemudian goreng setengah matang. Angkat dan tiriskan.\n" +
                "2. Tumis bawang putih, bawang bombay, dan cabai merah sampai harum. Masukkan tempe aduk rata.\n" +
                "3. Tambahkan kecap manis, saus teriyaki, garam dan gula. Masak sampai bumbu meresap, koreksi rasanya lalu angkat.\n" +
                "4. Sajikan dengan taburan wijen sangrai dan irisan daun bawang.",
        "1. Tusuk sosis yang sudah dipotong-potong dengan tusuk sate. Kemudian, goreng sebentar saja, sisihkan.\n" +
                "2. Dalam mangkuk, campur air dengan tepung tapioka aduk rata. Tambahkan telur, air, garam, merica bubuk dan kaldu bubuk. Kocok rata dengan menggunakan garpu.\n" +
                "3. Siapkan wajan kecil, beri minyak agak banyak panaskan dengan api sedang. Tunggu sampai minyak benar-benar panas.\n" +
                "4. Masukkan satu sendok sayur adonan telur ke dalam minyak panas, menuangnya dari atas supaya telur menyebar.\n" +
                "5. Ambil 1 buah sosis, langsung gulung sampai sosis tertutup telur rapikan gulungan telur ditepi wajan. Proses ini harus dilakukan dengan cepat, kalau kelamaan telur tidak akan menempel.\n" +
                "6. Tiriskan telur gulung yang sudah digoreng diatas tisu, supaya tidak begitu berminyak. Goreng semua sampai adonan habis.\n" +
                "7. Sajikan dengan saus sambal dan mayonaise.\n",
        "1. Potong-potong tahu jadi 4 bagian, kemudian rendam sebentar dengan air yang sudah dicampur 1 sendok teh garam.\n" +
                "2. Goreng tahu hingga matang, angkat dan tiriskan, diamkan hingga dingin.\n" +
                "3. Belah tahu pada salah satu sisinya, kemudian keluarkan bagian dalam isi tahu. Bagian isi jangan dibuang, bisa diolah menjadi makanan lain.\n" +
                "4. Campur semua bahan kering untuk pelapis, aduk rata. Kemudian lumuri tahu yang dikeluarkan isinya dengan bahan pelapis sampai rata.\n" +
                "5. Goreng dalam minyak panas dengan api sedang sampai kering, angkat dan tiriskan.\n" +
                "6. Biarkan dingin, keripik tahu renyah siap disajikan.",
        "1. Iris tipis-tipis tempe, sisihkan. Lalu campur semua bahan basah untuk pelapis. Airnya dituang sedikit dulu dalam campuran tepung. Aduk sampai licin baru masukkan sisa air. Untuk keripik tempe ini adonan pelapis tidak kental tetapi cenderung encer ya.\n" +
                "2. Haluskan semua bumbu halus, kemudian campurkan dalam bahan pelapis aduk rata.\n" +
                "3. Masukkan tempe dalam bahan pelapis satu per satu, kemudian langsung goreng dalam minyak panas hingga seluruh permukaannya terendam. Saat mencelup gunakan tangan ya, jangan memakai sendok untuk menghindari tepung yang menggumpal.\n" +
                "4. Goreng dengan api sedang sampai kering keemasan, angkat dan tiriskan.\n" +
                "5. Oven keripik tempe yang sudah digoreng dengan suhu rendah 100°C selama 20 menit, supaya keripik tempe tahan renyah.",
        "1. Didihkan air dalam panci. Bersihkan oncom dengan menyiram seluruh permukaan oncom. Tiriskan lalu potong sesuai selera\n" +
                "2. Campur tepung terigu, tepung beras, dan bahan lainnya. aduk hingga rata.\n" +
                "3. Tuang 150 ml air dingin dalam adonan tepung bumbu, aduk sampai tidak ada tepung yg bergerindil.\n" +
                "4. Panaskan minyak goreng, celup oncom dengan adonan tepung bumbu lalu goreng sampai kecoklatan, tiriskan. Sajikan ketika hangat.",
        "1. Panaskan panci kukusan atau dandang. Sisihkan.\n" +
                "2. Dalam wadah, campur semua bahan menggunakan garpu hingga rata.\n" +
                "3. Tuang adonan ke dalam wadah tahan panas seperti loyang, pyrex, atau mangkok aluminium.\n" +
                "4. Kukus adonan hingga setengah matang. Beri bahan taburan di atasnya. Kukus kembali hingga matang. Angkat.\n" +
                "5. Siap disajikan.",
        "1. Dalam wadah, kocok telur bersama keju parut, susu cair, garam dan merica hingga rata.\n" +
                "2. Panaskan margarin. Tumis bawang bombai, paprika, jamur, dan sosis. Masak hingga bombai harum dan jamur matang. Ratakan bahan ke seluruh wajan. Kecilkan api.\n" +
                "3. Tuang kocokan telur dan masak hingga setengah matang.\n" +
                "4. Masukkan tomat dan keju kotak-kotak. Lipat omelet jadi bentuk setengah lingkaran. Tutup wajan sebentar dan masak sampai keju meleleh. Angkat.\n" +
                "5. Siap disajikan.\n",
        "1. Panaskan sedikit minyak. Tumis bawang putih, cabai, dan serai hingga harum.\n" +
                "2. Tuang petis dan air. Aduk rata hingga tidak ada petis menggumpal dan biarkan hingga mendidih. Koreksi rasanya.\n" +
                "3. Bumbui dengan garam dan gula. Aduk rata lalu angkat.\n" +
                "4. Belah bagian tengah tahu tapi jangan sampai putus. Isi bagian tengahnya dengan saus petis.",
        "1. Potong tempe sesuai selera, goreng setengah matang, angkat dan sisihkan\n" +
                "2. Ulek kasar tempe.\n" +
                "3. Tumis bumbu halus dengan sedikit minyak, tambahkan gula, garam dan kaldu jamur. Test rasa.\n" +
                "4. Masukkan tempe, aduk hingga bumbu rata.\n" +
                "5. Tambahkan daun kemangi sesaat sebelum api kompor dimatikan.\n",
        "1. Rebus telur sampai matang lalu kupas kulitnya.\n" +
                "2. Haluskan bawang merah, bawang putih, cabe rawit dan cabe keriting, cukup kasar saja tidak perlu terlalu halus agar bertekstur.\n" +
                "3. Tumis bumbu yg sudah dihaluskan, tambahkan serai, daun jeruk. Tumis sampai harum.\n" +
                "4. Tambahkan air, masukkan telur.\n" +
                "5. Masukan garam dan gula pasir. Sesuaikan rasanya.\n" +
                "6. Masak sampai air menyusut dan bumbu meresap ke telur.\n" +
                "\n"
    )

    private val foodImage = intArrayOf(
        R.drawable.keripik_tahu,
        R.drawable.keripik_tempe,
        R.drawable.omlet_telur,
        R.drawable.oncom_goreng,
        R.drawable.sambel_tempe,
        R.drawable.tahu_petis,
        R.drawable.telur_balado,
        R.drawable.telur_gulung_sosis,
        R.drawable.tempe_teriyaki,
        R.drawable.tim_telur
    )

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodName.indices) {
                val food = Food()
                food.nama = foodName[position]
                food.level = foodLevel[position]
                food.bahan = foodIngredients[position]
                food.petunjuk = foodDirections[position]
                food.gambar = foodImage[position]
                list.add(food)
            }
            return list
        }
}
