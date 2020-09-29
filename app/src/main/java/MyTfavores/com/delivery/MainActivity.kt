package MyTfavores.com.delivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }

    fun siguiente(view: View){
        val intent = Intent(this, Registrarse::class.java).apply {
        }
        startActivity(intent)
    }


}