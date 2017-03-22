package ca.javadz.encoder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class EncodeActivity extends AppCompatActivity {

    public EditText msgText;
    public TextView encodedMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encode);

        msgText = (EditText) findViewById(R.id.msgText);
        encodedMsg = (TextView) findViewById(R.id.encodedMsg);
    }
}
