package com.jasonbutwell.customtoastmessage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toastMessageCentered();
    }

    // A simple custom Toast Message

    private void toastMessageCentered() {
        int toastDuration = Toast.LENGTH_LONG;
        int gravity = Gravity.CENTER;           // Sets the position to the middle of the display

        Toast toast = Toast.makeText(this, "This is a toast message", toastDuration);
        toast.setGravity(gravity,0,0);
        toast.show();
    }

}
