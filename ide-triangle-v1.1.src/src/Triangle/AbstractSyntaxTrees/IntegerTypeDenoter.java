package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class IntegerTypeDenoter extends Command {

  public IntegerTypeDenoter (IntegerLiteral ilAST, SourcePosition thePosition) {
    super (thePosition);
    IL = ilAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitIntegerTypeDenoter(this, o);
  }

  public IntegerLiteral IL;
}