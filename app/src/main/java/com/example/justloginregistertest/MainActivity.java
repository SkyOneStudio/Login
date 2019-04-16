package com.example.justloginregistertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @BindView(R.id.bt_main_logout)
    Button mBtMainLogout;

    @OnClick({
            R.id.bt_main_logout
    })
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.bt_main_logout:
                Intent intent = new Intent(this, loginActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
