package core;
import org.jivesoftware.smack.SASLAuthentication;

public class GtalkConnection extends XmppServerConnection {
	
	public GtalkConnection() {
		host="talk.google.com";
		port=5222;
		service="gmail.com";
	}
	
	public void setupConnection(){
		super.setupConnection();
		SASLAuthentication.supportSASLMechanism("PLAIN", 0);
	}
}
