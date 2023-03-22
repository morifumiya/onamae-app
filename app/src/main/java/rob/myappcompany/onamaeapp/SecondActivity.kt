package rob.myappcompany.onamaeapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvName: TextView = findViewById(R.id.tvName)
        val btnBack: Button = findViewById(R.id.btnBack)

//        3) 渡された値を取り出す->テキストに表示
        val myName = intent.getStringExtra("MY_NAME")
        tvName.text = myName + "さん"

        // 戻るボタン
        btnBack.setOnClickListener {
            finish()
        }
    }
}
