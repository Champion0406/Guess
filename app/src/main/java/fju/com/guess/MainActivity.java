package fju.com.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random r = new Random();
    int i = r.nextInt(10)+1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void test(View view){
        EditText ednumber = (EditText) findViewById(R.id.ed_number);
        int n = Integer.parseInt(ednumber.getText().toString());
        if (i == n) {new AlertDialog.Builder (this)
                    .setMessage("答對了")
                    .setPositiveButton("ok",null)
                    .show();
        }
        if(i>n){
            new AlertDialog.Builder(this)
                    .setMessage("大一點")
                    .setPositiveButton("ok",null)
                    .show();}
        if (i<n){
            new AlertDialog.Builder(this)
                    .setMessage("小一點")
                    .setPositiveButton("ok",null)
                    .show();
        }

        }
    }

