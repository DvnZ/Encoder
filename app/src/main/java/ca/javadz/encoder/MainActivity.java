package ca.javadz.encoder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void encodeScreen(View view) {
        Intent encodeAct = new Intent(this, EncodeActivity.class);
        startActivity(encodeAct);
    }

    public void decodeScreen(View view) {
        Intent decodeAct = new Intent(this, DecodeActivity.class);
        startActivity(decodeAct);
    }
}
