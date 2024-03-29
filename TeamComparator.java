/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseball;

import baseball.Baseball;
import java.util.Comparator;

/**
 * Class on how to compare 2 States objects
 * @author Darius Canty
 */
public class TeamComparator implements Comparator<Baseball> {
    
     /**
     * Compares its two arguments for order.  Returns a negative integer,
     * zero, or a positive integer as the first argument is less than, equal
     * to, or greater than the second.
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return a negative integer, zero, or a positive integer as the
     *         first argument is less than, equal to, or greater than the
     *         second.
     * @throws NullPointerException if an argument is null and this
     *         comparator does not permit null arguments
     * @throws ClassCastException if the arguments types prevent them from
     *         being compared by this comparator.
     */
    @Override
    public int compare(Baseball o1, Baseball o2) {
         return o1.getName().compareTo(o2.getName());
    }
    
}
