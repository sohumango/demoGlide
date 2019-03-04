package com.oukksoft.demoglide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;


public class MainActivity extends AppCompatActivity implements android.view.View.OnClickListener   {

    String url = "http://www.x-service.co.jp/v2/pages/img/xServiceLogo.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt = this.findViewById(R.id.button);
        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ImageView iv = this.findViewById(R.id.image01);
        GlideApp.with(iv)
                .load(url)
                .into(iv);/* Target ImageView */
    }

}
