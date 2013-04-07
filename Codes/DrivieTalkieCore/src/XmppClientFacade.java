//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : DrivieTalkie
//  @ File Name : XmppClientFacade.java
//  @ Date : 07/04/2013
//  @ Author : 
//
//

import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;

public class XmppClientFacade {
	private XMPPConnection xmppConnection;
	public void login(String username, String password, String server) throws XMPPException {
	
		XmppServerConnection xmppServerConnection=null;
		// Create different server connection
		switch (server) {
		case "Gtalk":
			xmppServerConnection=XmppServerConnectionFactory.CreateGtalkConnection();
			break;
		default:
			break;
		}
		// Connect and login
		xmppServerConnection.connect();
		xmppServerConnection.login(username, password);
		// Store connection
		xmppConnection=xmppServerConnection.getConnection();
	}
}