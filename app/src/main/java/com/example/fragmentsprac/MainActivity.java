package com.example.fragmentsprac;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity implements ListFgt.OnItemSelectedListener{
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override public void onDateTimeItemSelected(String info) {
        DetailFgt fragment = (DetailFgt) getFragmentManager().findFragmentById(R.id.detailFragment);
        fragment.setText(info);
    }
}
