package com.app.demo;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.app.qrcode_generator.QRCodeEncoder;

public class MainActivity extends AppCompatActivity {

    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView) findViewById(R.id.img);
        Bitmap qrCodeImage = new QRCodeEncoder.Builder()
                .width(400)
                .height(400)
                .paddingPx(0)
                .marginPt(3)
                .build()
                .encode("qrcode content");
        mImageView.setImageBitmap(qrCodeImage);
    }
}
