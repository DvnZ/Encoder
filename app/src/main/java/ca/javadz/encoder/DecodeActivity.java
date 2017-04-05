package ca.javadz.encoder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

    public void decode(View view) {
        String str = msgText.getText().toString();
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ') {
                int temp = (int) array[i] - 7;
                array[i] = (char) temp;
            }
        }
        decodedMsg.setText(String.valueOf(array));
    }

    public void shareMsg(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.setType("text/plain");
        share.putExtra(Intent.EXTRA_SUBJECT, "Subject Here");
        share.putExtra(Intent.EXTRA_TEXT, decodedMsg.getText().toString());
        startActivity(Intent.createChooser(share, "Share via"));
    }
}
