/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 *
 * @author Esteban
 */
public class RepeatForCommand extends Command{
    public RepeatForCommand (Declaration dAST, Expression eAST, Command cAST, SourcePosition thePosition) {
        super (thePosition);
        D = dAST;
        E = eAST;
        C = cAST;
    }

    @Override
    public Object visit(Visitor v, Object o) {
        return v.visitRepeatForCommand(this, o);
    }

    public Declaration D;
    public Expression E;
    public Command C;
}
