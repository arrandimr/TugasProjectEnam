package com.example.tugasprojectenam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createJajanData()
        rv_jajanan.layoutManager = LinearLayoutManager(this)
        rv_jajanan.setHasFixedSize(true)
        rv_jajanan.adapter = AdapterJajanan(testData, { jajanItem : DataJajanan -> ItemJajanClicked(jajanItem)})
    }
    private fun ItemJajanClicked(jajanItem : DataJajanan) {
        val showDetailActivityIntent = Intent(this, DetailJajananActivity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, jajanItem.gambar)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, jajanItem.nama)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, jajanItem.desc)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, jajanItem.alamat)
        startActivity(showDetailActivityIntent)
    }
    private fun createJajanData() : List<DataJajanan>{
        val partList = ArrayList<DataJajanan>()
        partList.add(DataJajanan(
                R.drawable.mie,
                "INDOMIE VIRAL DEKAT JUANDA",
                "#indomiesugarpakhar pindah gaess ‼\n" +
                    "Pindahnya cuma di samping tempat jualan lamanya sih. Tapi tempat yg sekarang lebih nyaman \n" +
                    "Langsung pesen #indomie dobel karena seharian belum makan extra telur 1/2 mateng & sayur yg bikin rasanya sedep itu KUAHNYA ! \n" +
                    "Kira-kira itu digantinya tiap berapa kali ya? Wkwkwkwkwk\n" +
                    "\n" +
                    "Operational hours : 18.00 - 23.30 (Minggu libur)",
                "Jl. Raya Taman Asri No. 66, Pondok Candra"))

        partList.add(DataJajanan(
                R.drawable.baksosoto,
                "HIDDEN GEM BAKSO SOTO!",
                "Hahhh bakso soto? Ini beneran bakso bukan pentol yo rek, kuahnya pake soto juga, bapake jg udah jualan belasan taun, dan rasanya MANTAP! Wajib bgt kalian cobain. \n" +
                "BAKSO SOTO - IDR 10k/porsi\n" +
                "GORENGAN - IDR 1k/biji\n" +
                "Operational hours : 13.30 - 21.00 (Hari Besar libur)",
                "Jl. Kuwukan Gang Langgar (sebelah Musholla Al Huda), Surabaya"))

        partList.add(DataJajanan(
                R.drawable.espermen,
                "ES PERMEN KARET!",
                "Hayo siapa yang belum sempet cobain Es Permen Karet?\n" +
                        "Kuy wajib cobain deh, mimin udah lamaaa pengen coba tapi blm pernah kesampean\n" +
                        "Kalau dulur dulur apakah sudah ada yang pernah coba?",
                "Ampel Surabaya"))

        partList.add(DataJajanan(
                R.drawable.bebeklaguna,
                "Nasi Bebek LAGUNA",
                "Bebek LAGUNA muantepp polll ! Baru buka aja udah banyak yang bungkus. Bebeknya garing di luar lembut di dalem ditambah sambel 2 macam : tomat & pencit + bumbu kuning \n" +
                        "Cusss langsung merapat !\n" +
                        "Jam Buka 16:00 - 21:00\n" +
                        "Harga \n" +
                        "- Bebek 15.000\n" +
                        "- Nasi 3.000\n" +
                        "- Jeroan (usus) 2.000\n" +
                        "- Tempe/ Tahu 1.000",
                "Jl. Klampis Jaya 10, Sby\n" +
                        "(sebrang ruko 21 klampis)"))

        partList.add(DataJajanan(
                R.drawable.baksoomen,
                "BAKSO OMEN AGAIN",
                "Fix nanti mau ke sini! Gak tau kenapa seneng aja ngliat tumpukan bakso sebanyak gini rek Pasti bikin kalap pengen makan sepuasnya, macem baksonya buanyaaaak tinggal ambil2 sendiri ajah rek \n" +
                        "Setiap hari, jam 19.00-00.00",
                "Jl. Raya Darmo Baru Barat, Surabaya (depan GKI Dasa)"))

        partList.add(DataJajanan(
                R.drawable.krengsengbebek,
                "Bebek Krengsengan Asli Trenggalek",
                "Bebek Krengsengan Asli Trenggalek ini bener2 uenaakk bray Bebeknya gede & g alot, trs bumbu hitamnya nampoll bgt",
                " Nasi Bebek Krengsengan Asli Trenggalek .\n" +
                        "JI. Dharmahusada, Surabaya"))

        partList.add(DataJajanan(
                R.drawable.kupang,
                "Lontong Kupang Pak Misari",
                "Masih belum tergantikan masih tetep juaraaa no 1 menurutku “Lontong Kupang Pak Misari” uhuyyy \n" +
                        "Lihat video lama kok ya jadi puinginn polll yaa ! Pesen cabe 10 double lento + request sing kecut mantepp . Yukkk mare di coba ...\n" +
                        "Jam Buka 09:30 - sehabisnya (jam 5an)\n" +
                        "Harga \n" +
                        "- Lontong Kupang 10K\n" +
                        "- Sate Kerang 5.000/ 10 tusuk",
                "Jl. Mojopahit 62, Sda"))

        partList.add(DataJajanan(
                R.drawable.babat,
                "NASI BABAT PASAR SENGGOL",
                "HABIS ±70KG JEROAN TIAP HARINYA!!\n" +
                        "\n" +
                        "Emang GILA nih warung satu ini!! Saking ramenya Sehari Habis Hampir 70kg Jeroan, Mulai dari Paru ±17kg, Babat ±30kg Dan Usus ±20kg!!\n" +
                        "\n" +
                        "Rasa gak usah ditanya, Salah Satu Favoritku di Surabaya!!!. Favoritku Babat Mix Paru Dan Telor Dadar! Kalian udah pernah cobain?✌\n" +
                        "\n" +
                        "Menu yg dipesan:\n" +
                        "- Nasi Babat Paru (IDR 14k)\n" +
                        "- Nasi Babat Paru Usus (IDR 17k)\n" +
                        "- Versi Masmin 8.75 /10",
                " Jl. Jemur Andayani No. 51, Surabaya\n" +
                        "Setiap Hari, 8 AM - 11 PM"))
        return partList
    }
}