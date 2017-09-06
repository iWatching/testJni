package com.hdos.rsyygh.testjni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static {
        //名字必须和build.gradle中的moduleName一致
        System.loadLibrary("TestNdk");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**
     * 调用显示字符串
     * @param v
     */
    public void testString(View v){
        String s = TestNdk.helloWord();
        Toast.makeText(MainActivity.this,s,Toast.LENGTH_LONG).show();
    }

    /**
     * 调用相加的字符串
     * @param v
     */
    public void testAdd(View v){
        int num = TestNdk.add(5,6);
        Toast.makeText(MainActivity.this,num+"",Toast.LENGTH_LONG).show();
    }
}
