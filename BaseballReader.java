/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseball;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
/**
 *
 * @author Darius Canty
 */
public class BaseballReader {
    @XmlElement(name = "player")
    private final List<Baseball> team = new ArrayList<>();
    public List<Baseball> getName() {
    return team;
    } 
}