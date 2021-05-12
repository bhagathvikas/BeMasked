package com.example.bemasked;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class NotificationActivity extends AppCompatActivity {

    @OnClick({R.id.notiff1,R.id.notiff2,R.id.notiff3,R.id.notiff4,R.id.notiff5})
    public void Disable(View view){
        view.setVisibility(View.GONE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        ButterKnife.bind(this);

    }
}
