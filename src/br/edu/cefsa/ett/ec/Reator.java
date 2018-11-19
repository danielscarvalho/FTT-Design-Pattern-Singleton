package br.edu.cefsa.ett.ec;

import java.util.Date;

public class Reator {
	
	public static void main (String args[]) {
		System.out.print(new Date());
		System.out.println(" - Reator");
		
		final ReatorController rc = ReatorController.getInstance();
	
		rc.startReactor();
	}
	
}

