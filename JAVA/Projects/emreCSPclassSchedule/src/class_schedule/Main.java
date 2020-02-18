package class_schedule;

import parts.CSP;
import parts.BacktrackingStrategy;
import parts.CSPStateListener;
import parts.Assignment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		scheduleCSP scheduling = new scheduleCSP();
		BacktrackingStrategy bts = new BacktrackingStrategy();
		bts.addCSPStateListener(new CSPStateListener() {
			@Override
		    public void stateChanged(Assignment assignment, CSP csp) {

		    	System.out.println("Assignment Iterations : " + assignment);
		        
		    }
	        
		    @Override
		    public void stateChanged(CSP csp) {
		        System.out.println("CSP evolved : " + csp);
		    }
		});

		Assignment sol = bts.solve(scheduling);  //To solve a CSP, you only have to call the solve() method. 
		System.out.println(sol); 

	}

}
