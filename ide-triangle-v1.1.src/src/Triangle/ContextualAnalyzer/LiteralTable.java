/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.ContextualAnalyzer;

import Triangle.AbstractSyntaxTrees.IntegerLiteral;
import java.util.Stack;

/**
 *
 * @author Josua
 */
public class LiteralTable { // literal

    private int level;
    private LiteralEntry latest;

    public LiteralTable() {
        level = 0;
        latest = null;
    }

    // Opens a new level in the identification table, 1 higher than the
    // current topmost level.

    public void openScope () {
      level ++;
    }

    // Closes the topmost level in the identification table, discarding
    // all entries belonging to that level.

    public void closeScope () {
        LiteralEntry entry, local;


      // Presumably, idTable.level > 0.
      entry = this.latest;
      while (entry != null && entry.level == this.level) {
        local = entry;
        entry = local.previous;
      }
      this.level--;
      this.latest = entry;
    }

    // Makes a new entry in the identification table for the given identifier
    // and attribute. The new entry belongs to the current level.
    // duplicated is set to to true iff there is already an entry for the
    // same identifier at the current level.

    public boolean enter (String id) {

      LiteralEntry entry = this.latest;
      boolean present = false, searching = true;

      // Check for duplicate entry ...
      while (searching) {
        if (entry == null || entry.level < this.level)
            searching = false;
        else if (entry.idLiteral.equals(id)) {
            present = true;
            searching = false;
         } else{
            entry = entry.previous;}
        
      }

      // Add new entry ...
      entry = new LiteralEntry(id, this.level, this.latest);
      this.latest = entry;
      return present;
    }
    
}
