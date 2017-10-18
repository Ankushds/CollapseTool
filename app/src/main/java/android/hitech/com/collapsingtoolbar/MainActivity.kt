package android.hitech.com.collapsingtoolbar

import android.content.Intent
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.net.URL

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var userName: EditText
    lateinit var password: EditText
    lateinit var submitBtn: Button
    lateinit var db: FirebaseDatabase
    var user: String? = null
    var pass: String? = null
    lateinit var account: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userName = findViewById(R.id.userName) as EditText
        password = findViewById(R.id.password) as EditText
        submitBtn = findViewById(R.id.submitBtn) as Button
        submitBtn.setOnClickListener(this)

    }

    override fun onClick(v: View) {

    }

    private inner class MyTask : AsyncTask<String, String, String>() {
        override fun doInBackground(vararg params: String?): String {
            val url = URL("")
            val conn = url.openConnection()
            conn.doInput = true
            return conn.getInputStream().bufferedReader().readLine()
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            startActivity(Intent(baseContext, Main2Activity::class.java))
        }
    }
}


