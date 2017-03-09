package com.etong.util.grade.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.etong.util.grade.myapplication.R.string.hot_video;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnHotVideo;
    private Button mBtnStock;
    private Button mBtnReader;
    private Button mBtnFastNews;
    private Button mBtnGraduateDesign;

    private void initView() {
        mBtnHotVideo = (Button) findViewById(R.id.btn_hot_video);
        mBtnStock = (Button) findViewById(R.id.btn_stock);
        mBtnReader = (Button) findViewById(R.id.btn_reader);
        mBtnFastNews = (Button) findViewById(R.id.btn_news);
        mBtnGraduateDesign = (Button) findViewById(R.id.btn_graduate_design);

        initClick();
    }

    private void initClick() {
        mBtnHotVideo.setOnClickListener(this);
        mBtnStock.setOnClickListener(this);
        mBtnReader.setOnClickListener(this);
        mBtnFastNews.setOnClickListener(this);
        mBtnGraduateDesign.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_hot_video:
                showToast(getResources().getString(hot_video));
                break;
            case R.id.btn_stock:
                showToast(getResources().getString(R.string.stock));
                break;
            case R.id.btn_reader:
                showToast(getResources().getString(R.string.reader_machine));
                break;
            case R.id.btn_news:
                showToast(getResources().getString(R.string.fast_news));
                break;
            case R.id.btn_graduate_design:
                showToast(getResources().getString(R.string.graduate_design));
                break;

        }

    }

    private void showToast(String text) {
        Toast.makeText(this, "启动应用:" + text, Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
}
