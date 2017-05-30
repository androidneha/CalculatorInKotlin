package codewithpro.com.calculatorinkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus.setOnClickListener { toast("Message : ${Integer.parseInt(editText.text.toString()) + Integer.parseInt(editText2.text.toString())}") }
        minus.setOnClickListener { toast("Message : ${Integer.parseInt(editText.text.toString()) - Integer.parseInt(editText2.text.toString())}") }
        into.setOnClickListener { toast("Message : ${Integer.parseInt(editText.text.toString()) * Integer.parseInt(editText2.text.toString())}") }
        divide.setOnClickListener { toast("Message : ${Integer.parseInt(editText.text.toString()) / Integer.parseInt(editText2.text.toString())}") }
    }
}
