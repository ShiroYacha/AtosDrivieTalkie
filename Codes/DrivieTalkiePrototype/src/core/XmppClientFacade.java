package core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.xbill.DNS.tests.primary;

import android.R.integer;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.StrictMode;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class XmppClientFacade {

	private XmppServerConnection xmppServerConnection;
	private RosterManager rosterManager;
	
	private void initialize()
	{
		rosterManager=new RosterManager(xmppServerConnection.getConnection());
	}
	
	@SuppressLint("NewApi")
	public void login(String username, String password, String server) throws XMPPException 
	{
		// Network on main thread
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy);
		// Create connection
		xmppServerConnection=null;
		// Create different server connection
		if(server=="Gtalk")
			xmppServerConnection=XmppServerConnectionFactory.CreateGtalkConnection();
		// Connect and login
		xmppServerConnection.connect();
		xmppServerConnection.login(username, password);
		// Initialize
		initialize();
	}
	
	public List<HashMap<String, String>> loadRoster()
	{
		return rosterManager.getRosterMapList();
	}

	public void StartChat(String userName,MessageListener listener)
	{
		final Chat chat = xmppServerConnection.getConnection().getChatManager().createChat(userName,listener);
		
	}
	
	public void disconnect()
	{
		xmppServerConnection.disconnect();
	}
	
	
}