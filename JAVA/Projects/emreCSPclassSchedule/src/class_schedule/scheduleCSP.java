package class_schedule;


import parts.CSP;
import parts.Domain;
import parts.Variable;
import parts.BinaryConstraint;


/**
 * scheduling this classes can be
 * viewed as a constraint satisfaction problem (CSP). The goal is to assign
 * classroom to each class so that no class have the same time.
 */
public class scheduleCSP extends CSP {
	
    public static final Variable c1 = new Variable("Intro to Programming");
    public static final Variable c2 = new Variable("Intro to Artificial Intelligence");
    public static final Variable c3 = new Variable("Image Processing");
    public static final Variable c4 = new Variable("Databases");
    public static final Variable c5 = new Variable("Computer Organization");
    public static final String C01 = "C01";
    public static final String B01 = "B01";
    public static final String A01 = "A01";


    /**
     * Constructs a schedule CSP for the scheduling classes, with the classrooms A01, B01, and C01.
     */
    public scheduleCSP() {
        
    	collectVariables();
    	
        Domain classrooms = new Domain(new Object[]{C01, B01, A01});


        
        for (Variable var : getVariables())
            setDomain(var, classrooms);
        /*
         * Classes having the same time are given below.
         * 
         */
        addConstraint(new BinaryConstraint(c1, c2));
        addConstraint(new BinaryConstraint(c2, c3));
        addConstraint(new BinaryConstraint(c2, c4));
        addConstraint(new BinaryConstraint(c3, c4));
        addConstraint(new BinaryConstraint(c3, c5));
        addConstraint(new BinaryConstraint(c4, c5));
        
    }

    /**
     * Returns classes as a list of
     * variables.
     */
    private void collectVariables() {
        addVariable(c1);
        addVariable(c2);
        addVariable(c3);
        addVariable(c4);
        addVariable(c5);
    }	
   
}