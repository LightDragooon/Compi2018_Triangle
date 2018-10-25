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
public class LiteralEntry {
    
    protected String idLiteral;
    protected int level;
    protected LiteralEntry previous;

    public LiteralEntry(String idLiteral, int level, LiteralEntry previous) {
        this.idLiteral = idLiteral;
        this.level = level;
        this.previous = previous;
    }
  
  
  
    
}
