import org.jivesoftware.smack.SASLAuthentication;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : DrivieTalkie
//  @ File Name : GtalkConnection.java
//  @ Date : 07/04/2013
//  @ Author : 
//
//

public class GtalkConnection extends XmppServerConnection {
	
	public void GtalkConnection() {
		host="talk.google.com";
		port=5222;
		service="gmail.com";
	}
	
	public void setupConnection(){
		super.setupConnection();
		SASLAuthentication.supportSASLMechanism("PLAIN", 0);
	}
}