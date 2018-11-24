package com.example.narges.myasynctask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import MyAsyncTasks.MyTasks;

public class MainActivity extends AppCompatActivity {
TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx=findViewById(R.id.txt);
    }

    public void Onclick(View view) {
        CheckBox ck=findViewById(R.id.chk);
        ck.setVisibility(View.INVISIBLE);
        MyTasks myTasks=new MyTasks();
        myTasks.execute(tx,ck);

    }
}
