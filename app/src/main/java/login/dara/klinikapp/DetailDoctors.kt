package login.dara.klinikapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailDoctors : AppCompatActivity() {

        private lateinit var imgDetailDokter : ImageView
        private lateinit var namaDetailDokter : TextView
        private lateinit var spesDetailDokter : TextView
        private lateinit var jumlahDetailReview : TextView
        private lateinit var angkaDetailRatng : TextView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_detail_doctors)

            imgDetailDokter =findViewById(R.id.imgDetailDoctor)
            namaDetailDokter = findViewById(R.id.namaDetailDoctor)
            spesDetailDokter = findViewById(R.id.SpesDetailDoctor)
            jumlahDetailReview = findViewById(R.id.JumlahDetailReview)
            angkaDetailRatng = findViewById(R.id.angkaDetailRating)

            val gambar = intent.getIntExtra("imgDoctor",0)
            val nama = intent.getStringExtra("namaDoctor")
            val spesialis =intent.getStringExtra("SpesDoctor")
            val jmlRating = intent.getStringExtra("JumlahReview")
            val rating = intent.getStringExtra("angkaRating")

            imgDetailDokter.setImageResource(gambar)
            namaDetailDokter.setText(nama)
            spesDetailDokter.setText(spesialis)
            jumlahDetailReview.setText(jmlRating)
            angkaDetailRatng.setText(rating)

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }