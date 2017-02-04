package com.example.cacog.studentcard;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView passcode ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("CardService","KU Card App Started");
        passcode =(TextView)findViewById(R.id.passcode);
        passcode.setText(AccountStorage.GetAccount(this));
    }
    public void changeCode(String s)
    {
        AccountStorage.SetAccount(this,s);
        passcode.setText(AccountStorage.GetAccount(this));
    }

    public void onApply(View v)
    {
        EditText editText = (EditText)findViewById(R.id.edit_passcode);
        changeCode(editText.getText().toString());
    }
}
