package id.ac.polbeng.ahmedfadlu.kalkulator

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.ahmedfadlu.kalkulator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengatur tombol untuk menghitung volume balok
        binding.btnCalculateVolume.setOnClickListener {
            calculateVolume()
        }

        // Mengatur tombol untuk menghitung luas permukaan balok
        binding.btnCalculateSurfaceArea.setOnClickListener {
            calculateSurfaceArea()
        }
    }

    // Fungsi untuk menghitung volume balok
    private fun calculateVolume() {
        val length = binding.lengthInput.text.toString().toDoubleOrNull()
        val width = binding.widthInput.text.toString().toDoubleOrNull()
        val height = binding.heightInput.text.toString().toDoubleOrNull()

        if (length != null && width != null && height != null) {
            val volume = length * width * height
            binding.resultText.text = "Volume balok: $volume"
        } else {
            Toast.makeText(this, "Mohon masukkan dimensi yang valid", Toast.LENGTH_SHORT).show()
        }
    }

    // Fungsi untuk menghitung luas permukaan balok
    private fun calculateSurfaceArea() {
        val length = binding.lengthInput.text.toString().toDoubleOrNull()
        val width = binding.widthInput.text.toString().toDoubleOrNull()
        val height = binding.heightInput.text.toString().toDoubleOrNull()

        if (length != null && width != null && height != null) {
            val surfaceArea = 2 * (length * width + length * height + width * height)
            binding.resultText.text = "Luas permukaan balok: $surfaceArea"
        } else {
            Toast.makeText(this, "Mohon masukkan dimensi yang valid", Toast.LENGTH_SHORT).show()
        }
    }
}
