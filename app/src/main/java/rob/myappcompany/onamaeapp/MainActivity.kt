package rob.myappcompany.onamaeapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et: EditText = findViewById(R.id.et)
        val btnStart: Button = findViewById(R.id.btnStart)

        btnStart.setOnClickListener {
            // 1) 画面遷移
            val intent = Intent(this, SecondActivity::class.java)

            if (et.text.toString() == "") {
//                Toast.makeText(this, "名前を入力してください。", Toast.LENGTH_SHORT).show()

                AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("名前を入力してください。")
                    .setPositiveButton("OK", null)
                    .show()
            } else {
                // 2) 値を渡す
                intent.putExtra("MY_NAME", et.text.toString())
                startActivity(intent)            }
        }
    }
}
