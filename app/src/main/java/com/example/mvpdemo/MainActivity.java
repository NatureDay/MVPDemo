package com.example.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TaskContract.View {

    private TaskPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mPresenter = new TaskPresenter(this);

        findViewById(R.id.btn_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.click();
            }
        });

        new TaskPresenter(this);
    }

    @Override
    public void showToast() {
        Toast.makeText(this, "这是MVP模式", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setPresenter(TaskContract.Presenter presenter) {
        mPresenter = (TaskPresenter) presenter;
    }
}
