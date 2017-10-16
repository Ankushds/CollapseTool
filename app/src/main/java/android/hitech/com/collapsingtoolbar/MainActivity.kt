package android.hitech.com.collapsingtoolbar

import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
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
        userName.setOnClickListener(this)
        password.setOnClickListener(this)
        submitBtn.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.submitBtn -> {
                user = userName.text.toString()
                pass = password.text.toString()
                if (user != null && pass != null) {
                    db = FirebaseDatabase.getInstance()
                    val dbRefrence = db.getReference()
                    account = dbRefrence.child("Accounts").child(user)
                    Log.i("TheResultIs :", "BlankkResult")
                    SendindDataTask().execute()
                }
            }
        }
    }

    class SendindDataTask : AsyncTask<Void, Void, String>() {
        var loginUrl: String = "http://192.168.12.56:8080/MyLoginApplication/login"
        var inputStream: InputStream? = null
        override fun doInBackground(vararg params: Void): String {
            val result = URL(loginUrl)
            val conn = result.openConnection() as HttpURLConnection
            conn.requestMethod = "GET"
            conn.connect()
            inputStream = conn.inputStream
            val fs = inputStream.toString()
            Log.i("TheResultIs :", fs)
            return ""
        }
    }
}


