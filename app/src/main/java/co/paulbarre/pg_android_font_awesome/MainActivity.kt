package co.paulbarre.pg_android_font_awesome

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val typeface = Typeface.createFromAsset(assets, "font/fa-solid-900.ttf")
        middle.typeface = ResourcesCompat.getFont(this, R.font.fa_solid_900)
    }
}
