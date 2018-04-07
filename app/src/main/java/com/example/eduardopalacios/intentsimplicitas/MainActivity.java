package com.example.eduardopalacios.intentsimplicitas;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button web, call,maps;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web = findViewById(R.id.btnActionWeb);
        web.setOnClickListener(this);

        call = findViewById(R.id.btnActionCall);
        call.setOnClickListener(this);

        maps=findViewById(R.id.btnActionMaps);
        maps.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnActionWeb:

                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.youtube.com"));
                startActivity(intent);

                break;
            case R.id.btnActionCall:

                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:57582333"));
                startActivity(intent);

                break;

            case R.id.btnActionMaps:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:19.4978,-99.1269"));
                startActivity(intent);
                break;

                default:
                    Toast.makeText(getApplicationContext(),"valor no encontrado",Toast.LENGTH_SHORT).show();
                    break;
        }
    }
}
