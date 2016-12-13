package com.app.qrcode_generator;

import android.graphics.Bitmap;

public interface PixelsProcessor {

    Bitmap create(int[] pixels, int width, int height);
}
