package com.shivgadhia.android.HorizontalProgressBar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_horizontal);
    }
}