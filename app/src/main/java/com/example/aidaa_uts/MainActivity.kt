package com.example.aidaa_uts
import DataAdapter
import DetailActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

//Simpan data

        data?.add(DataModel(R.drawable.rendang,"Rendang","Rp18.000","Rendang atau randang (Jawi: رندڠ) " +
                "adalah masakan daging yang berasal dari Minangkabau. Masakan ini dihasilkan dari proses memasak suhu rendah " +
                "dalam waktu lama menggunakan aneka rempah-rempah dan santan"))

        data?.add(DataModel(R.drawable.nasi_lemak,"Nasi Lemak","Rp15.000", "Nasi lemak merupakan makanan " +
                "tradisi Melayu Malaysia.[6] Ianya juga boleh ditemui di Singapura, Indonesia dan Brunei. " +
                "Nasi Lemak dapat ditemui di semua bahagian Malaysia dan juga Singapura."))

        data?.add(DataModel(R.drawable.pizza,"Pizza","Rp22.000", "Pizza asli berasal dari Italia " +
                "dan bisa ditemui di Pizzeria (toko Pizza) yang tiap porsi pizzanya berdiameter kira-kira 30 cm atau lebih, " +
                "dengan adonan yang telah ditarik tipis."))

        data?.add(DataModel(R.drawable.spaghetti,"Spaghetti","Rp21.000", "Ini adalah makanan pokok dalam " +
                "masakan Italia tradisional. Karena berbentuk seperti mie, kebanyakan orang menyebutnya mie dari Italia meskipun " +
                "banyak varian pasta lainnya yang berbentuk seperti mie"))

        data?.add(DataModel(R.drawable.martabak,"Martabak","Rp15.000", "Martabak manis atau yang aslinya bernama " +
                "Hok Lo Pan awalnya adalah makanan khas Bangka Belitung. Hok Lo Pan atau Martabak diciptakan oleh orang-orang Hakka (Khek) " +
                "Bangka"))

        data?.add(DataModel(R.drawable.pizza,"Pizza","Rp22.000", "Pizza asli berasal dari Italia " +
                "dan bisa ditemui di Pizzeria (toko Pizza) yang tiap porsi pizzanya berdiameter kira-kira 30 cm atau lebih, " +
                "dengan adonan yang telah ditarik tipis."))

        data?.add(DataModel(R.drawable.spaghetti,"Spaghetti","Rp21.000", "Ini adalah makanan pokok dalam " +
                "masakan Italia tradisional. Karena berbentuk seperti mie, kebanyakan orang menyebutnya mie dari Italia meskipun " +
                "banyak varian pasta lainnya yang berbentuk seperti mie"))


        data?.add(DataModel(R.drawable.martabak,"Martabak","Rp15.000", "Martabak manis atau yang aslinya bernama " +
                "Hok Lo Pan awalnya adalah makanan khas Bangka Belitung. Hok Lo Pan atau Martabak diciptakan oleh orang-orang Hakka (Khek) " +
                "Bangka"))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.harga)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}