package parts;

import java.util.List;

/**
 * A constraint specifies the allowable combinations of values for a set of
 * variables. Each constraint consists of a pair <scope, rel>, where scope is a
 * tuple of variables that participate in the constraint and rel is a relation
 * that defines the values that those variables can take on.<br>
 * <br>
 * <b>Note:</b> Implementations of this interface define the different kinds of
 * relations that constraints can represent.
 */
public interface Constraint {
    /**
     * Returns a tuple of variables that participate in the constraint.
     * It has only two methods: 
                          "getScope()" which returns the set of variables in the scope of this constraint, 
                          "isSatisfiedWith()" which returns true if the constraint is satisfied for a given assignment. 
     */
    List<Variable> getScope();

    /**
     * Constrains the values that the variables can take on.
     */
    boolean isSatisfiedWith(Assignment assignment);
}