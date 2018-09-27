package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class IntegerCommand extends Command {

  public IntegerCommand (IntegerLiteral ilAST, SourcePosition thePosition) {
    super (thePosition);
    IL = ilAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitIntegerCommand(this, o);
  }

  public IntegerLiteral IL;
}