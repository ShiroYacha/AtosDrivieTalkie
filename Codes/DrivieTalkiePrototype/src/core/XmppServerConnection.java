package core;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.SASLAuthentication;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;

public abstract class XmppServerConnection {
	
	protected String host;
	protected int port;
	protected String service;
	protected XMPPConnection connection;
	
	public XMPPConnection getConnection() {
		return connection;
	}
	
	protected void setupConnection() {
		ConnectionConfiguration connectionConfiguration=new ConnectionConfiguration(host,
                port, service);
		connection = new XMPPConnection(connectionConfiguration);
	}
	
	public void connect() throws XMPPException {
		setupConnection();
		connection.connect();
	}
	
	public void disconnect() {
		connection.disconnect();
	}
	
	public void login(String username, String password) throws XMPPException {
		SASLAuthentication.supportSASLMechanism("PLAIN", 0);
		connection.login(username, password);
	}
}
