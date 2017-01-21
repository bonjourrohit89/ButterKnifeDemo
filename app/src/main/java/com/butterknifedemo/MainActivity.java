package com.butterknifedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.tv_name)
    TextView tvName;

    @BindView(R.id.btn_click)
    Button btnClick;

    @BindView(R.id.btn_register)
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tvName.setText(getResources().getString(R.string.butter_knife));
        btnClick.setText("Submit");
    }


    @OnClick({R.id.btn_click, R.id.btn_register,R.id.tv_name})
    public void btnSubmit(View view) {

        switch (view.getId()) {
            case R.id.btn_click:
                Toast.makeText(MainActivity.this, "Rohit Sharma", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_register:
                Toast.makeText(MainActivity.this, "User Register", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_name:
                Toast.makeText(MainActivity.this, ""+tvName.getText().toString().trim(), Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
