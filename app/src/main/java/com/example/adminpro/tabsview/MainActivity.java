package com.example.adminpro.tabsview;


import android.app.TabActivity;
import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

public class MainActivity extends TabActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpec;

        tabSpec = tabHost.newTabSpec("tab1");
        tabSpec.setIndicator("Вкладка 1");
        tabSpec.setContent(new Intent(this, Tab1Activity.class));
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tab2");
        tabSpec.setIndicator("Вкладка 2");
        tabSpec.setContent(new Intent(this, Tab2Activity.class));
        tabHost.addTab(tabSpec);
    }
}
