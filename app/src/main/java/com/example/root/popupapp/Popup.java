package com.example.root.popupapp;

import android.annotation.TargetApi;
import android.app.DialogFragment;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;

/**
 * Created by root on 9/21/17.
 */

public class Popup extends DialogFragment implements View.OnClickListener {

    View view;
    TimePicker tp;
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.popup_activity, null);
        tp = (TimePicker)view.findViewById(R.id.timePicker);
        Button Done = (Button)view.findViewById(R.id.button);
        Done.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        this.dismiss();
        String myTime = "";

        myTime = this.CurrentTime();

        MainActivity main = (MainActivity) getActivity();
        main.setDate(myTime);

    }


    public String CurrentTime() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            return String.valueOf(tp.getHour() + ":" + tp.getMinute());
        } else {
            return String.valueOf(tp.getCurrentHour() + ":" + tp.getCurrentMinute());
        }
    }
}
