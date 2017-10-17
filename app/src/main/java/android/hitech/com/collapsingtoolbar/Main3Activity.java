package android.hitech.com.collapsingtoolbar;

import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main3Activity extends AppCompatActivity implements View.OnScrollChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setOnScrollChangeListener(this);

    }

    @Override
    public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
        System.out.println("Scroll X :"+scrollX+" Scroll Y :"+scrollY+" oldScroll X :"+oldScrollX+" oldScroll Y :"+oldScrollY);
    }

 /*   @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), "Ht_Exception");

        if (file.exists()) {
            File file1 = new File(Environment.getExternalStorageDirectory() + "/Ht_Exception/", "exception.txt");
            if (file1.exists()) {
                try {
                    Toast.makeText(this, "File exists", Toast.LENGTH_SHORT).show();
                    FileOutputStream outStream = new FileOutputStream(file1, true);
                    OutputStreamWriter outStreamWriter = new OutputStreamWriter(outStream);
                    outStreamWriter.append("This is message 1 Guy");
                    outStreamWriter.close();
                } catch (IOException e) {
                    Toast.makeText(this, "File exists", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
            } else {
                File file2 = new File(file, "exception.txt");
                try {
                    FileWriter fw = new FileWriter(file2);
                    fw.append("This is Message 1");
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            Toast.makeText(this, "File doesn't exist", Toast.LENGTH_SHORT).show();
            *//*if (file.mkdir()) {
                File file1 = new File(Environment.getExternalStorageDirectory() + "/Ht_Exception/", "exception.txt");
                if (file1.exists()) {
                    try {
                        FileWriter fw = new FileWriter(file1);
                        fw.append("This is Message 1");
                        fw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    File file2 = new File(file, "exception.txt");
                    try {
                        FileWriter fw = new FileWriter(file2);
                        fw.append("This is Message 1");
                        fw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }*//*
        }
    }*/
}
