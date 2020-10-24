package ru.itsk.testscroll

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val names = arrayOf("Иван", "Марья", "Петр", "Антон", "Даша", "Борис",
                "Костя", "Игорь", "Анна", "Денис", "Андрей", "Иван", "Марья", "Петр", "Антон", "Даша", "Борис",
                "Костя", "Игорь", "Анна", "Денис", "Андрей")
        val secondNames = arrayOf("Игоревич", "Игоревич", "Игоревич", "Игоревич", "Игоревич", "Игоревич",
                "Игоревич", "Игоревич", "Игоревич", "Игоревич", "Игоревич", "Игоревич", "Игоревич", "Игоревич", "Игоревич", "Игоревич", "Игоревич",
                "Игоревич", "Игоревич", "Игоревич", "Игоревич", "Игоревич")

        val adapterNames = MyAdapter(this, names)
        val adapterSecondNames = MyAdapter(this, secondNames)

        setSettings(rv = rv1)
        setSettings(rv = rv2)
        rv1.adapter = adapterNames
        rv2.adapter = adapterSecondNames
    }

    private fun setSettings(rv: RecyclerView) {
        rv.setHasFixedSize(true)
        rv.layoutManager = LinearLayoutManager(this)
    }
}