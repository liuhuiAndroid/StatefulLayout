package com.lh.statefullayout.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lh.statefullayout.StatefulLayout;


public class MainActivity extends AppCompatActivity {

    private StatefulLayout mStatefulLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mStatefulLayout = (StatefulLayout) findViewById(R.id.statefulLayout);
    }

    public void showContent(View view){
        mStatefulLayout.showContent();
    }

    public void showLoadingView(View view){
        mStatefulLayout.showLoading();
    }

    public void showEmptyView(View view){
        mStatefulLayout.showEmpty();
    }

    public void showErrorView(View view){
        mStatefulLayout.showError();
    }

}
