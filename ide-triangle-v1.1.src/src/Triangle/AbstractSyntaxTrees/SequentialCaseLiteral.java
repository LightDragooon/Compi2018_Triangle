/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class SequentialCaseLiteral extends Expression {

  public SequentialCaseLiteral (Expression e1AST, Expression e2AST,
                       SourcePosition thePosition) {
    super (thePosition);
    E1 = e1AST;
    E2 = e2AST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitSequentialCaseLiteral(this, o);
  }

  public Expression E1;
  public Expression E2;
}