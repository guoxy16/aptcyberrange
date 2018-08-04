import java.rmi.RemoteException;

public class BlackhatProbe extends Probe {

	public BlackhatProbe(String srvIP, int srvPort) {
		super(srvIP, srvPort);
	}

	public Integer checkFile(String path) throws RemoteException {
		return srv.checkFile(path);
	}
	
}