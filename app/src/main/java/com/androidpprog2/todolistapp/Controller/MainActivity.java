package com.androidpprog2.todolistapp.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import com.androidpprog2.todolistapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Collections;

public class MainActivity extends AppCompatActivity implements OnDialogCloseListener{

    private FloatingActionButton fab;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add_NewTask.newInstance().show(getSupportFragmentManager(),add_NewTask.TAG);
            }
        });

    }



    @Override
    public void onDialogClose(DialogInterface dialogInterface) {

    }


}