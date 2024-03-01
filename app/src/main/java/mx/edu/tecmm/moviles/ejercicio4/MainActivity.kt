package mx.edu.tecmm.moviles.ejercicio4

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var edCadena: EditText
    lateinit var cnkNegritas: CheckBox
    lateinit var cnkCursiva: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edCadena = findViewById(R.id.edCadena)
        cnkCursiva = findViewById(R.id.cnkCursiva)
        cnkNegritas = findViewById(R.id.chkNegrita)
    }

    fun verificar(view: View) {
        val estilo = when {
            cnkCursiva.isChecked && cnkNegritas.isChecked -> Typeface.BOLD_ITALIC
            cnkCursiva.isChecked -> Typeface.ITALIC
            cnkNegritas.isChecked -> Typeface.BOLD
            else -> Typeface.NORMAL
        }

        edCadena.setTypeface(null, estilo)
    }
}



