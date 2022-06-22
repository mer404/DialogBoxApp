package com.example.dialogboxactivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class CustomDialog extends AppCompatActivity {
    Button btnClick, btnOkCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog);

        btnClick = findViewById(R.id.btnClick);
        btnOkCustom = findViewById(R.id.btnOkCustom);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog c = new Dialog(CustomDialog.this);
                c.setContentView(R.layout.custom_dialog_demo);
                c.setCancelable(true);
                Window window = c.getWindow();
                window.setLayout(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.WRAP_CONTENT);
                c.show();
            }
        });
    }
}