package br.edu.cefsa.ett.ec;

//Singleton

public final class ReatorController {

	private static ReatorController rc;
	
	private ReatorController() {
		
	} //ReatorController - Constructor
	
	public static synchronized ReatorController getInstance() {
		if (rc == null) {
			rc = new ReatorController();
		} //if
		
		return rc;
	} //getInstance
	
	public void startReactor() {
		
	}
	
	public void stopReactor() {
		
	}
} //ReatorController
