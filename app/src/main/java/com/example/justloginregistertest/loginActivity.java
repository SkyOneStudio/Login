package com.example.justloginregistertest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class loginActivity extends AppCompatActivity {

    private DBOpenHelper mDBOpenHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        mDBOpenHelper = new DBOpenHelper(this);
        findViewById(R.id.other).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {startActivity(new Intent(loginActivity.this,Other3rd.class));
            }
        });

    }

//   @BindView(R.id.iv_loginactivity_back)
//   ImageView mIvLoginactivityBack;
    @BindView(R.id.tv_loginactivity_register)
    TextView mTvLoginactivityRegister;
    @BindView(R.id.rl_loginactivity_top)
    RelativeLayout mRlLoginactivityTop;
    @BindView(R.id.et_loginactivity_username)
    EditText mEtLoginactivityUsername;
    @BindView(R.id.et_loginactivity_password)
    EditText mEtLoginactivityPassword;
    @BindView(R.id.ll_loginactivity_two)
    LinearLayout mLlLoginactivityTwo;
//    @BindView(R.id.tv_loginactivity_forget)
//    TextView mTvLoginactivityForget;
//    @BindView(R.id.tv_loginactivity_check)
//    TextView mTvLoginactivityCheck;
//    @BindView(R.id.tv_loginactivity_else)
//    TextView mBtLoginactivityElse;

    @OnClick({
           // R.id.iv_loginactivity_back,
            R.id.tv_loginactivity_register,
            //R.id.tv_loginactivity_forget,
            //R.id.tv_loginactivity_check,
            R.id.bt_loginactivity_login,
            //R.id.tv_loginactivity_else
    })

    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.tv_loginactivity_register:

                startActivity(new Intent(this, RegisterActivity.class));
                finish();
                break;
                case R.id.bt_loginactivity_login:
                String name = mEtLoginactivityUsername.getText().toString().trim();
                String password = mEtLoginactivityPassword.getText().toString().trim();
                if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(password)) {
                    ArrayList<User> data = mDBOpenHelper.getAllData();
                    boolean match = false;
                    for(int i=0;i<data.size();i++) {
                        User user = data.get(i);
                        if (name.equals(user.getName()) && password.equals(user.getPassword())){
                            match = true;
                            break;
                        }else{
                            match = false;
                        }
                    }
                    if (match) {
                        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(this, MainActivity.class);
                        startActivity(intent);
                        finish();//销毁这个Activity
                    }else {
                        Toast.makeText(this, "用户名或密码不正确，请重新输入", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(this, "请输入你的用户名或密码", Toast.LENGTH_SHORT).show();
                }
                break;
            //case R.id.tv_loginactivity_else:
                //TODO 第三方登录，时间有限，暂时未实现
            //    break;
        }
    }
}



