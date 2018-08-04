import java.rmi.RemoteException;

public class FtpProbe extends Probe {

	public FtpProbe(String srvIP, int srvPort) {
		super(srvIP, srvPort);
	}

	public Integer checkFile(String path) throws RemoteException {
		return srv.checkFile(path);
	}
	
}