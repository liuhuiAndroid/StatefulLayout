package com.lh.statefullayout.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.lh.statefullayout.StatefulLayout;
import com.lh.statefullayout.StatusfulConfig;

public class MainActivity extends AppCompatActivity {

    private StatefulLayout mStatefulLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mStatefulLayout = (StatefulLayout) findViewById(R.id.statefulLayout);
    }

    public void showContent(View view) {
        mStatefulLayout.showContent();
    }

    public void showLoadingView(View view) {
        mStatefulLayout.showLoading();
    }

    public void showEmptyView(View view) {
        StatusfulConfig statusfulConfig = new StatusfulConfig.Builder()
                .setEmptyTextTitle("我是空标题")
                .setEmptyTextContent("我是空内容")
                .setEmptyImageResId(R.mipmap.ic_launcher).build();
        mStatefulLayout.showEmpty(statusfulConfig);
    }

    public void showErrorView(View view) {
        StatusfulConfig statusfulConfig = new StatusfulConfig.Builder()
                .setErrorTextTitle("我是错误标题")
                .setErrorTextContent("我是错误内容")
                .setErrorButtonText("我是错误按钮。。。")
                .setErrorImageResId(R.mipmap.ic_launcher)
                .setOnErrorStateButtonClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "show error.", Toast.LENGTH_LONG).show();
                    }
                }).build();
        mStatefulLayout.showError(statusfulConfig);
    }

}
