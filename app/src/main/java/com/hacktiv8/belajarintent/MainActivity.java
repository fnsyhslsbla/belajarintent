package com.hacktiv8.belajarintent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button explicitButton;
    private Button implicitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        explicitButton = findViewById(R.id.explicit_button);
        implicitButton = findViewById(R.id.implicit_button);

        explicitButton.setOnClickListener(this);
        implicitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.explicit_button) {
            //action explicit ?
            Intent intent = new Intent(MainActivity.this, InformasiActivity.class);
            startActivity(intent);

        else if (view.getId() == R.id.implicit_button) {
            //action implicit ?
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com"));
            startActivity(browserIntent);
        }
    }
}