package android.hitech.com.collapsingtoolbar

import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.JsonRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import org.json.JSONObject
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL
import java.util.HashMap

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

}


