package com.example.drivietalkieprototype;

import javax.security.auth.PrivateCredentialPermission;

import org.jivesoftware.smack.XMPPException;

import android.R.bool;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import core.*;

public class Login extends Activity {

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		EditText et_id;
		EditText et_password;
		Spinner  sp_server;
		Button	btn_login;
		super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        et_id=(EditText)findViewById(R.id.editText1);
        et_password=(EditText)findViewById(R.id.editText2);
        btn_login=(Button)findViewById(R.id.button1);
        
        final XmppClientFacade facade=new XmppClientFacade();
        
        final String id=et_id.getText().toString();
        final String password=et_password.getText().toString();
        btn_login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try {
					facade.login(id, password, "Gtalk");
				} catch (XMPPException e) {
					// TODO: handle exception
				}
				
			}
		});

	}
}
