/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.ContextualAnalyzer;



/**
 *
 * @author Josua
 */
public class IteralEntry {
    
    protected String iteral;
    protected String type;
    protected int level;
    protected IteralEntry previous;

    public IteralEntry(String iteral, String type, int level, IteralEntry previous) {
        this.iteral = iteral;
        this.type = type;
        this.level = level;
        this.previous = previous;
    }
  
  
  
    
}
