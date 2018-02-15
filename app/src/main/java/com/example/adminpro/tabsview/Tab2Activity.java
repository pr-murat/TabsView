package com.example.adminpro.tabsview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Tab2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab2);
    }

    public void cl(View v){
        Toast.makeText(Tab2Activity.this, "Hello guys", Toast.LENGTH_SHORT).show();
    }
}
