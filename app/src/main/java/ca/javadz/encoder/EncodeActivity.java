package ca.javadz.encoder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

    public void encode(View view) {
        String str = msgText.getText().toString();
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (str.charAt(i) != ' ') {
                int temp = (int) array[i] + 7;
                array[i] = (char) temp;
            }
        }
        encodedMsg.setText(String.valueOf(array));
    }
}
