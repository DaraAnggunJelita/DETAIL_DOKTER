package login.dara.klinikapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import login.dara.klinikapp.Adapter.AdapterListDoctor
import login.dara.klinikapp.Adapter.AdapterMenuIcon
import login.dara.klinikapp.Adapter.AdapterTag
import login.dara.klinikapp.Model.ListDoctor
import login.dara.klinikapp.Model.ListMenu
import login.dara.klinikapp.Model.Listtag
import login.dara.klinikapp.Model.ModelListDoctors
import login.dara.klinikapp.Model.ModelMenuIcon
import login.dara.klinikapp.Model.ModelTag

class PageDoctors : AppCompatActivity() {

        private lateinit var rv_dokter : RecyclerView
        private lateinit var rv_tag : RecyclerView
        private lateinit var rv_menu : RecyclerView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_page_doctors)

            rv_dokter = findViewById(R.id.rv_dokter)
            rv_tag = findViewById(R.id.rv_tag)
            rv_menu = findViewById(R.id.rv_menu)

            rv_dokter.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false)
            rv_tag.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.HORIZONTAL, false)
            rv_menu.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.HORIZONTAL, false)

            val adapter = AdapterListDoctor(ListDoctor.getModel() as ArrayList<ModelListDoctors>,this)
            val adapter2 = AdapterTag(Listtag.getModel() as ArrayList<ModelTag>)
            val adapter3 = AdapterMenuIcon(ListMenu.getModel() as ArrayList<ModelMenuIcon>)

            rv_dokter.adapter = adapter
            rv_tag.adapter = adapter2
            rv_menu.adapter=adapter3

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }