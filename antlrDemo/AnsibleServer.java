import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.Remote;
import java.rmi.server.UnicastRemoteObject;
import java.io.*;
import java.util.Map;
import java.util.HashMap;

public class AnsibleServer extends UnicastRemoteObject implements RmiServer {
	
	private static String ip;
	private static int port;
	private HashMap<String, Probe> probe;

	/*
	 * Ldap, Sales, Mail do not need probes
	 */
	public AnsibleServer() throws RemoteException {
		super();
		probe = new HashMap<String, Probe>();
		// probe.put("elk", new ElkProbe("10.0.0.11", 15214));
		// probe.put("wazuh", new WazuhProbe("10.0.0.12", 15214));
		probe.put("contractor", new ContractorProbe("54.162.92.101", 15214));
		// probe.put("web", new WebProbe("10.0.0.16", 15214));
		probe.put("blackhat", new BlackhatProbe("18.210.15.175", 15214));
		probe.put("ftp", new FtpProbe("34.229.56.58", 15214));
		// probe.put("payments", new PaymentsProbe("10.0.0.20", 15214));
	}

	public static void main(String[] args) {
		try {
			ip = args[0];
			port = Integer.parseInt(args[1]); 
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		AnsibleServer srv = null;
		try {
			srv = new AnsibleServer();
		} catch (RemoteException e) {
			System.err.println("fail to create the RMI server");
			e.printStackTrace();
		}
		
		try {
			System.setProperty("java.rmi.server.hostname", ip);
			LocateRegistry.createRegistry(port);
			Naming.rebind(String.format("//127.0.0.1:%d/ServerService", port), srv);
		} catch (RemoteException e) {
			System.err.println("fail to create the RMI registry");
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Integer checkFile(String path) throws RemoteException {
		File file = new File(path);
		if (file.exists()) {
			return 1;
		}
		return 0;
	}

	@Override
	public Integer checkLogin() throws RemoteException {
		return 0;
	} 

	@Override
	public HashMap<String, Probe> getProbe() throws RemoteException {
		return new HashMap<String, Probe>(probe);
	}

}

	