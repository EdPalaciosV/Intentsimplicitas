package com.example.eduardopalacios.intentsimplicitas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    Intent intent;
    @BindView(R.id.btnActionWeb)
    Button btnActionWeb;
    @BindView(R.id.btnActionCall)
    Button btnActionCall;
    @BindView(R.id.btnActionMaps)
    Button btnActionMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btnActionWeb, R.id.btnActionCall, R.id.btnActionMaps})
    public void onViewClicked(View view) {
        switch (view.getId()) {

            case R.id.btnActionWeb:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/?hl=es-419&gl=MX"));
                startActivity(intent);
                break;
            case R.id.btnActionCall:
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:576753223"));
                startActivity(intent);
                break;
            case R.id.btnActionMaps:
                intent = new Intent(Intent.ACTION_VIEW);
                //Uri nos permite identificar el recurso
                intent.setData(Uri.parse("geo:19.4978,-99.1269"));
                startActivity(intent);
                break;
        }
    }
}
