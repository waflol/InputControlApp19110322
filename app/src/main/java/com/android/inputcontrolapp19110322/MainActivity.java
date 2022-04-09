package com.android.inputcontrolapp19110322;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String mOrderMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mOrderMessage = "Toppings: ";
    }
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.ckbChocolate_syrup:
                if (checked)
                    mOrderMessage = mOrderMessage + getString(R.string.checkbox_1) + " ";
                else
                    mOrderMessage = mOrderMessage.replace(getString(R.string.checkbox_1)+ " ","");
                break;
            case R.id.ckbSprinkles:
                if (checked)
                    mOrderMessage = mOrderMessage + getString(R.string.checkbox_2)+ " ";
                else
                    mOrderMessage = mOrderMessage.replace(getString(R.string.checkbox_2)+ " ","");
                break;

            case R.id.ckbCrushed_nuts:
                if (checked)
                    mOrderMessage = mOrderMessage + getString(R.string.checkbox_3)+ " ";
                else
                    mOrderMessage = mOrderMessage.replace(getString(R.string.checkbox_3)+ " ","");
                break;

            case R.id.ckbCherries:
                if (checked)
                    mOrderMessage = mOrderMessage + getString(R.string.checkbox_4)+ " ";
                else
                    mOrderMessage = mOrderMessage.replace(getString(R.string.checkbox_4)+ " ","");
                break;

            case R.id.ckbOrio_cookie:
                if (checked)
                    mOrderMessage = mOrderMessage + getString(R.string.checkbox_5)+ " ";
                else
                    mOrderMessage = mOrderMessage.replace(getString(R.string.checkbox_5)+ " ","");
                break;
            default:
                // Do nothing.
                break;
        }
    }

    public void showToast(View view) {
        displayToast(mOrderMessage);
    }
}