package com.example.dialogboxactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnSingle, btnMulti;
    String[] Course = new String[6];
    boolean[] multiple = new boolean[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSingle = findViewById(R.id.btnSingle);
        btnMulti = findViewById(R.id.btnMulti);

        btnSingle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                singleDialog();
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multi();
            }
        });

    }

    public void multi() {
        Course[0] = "Android";
        Course[1] = "IOS";
        Course[2] = "Flutter";
        Course[3] = "Cyber Security";
        Course[4] = "Ethical Hacking";
        Course[5] = "Cyber Agent";


    }


    private void singleDialog() {
        Course[0] = "Android";
        Course[1] = "IOS";
        Course[2] = "Flutter";
        Course[3] = "Cyber Security";
        Course[4] = "Ethical Hacking";
        Course[5] = "Cyber Agent";

        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("Select Course");
        dialog.setSingleChoiceItems(Course, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(MainActivity.this, "==" + Course[which], Toast.LENGTH_SHORT).show();
            }
        });
        dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        dialog.setCancelable(false);
        dialog.show();
    }
}