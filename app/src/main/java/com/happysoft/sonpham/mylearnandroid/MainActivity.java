package com.happysoft.sonpham.mylearnandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView mShowdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowdata= (TextView) findViewById(R.id.textView2);

        Dog dog=new Dog();
        dog.show();
        Cat cat=new Cat();
        cat.show();

        Bike obj = new Honda4();
        obj.run();



    }
}
