package com.example.hellorelative;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView showCount;
    int mCount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount=findViewById(R.id.textCount);
    }

    public void showToast(View view) {
        Toast.makeText(this, "Hallo Toast!", Toast.LENGTH_SHORT).show();
    }

    public void showCount(View view) {
        mCount++;
        if(showCount!=null){
            showCount.setText(mCount+"");
        }
    }
}
