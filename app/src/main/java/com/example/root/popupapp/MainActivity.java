package com.example.root.popupapp;

import android.support.v4.app.FragmentActivity;
import android.app.FragmentManager;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatDialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        Popup popup = new Popup();
        popup.show(fragmentManager, "dialog");

        //popup.show(getSupportFragmentManager(), "test");
    }
    void setDate(String data){
        TextView tv = (TextView)findViewById(R.id.textViewDate);
        tv.setText(data);
    }
}
