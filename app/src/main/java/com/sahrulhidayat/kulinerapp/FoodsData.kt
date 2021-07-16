package com.sahrulhidayat.kulinerapp

object FoodsData {
    private val foodNames = arrayOf("Anyang Pakis",
        "Ayam Pinandar",
        "Bihun Bebek",
        "Bika Ambon",
        "Gulai Ikan Patin",
        "Gulaie Keumamah",
        "Kacimuih",
        "Karee Kameng",
        "Mie Aceh",
        "Rendang")

    private val foodCities = arrayOf("Sumatera Utara",
        "Batak Toba",
        "Medan",
        "Ambon",
        "Jambi",
        "Aceh",
        "Sumatera Barat",
        "Aceh",
        "Aceh",
        "Padang")

    private val foodPrices = arrayOf("Rp.10.000",
        "Rp.80.000",
        "Rp.50.000",
        "Rp.67.000",
        "Rp.20.000",
        "Rp.23.000",
        "Rp.10.000",
        "Rp.30.000",
        "Rp.22.000",
        "Rp.75.000")

    private val foodDetail = arrayOf("Di provinsi Sumatera Utara tepatnya di kabupaten Asahan, terdapat makanan khas daerah tersebut yang dinamakan dengan Anyang Pakis. Makanan khas Sumatera Utara ini dibuat dari tanaman pakis atau tanaman paku kemudian diberi bumbu tambahan berupa kelapa hasil penyangraian.",
        "Ayam Pinadar juga lazim disebut manuk na pinadar. Masakan ini adalah ayam bakar khas Batak Toba yang sungguh memukau rasa pedasnya sangat menggigit karena memakai andaliman.",
        "Di Medan terdapat sebuah kedai sederhana namun punya olahan bernama bihun bebek Asie yang disebut-sebut sebagai olahan bihun bebek paling mahal seantero Medan. Harga satu porsinya saja bisa mencapai 60 ribu rupiah.",
        "Makanan khas di Sumatera Utara khususnya Medan adalah Bika Ambon. Bika Ambon ini enak banget kadang juga dijual dengan rasa lain seperti durian dan keju. Rasanya manis dan lembut.",
        "Gulai ikan Patin adalah masakan yang populer di masyarakat Jambi.  Gulai ini dimasak dengan menggunakan tempoyak yaitu daging buah durian yang telah difermentasi. Tetapi ada sebagian orang yang memilih untuk mengganti tempoyak dengan santan kelapa untuk menghindari bau dan rasa tempoyak yang cukup menyengat.",
        "Keumamah dalam bahasa Aceh artinya ikan kayu. Masakan ini disebut Gulaie Keumamah atau nama populernya Eungkot Kayee.  Pada dasarnya Keumamah atau ikan kayu khas Aceh adalah daing ikan tongkol yang direbus, kemudian dikeringkan dengan cara diasap.",
        "Olahan khas Sumatera Barat cukup melimpah yang salah satunya adalah Kacimuih. Walaupun dibuat dengan bahan dasar singkong yang cenderung “ndeso”, namun setelah menjadi kacimuih maka rasanya akan berbeda.",
        "Karee Kameng adalah makanan tradisional khas dari Aceh yang dijuluki Serambi Mekkah-nya Indonesia.  Makanan ini merupakan sajian yang paling favorit oleh warga Aceh. Karee Kameng dalam bahasa Indonesia disebut kari kambing adalah lauk yang hampir selalu ada di setiap kedai nasi maupun di berbagai perhelatan.",
        "Provinsi Aceh terkenal dengan Mie Acehnya. Mie kuning tebal dengan irisan daging disajikan dalam sup sejenis kari yang gurih dan pedas. Makanan ini benar-benar kaya bumbu.",
        "Sumatera Barat terkenal dengan makanan Padang yang berasal dari kota Padang. Makanan yang banyak rempahnya ini mempunyai rasa yang kuat. Rendang adalah salah satu masakan Padang yang menjadi favorit banyak orang Indonesiabahkan sampai luar negeri.")

    private val foodImages = intArrayOf(R.drawable.anyang_pakis,
        R.drawable.ayam_pinadar,
        R.drawable.bihun_bebek,
        R.drawable.bika_ambon,
        R.drawable.gulai_ikan_patin,
        R.drawable.gulaie_keumamah,
        R.drawable.kacimuih,
        R.drawable.karee_kameng,
        R.drawable.mie_aceh,
        R.drawable.rendang)

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val food = Food()
                food.name = foodNames[position]
                food.description = foodDetail[position]
                food.photo = foodImages[position]
                food.city = foodCities[position]
                food.price = foodPrices[position]
                list.add(food)
            }
            return list
        }

}