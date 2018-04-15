package com.example.xjj.xappstore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * @author : xjj
 * @date : 2018/4/15
 * email : alterjx@163.com
 * describe : 主页界面
 */
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toast.makeText(this, "test", Toast.LENGTH_LONG).show();

    }
}
