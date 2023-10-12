import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.uts_ppapb_b2.MakananActivity
import com.example.uts_ppapb_b2.OlahragaActivity
import com.example.uts_ppapb_b2.R

class HomepageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        // Inisialisasi tampilan
        val txtTargetKalori = findViewById<TextView>(R.id.txt_target_kalori)
        val txtKaloriMasuk = findViewById<TextView>(R.id.txt_kalori_masuk)
        val txtKaloriKeluar = findViewById<TextView>(R.id.txt_kalori_keluar)
        val existTxt = findViewById<TextView>(R.id.exist_txt)
        val presentTxt = findViewById<TextView>(R.id.present_txt)
        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)
        val containerMakanan = findViewById<LinearLayout>(R.id.container_makanan)
        val containerOlahraga = findViewById<LinearLayout>(R.id.container_olahraga)
        val btnPluss = findViewById<ImageView>(R.id.btn_pluss)
        val btnAdd = findViewById<ImageView>(R.id.btn_add)

        // Isi data dummy untuk TextViews
        txtTargetKalori.text = "1700 Kcal"
        txtKaloriMasuk.text = "768 Kcal"
        txtKaloriKeluar.text = "269 Kcal"
        existTxt.text = "Isi teks contoh untuk makanan"
        presentTxt.text = "Isi teks contoh untuk olahraga"

        // Menangani klik pada tombol "Makan"
        btnPluss.setOnClickListener {
            val intent = Intent(this@HomepageActivity, MakananActivity::class.java)
            startActivity(intent)
        }

        // Menangani klik pada tombol "Olahraga"
        btnAdd.setOnClickListener {
            val intent = Intent(this@HomepageActivity, OlahragaActivity::class.java)
            startActivity(intent)
        }

        // Tambahkan elemen-elemen UI lainnya sesuai kebutuhan Anda
    }
}
