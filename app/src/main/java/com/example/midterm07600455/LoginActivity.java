package com.example.midterm07600455;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.midterm07600455.model.Auth;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViewById(R.id.Login_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText emailEditText = findViewById(R.id.EmaileditText);
                EditText passwordEditText = findViewById(R.id.Password_editText);

                String inputemail = emailEditText.getText().toString();
                String inputpassword = passwordEditText.getText().toString();

                String myloginSuccessText = "Welcome Nuttapon";
                String teacherloginSuccessText = "Welcome Promlert Lovichit";

                Auth auth = new Auth(inputemail, inputpassword);
                boolean result = auth.check();

                if(result){
                    if(inputemail.equals("aaa") && inputpassword.equals("111")) {
                        Intent intent = new Intent(, MainActivity.class);
                        intent.putExtra("aaa", "111");
                        startActivity(intent);
                    }
                    else if(inputemail.equals("bbb") && inputpassword.equals("222")) {
                        Intent intent = new Intent(context, PromlertActivity.class);
                        intent.putExtra("bbb", "222");
                        startActivity(intent);
                    }
                    else{

                    }
                }
                else{
                    // Login fail
                    new AlertDialog.Builder(LoginActivity.this)
                            .setTitle("Error")
                            .setMessage("Invalid username or password")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    // โค้ดที่ให้ทำงาน เมื่อ user กดปุ่ม Ok
                                    // todo;
                                }
                            }).show();
                }

            }

        });
    }
}
