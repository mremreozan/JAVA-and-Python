package parts;
import java.util.ArrayList;
import java.util.List;

import parts.Assignment;
import parts.Constraint;
import parts.Variable;

/**
 * Represents a binary constraint which forbids equal values.
 * 
 * This problem has a fixed number of variables (one for each state) and non-equality constraints between neighboring states. 
 * All the variable have the same domain (A01, B01, C01). 
 * Constraints are defined using a BinaryConstraint (which implements the Constraint interface) which holds true 
 * iff the values of the two constrained variables are different
 */
public class BinaryConstraint implements Constraint{
    private Variable var1;
    private Variable var2;
    private List<Variable> scope;

    public BinaryConstraint(Variable var1, Variable var2) {
        this.var1 = var1;
        this.var2 = var2;
        scope = new ArrayList<Variable>(2);
        scope.add(var1);
        scope.add(var2);
    }

    @Override
    public List<Variable> getScope() {
        return scope;
    }

    @Override
    public boolean isSatisfiedWith(Assignment assignment) {
        Object value1 = assignment.getAssignment(var1);
        return value1 == null || !value1.equals(assignment.getAssignment(var2));
    }
}
