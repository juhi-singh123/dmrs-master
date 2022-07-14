package com.example.varsity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class otp extends AppCompatActivity {
    private Button otp_button;
    private TextView editTextTextPersonName4;


    EditText otp_textbox_one, otp_textbox_two, otp_textbox_three, otp_textbox_four;
    Button   verify_otp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
String s=getIntent().getStringExtra("test");
//        otp_button=findViewById(R.id.otp_button);

//        otp_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                getSupportFragmentManager().beginTransaction().replace(R.id.otp_button,new main()).commit();
//
//            }
//        });

//        FragmentManager manager = getFragmentManager();
//        FragmentTransaction transaction = manager.beginTransaction();
//        transaction.add(R.id.frag_main,manager, fragment_main);
//        transaction.addToBackStack(null);
//        transaction.commit();






//
//
//        otp_button = findViewById(R.id.otp_button);
//        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
//       // editTextTextPersonName4.setText(s);
//        otp_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent activity2Intent = new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(activity2Intent);
//            }
//        });
//    }
//}





        otp_textbox_one = findViewById(R.id.otp_edit_box1);
        otp_textbox_two = findViewById(R.id.otp_edit_box2);
        otp_textbox_three = findViewById(R.id.otp_edit_box3);
        otp_textbox_four = findViewById(R.id.otp_edit_box4);
        verify_otp = findViewById(R.id.verify_otp_btn);


        EditText[] edit = {otp_textbox_one, otp_textbox_two, otp_textbox_three, otp_textbox_four};

        otp_textbox_one.addTextChangedListener(new GenericTextWatcher(otp_textbox_one, edit));
        otp_textbox_two.addTextChangedListener(new GenericTextWatcher(otp_textbox_two, edit));
        otp_textbox_three.addTextChangedListener(new GenericTextWatcher(otp_textbox_three, edit));
        otp_textbox_four.addTextChangedListener(new GenericTextWatcher(otp_textbox_four, edit));


        verify_otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Login Successfull", Toast.LENGTH_SHORT).show();
                Intent activity2Intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(activity2Intent);

            }
        });


    }}