package core;

public class XmppServerConnectionFactory {

	public static XmppServerConnection CreateGtalkConnection() {
	
		XmppServerConnection gtalkConnection=new GtalkConnection();
		return gtalkConnection;
	}
}
