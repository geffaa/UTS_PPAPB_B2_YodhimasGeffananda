package com.example.uts_ppapb_b2

import android.app.Activity
import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TimePicker
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.example.uts_ppapb_b2.databinding.ActivityOlahragaBinding

class OlahragaActivity : AppCompatActivity(), TimePickerDialog.OnTimeSetListener {

    private lateinit var time : String

    private lateinit var binding: ActivityOlahragaBinding

    companion object {
        const val EXTRA_NAME = "sportName"
        const val EXTRA_CALORIES = "calories"
        const val EXTRA_DURATION = "durasi"
        const val EXTRA_TIME = "time"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOlahragaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {

            txtTime.setOnClickListener {
                val timePicker = TimePicker()
                timePicker.show(supportFragmentManager, "Time")
            }

            btnSubmit.setOnClickListener {
                val intent = Intent();

                val name = edtNama.text.toString()
                val calories = edtKalori.text.toString()
                val durasi = edtDurasi.toString()
                val timeSend = time

                if (name.isEmpty() || calories.isEmpty() || durasi.isEmpty() || timeSend.isEmpty()) {
                    Toast.makeText(
                        this@OlahragaActivity,
                        "Harap isi semua bidang!",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    intent.putExtra(OlahragaActivity.EXTRA_NAME, name)
                    intent.putExtra(OlahragaActivity.EXTRA_CALORIES, calories)
                    intent.putExtra(OlahragaActivity.EXTRA_DURATION, durasi)
                    intent.putExtra(OlahragaActivity.EXTRA_TIME, timeSend)

                    setResult(13, intent)

                    finish()

                }

            }
        }
    }
    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        val selectedTime = "$hourOfDay:$minute"
        time = selectedTime
    }
}