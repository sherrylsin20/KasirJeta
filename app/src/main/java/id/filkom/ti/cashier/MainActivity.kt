package id.filkom.ti.cashier

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val makanans = mutableListOf<Makanan>()
    val adapter: Adapter by lazy { Adapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.apply {
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
        buttonTrash1.setOnClickListener{
            clearList()
        }
        buttonTrash.setOnClickListener{
            clearList()
        }
    }

    private fun addItem(food: String) {
        when (food) {
            "Gado-Gado" -> {
                makanans.add(Makanan("Gado-gado", 20000))
            }
            "Salad" -> {
                makanans.add(Makanan("Mixed Salad", 20000))
            }
            "Dressing GG" -> {
                makanans.add(Makanan("Dressing Gado-Gado", 3000))
            }
            "Smoked Beef" -> {
                makanans.add(Makanan("Smoked Beef", 3000))
            }
            "Dressing Salad" -> {
                makanans.add(Makanan("Dressing Salad", 3000))
            }
            //minuman
            "Teh Manis" -> {
                makanans.add(Makanan("Teh Manis", 4000))
            }
            "Teh Tawar" -> {
                makanans.add(Makanan("Teh Tawar", 3000))
            }
            "Jeruk" -> {
                makanans.add(Makanan("Jeruk", 8000))
            }
            "Jeruk Murni" -> {
                makanans.add(Makanan("Jeruk Murni", 15000))
            }
            "Es Campur" -> {
                makanans.add(Makanan("Es Campur", 20000))
            }
            "Es Cendol" -> {
                makanans.add(Makanan("Es Cendol", 10000))
            }
            "Es Kacang Ijo" -> {
                makanans.add(Makanan("Es Kacang Ijo", 15000))
            }
            "Es Kacang Malaka" -> {
                makanans.add(Makanan("Es Kacang Malaka", 18000))
            }
            "Fresh Juice" -> {
                makanans.add(Makanan("Fresh Juice", 15000))
            }
            "Mix Juices" -> {
                makanans.add(Makanan("Mix Juices", 20000))
            }
        }
        adapter.setData(makanans)
    }
    private fun clearList(){
        makanans.clear()
        recyclerView?.adapter?.notifyDataSetChanged()
    }

}
