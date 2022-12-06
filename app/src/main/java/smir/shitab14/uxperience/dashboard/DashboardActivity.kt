package smir.shitab14.uxperience.dashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import smir.shitab14.uxperience.R
import smir.shitab14.uxperience.tabshow.TabsActivity

class DashboardActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var cvTabTab: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        supportActionBar?.hide()

        cvTabTab = findViewById<CardView>(R.id.cvTabTab)
        cvTabTab.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            cvTabTab -> {
                val intent = Intent(this, TabsActivity::class.java)
                startActivity(intent)
            }
        }
    }


}