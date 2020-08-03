package com.example.loginactivity;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button btn_add_vending;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PrintName();    //id에 해당하는 user_name 을 받아와 메인화면에 출력






    }

    public void PrintName(){
        //id에 해당하는 user_name 을 받아와 메인화면에 출력
        TextView idText = (TextView)findViewById(R.id.nametext);
        Intent intent = getIntent();
        String UserId = intent.getStringExtra("userId");
        String _UserId = UserId + "님";
        SpannableStringBuilder s_User_Id = new SpannableStringBuilder(_UserId);
        s_User_Id.setSpan(new ForegroundColorSpan(Color.parseColor("#ff7f00")), 0, UserId.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        s_User_Id.setSpan(new RelativeSizeSpan(3.0f), 0, UserId.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        idText.setText(s_User_Id);
    }
}
