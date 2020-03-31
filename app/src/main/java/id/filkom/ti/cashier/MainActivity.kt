package id.filkom.ti.cashier

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val makanans = mutableListOf<Makanan>()
    val adapter: Adapter by lazy { Adapter() }
    var totalHarga: Int? = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        orderItems.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = this@MainActivity.adapter
        }
        //BUTTON
        buttonGadoGado.setOnClickListener {
            addItem("Gado-Gado")
        }
        buttonSalad.setOnClickListener {
            addItem("Salad")
        }
        buttonDressingGadoGado.setOnClickListener {
            addItem("Dressing GG")
        }
        buttonSmokeBeef.setOnClickListener {
            addItem("Smoked Beef")
        }
        buttonDressingSalad.setOnClickListener {
            addItem("Dressing Salad")
        }
        buttonTehManis.setOnClickListener {
            addItem("Teh Manis")
        }
        buttonTehTawar.setOnClickListener {
            addItem("Teh Tawar")
        }
        buttonJeruk.setOnClickListener {
            addItem("Jeruk")
        }
        buttonJerukMurni.setOnClickListener {
            addItem("Jeruk Murni")
        }
        buttonCampur.setOnClickListener {
            addItem("Es Campur")
        }
        buttonCendol.setOnClickListener {
            addItem("Es Cendol")
        }
        buttonKacangIjo.setOnClickListener {
            addItem("Es Kacang Ijo")
        }
        buttonKacangMalaka.setOnClickListener {
            addItem("Es Kacang Malaka")
        }
        buttonFreshJuice.setOnClickListener {
            addItem("Fresh Juice")
        }
        buttonMixJuices.setOnClickListener {
            addItem("Mix Juices")
        }
        cancelButton.setOnClickListener{
            clearList()
        }
    }

    private fun addItem(food: String) {
        when (food) {
            "Gado-Gado" -> {
                totalHarga = totalHarga?.plus(20000)
                makanans.add(Makanan("Gado-gado", 20000))
            }
            "Salad" -> {
                totalHarga = totalHarga?.plus(20000)
                makanans.add(Makanan("Mixed Salad", 20000))
            }
            "Dressing GG" -> {
                totalHarga = totalHarga?.plus(3000)
                makanans.add(Makanan("Dressing Gado-Gado", 3000))
            }
            "Smoked Beef" -> {
                totalHarga = totalHarga?.plus(3000)
                makanans.add(Makanan("Smoked Beef", 3000))
            }
            "Dressing Salad" -> {
                totalHarga = totalHarga?.plus(3000)
                makanans.add(Makanan("Dressing Salad", 3000))
            }
            //minuman
            "Teh Manis" -> {
                totalHarga = totalHarga?.plus(4000)
                makanans.add(Makanan("Teh Manis", 4000))
            }
            "Teh Tawar" -> {
                totalHarga = totalHarga?.plus(3000)
                makanans.add(Makanan("Teh Tawar", 3000))
            }
            "Jeruk" -> {
                totalHarga = totalHarga?.plus(8000)
                makanans.add(Makanan("Jeruk", 8000))
            }
            "Jeruk Murni" -> {
                totalHarga = totalHarga?.plus(15000)
                makanans.add(Makanan("Jeruk Murni", 15000))
            }
            "Es Campur" -> {
                totalHarga = totalHarga?.plus(20000)
                makanans.add(Makanan("Es Campur", 20000))
            }
            "Es Cendol" -> {
                totalHarga = totalHarga?.plus(10000)
                makanans.add(Makanan("Es Cendol", 10000))
            }
            "Es Kacang Ijo" -> {
                totalHarga = totalHarga?.plus(15000)
                makanans.add(Makanan("Es Kacang Ijo", 15000))
            }
            "Es Kacang Malaka" -> {
                totalHarga = totalHarga?.plus(18000)
                makanans.add(Makanan("Es Kacang Malaka", 18000))
            }
            "Fresh Juice" -> {
                totalHarga = totalHarga?.plus(15000)
                makanans.add(Makanan("Fresh Juice", 15000))
            }
            "Mix Juices" -> {
                totalHarga = totalHarga?.plus(20000)
                makanans.add(Makanan("Mix Juices", 20000))
            }
        }
        orderTotalNumeric.text = totalHarga.toString()
        adapter.setData(makanans)
    }
    private fun clearList(){
        makanans.clear()
        totalHarga = 0
        orderTotalNumeric.text = "0"
        orderItems?.adapter?.notifyDataSetChanged()
    }

}
