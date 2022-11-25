package com.example.john_checkboxes;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CheckBox chkjava;
    private CheckBox chkpython;
    private CheckBox chkcplus;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkjava=findViewById(R.id.chkjava);
        chkpython=findViewById(R.id.chkpython);
        chkcplus=findViewById(R.id.chkcplus);
        textView=findViewById(R.id.textView);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                StringBuilder s=new StringBuilder();
                if(chkjava.isChecked())
                    s.append(chkjava.getText().toString()+"\n");
                if(chkpython.isChecked())
                    s.append(chkpython.getText().toString()+"\n");
                if(chkcplus.isChecked())
                    s.append(chkcplus.getText().toString()+"\n");

                textView.setText(s);
            }
        });
    }
}