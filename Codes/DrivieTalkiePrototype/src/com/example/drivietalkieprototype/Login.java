package com.example.drivietalkieprototype;

import javax.security.auth.PrivateCredentialPermission;

import android.R.bool;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Login extends Activity {

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		EditText id;
		EditText password;
		Spinner  server;
		Button	login;
		super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        id=(EditText)findViewById(R.id.editText1);
        login=(Button)findViewById(R.id.button1);
        
        //id.getText().toString()
        login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
			}
		});

	}
}
