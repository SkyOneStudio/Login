package com.example.justloginregistertest;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Other3rd extends AppCompatActivity implements View.OnClickListener {

    private ImageView btn_qq;
    private ImageView btn_wechat;
    private ImageView btn_cat;
    private ImageView btn_tv;

    private Context mContext;
    private boolean[] checkItems;

    private AlertDialog alert = null;
    private AlertDialog.Builder builder = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other3rd);
        mContext = Other3rd.this;
        bindView();

    }

    private void bindView() {
        btn_qq=(ImageView)findViewById(R.id.qq);
        btn_wechat=(ImageView)findViewById(R.id.wechat);
        btn_cat=(ImageView)findViewById(R.id.cat);
        btn_tv=(ImageView)findViewById(R.id.tv);
        btn_qq.setOnClickListener(Other3rd.this);
        btn_wechat.setOnClickListener(Other3rd.this);
        btn_cat.setOnClickListener(Other3rd.this);
        btn_tv.setOnClickListener(Other3rd.this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.qq:
                alert = null;
                builder = new AlertDialog.Builder(mContext);
                alert = builder.setIcon(R.mipmap.ic_launcher_round)
                        .setTitle("提示：")
                        .setMessage("以上功能还未开发 敬请期待,")
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(mContext, "你点击了取消按钮~", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(mContext, "你点击了确定按钮~", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNeutralButton("知道了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(mContext, "你点击了知道了按钮~", Toast.LENGTH_SHORT).show();
                            }
                        }).create();
                alert.show();
                break;

            case R.id.wechat:
                alert = null;
                builder = new AlertDialog.Builder(mContext);
                alert = builder.setIcon(R.mipmap.ic_launcher_round)
                        .setTitle("提示：")
                        .setMessage("以上功能还未开发 敬请期待,")
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(mContext, "你点击了取消按钮~", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(mContext, "你点击了确定按钮~", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNeutralButton("知道了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(mContext, "你点击了知道了按钮~", Toast.LENGTH_SHORT).show();
                            }
                        }).create();
                alert.show();
                break;

            case R.id.cat:
                alert = null;
                builder = new AlertDialog.Builder(mContext);
                alert = builder.setIcon(R.mipmap.ic_launcher_round)
                        .setTitle("提示：")
                        .setMessage("以上功能还未开发 敬请期待,")
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(mContext, "你点击了取消按钮~", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(mContext, "你点击了确定按钮~", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNeutralButton("知道了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(mContext, "你点击了知道了按钮~", Toast.LENGTH_SHORT).show();
                            }
                        }).create();
                alert.show();
                break;

            case R.id.tv:
                alert = null;
                builder = new AlertDialog.Builder(mContext);
                alert = builder.setIcon(R.mipmap.ic_launcher_round)
                        .setTitle("提示：")
                        .setMessage("以上功能还未开发 敬请期待")
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(mContext, "你点击了取消按钮~", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(mContext, "你点击了确定按钮~", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNeutralButton("知道了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(mContext, "你点击了知道了按钮~", Toast.LENGTH_SHORT).show();
                            }
                        }).create();
                alert.show();
                break;
    }
}}