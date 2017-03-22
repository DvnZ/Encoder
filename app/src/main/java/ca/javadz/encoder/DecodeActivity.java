package ca.javadz.encoder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DecodeActivity extends AppCompatActivity {

    public EditText msgText;
    public TextView decodedMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decode);

        msgText = (EditText) findViewById(R.id.msgText);
        decodedMsg = (TextView) findViewById(R.id.decodedMsg);
    }
}
