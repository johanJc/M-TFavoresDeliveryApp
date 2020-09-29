package MyTfavores.com.delivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_registrarse.*
import kotlinx.android.synthetic.main.activity_registrarse_tres.*

class registrarseDos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrarse_dos)

        btnIrCompletaPerfil.setOnClickListener{
            val intentT: Intent = Intent(this, registrarseTres::class.java)
            startActivity(intentT)
        }
    }
}