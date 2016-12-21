package com.jasonbutwell.customtoastmessage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //toastMessageCentered();
        customXMLToastMessage();
    }

    // A simple custom Toast message using an XML layout

    private void customXMLToastMessage() {

        // Inflate the layout

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast_layout,(ViewGroup)findViewById(R.id.customToastLayout));

        // set the text of the toast

        TextView tv = (TextView)layout.findViewById(R.id.textContent);
        tv.setText("This is a toast message");

        // create a new toast

        Toast toast = new Toast(getApplicationContext());

        // set the duration

        toast.setDuration(Toast.LENGTH_SHORT);

        // set positioning

        toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 100,100 );

        // use our custom XML for the toast

        toast.setView(layout);

        // show the toast

        toast.show();

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
