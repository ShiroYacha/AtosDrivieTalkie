package com.example.drivietalkieprototype;

import java.util.LinkedHashMap;

import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;

import core.*;

import android.R.string;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class Login extends Activity {

	protected static final Context Login = null;
	EditText et_id;
	EditText et_password;
	XmppClientFacade facade;

	
	@Override
	public void onCreate(Bundle savedInstanceState) {

		Spinner  sp_server;
		Button	btn_login;
		super.onCreate(savedInstanceState);
		// Populate layout
        setContentView(R.layout.login);
        // Config widgets
        et_id=(EditText)findViewById(R.id.editText1);
        et_password=(EditText)findViewById(R.id.editText2);
        btn_login=(Button)findViewById(R.id.button1);
		// Set login listener
        btn_login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
		        String id=et_id.getText().toString();
		        String password=et_password.getText().toString();
	        
		        id="shiroyacha1990@gmail.com";
		        password = "ladivine";

		    	Intent resultInt = new Intent();
		    	resultInt.putExtra("id",id);
		    	resultInt.putExtra("password",password);
		    	setResult(RESULT_OK,resultInt);     
		    	finish();

			}
		});
        
        
	}
	
}


