package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class SequentialIntegerTypeDenoter extends Command {

  public SequentialIntegerTypeDenoter (IntegerLiteral il1AST, IntegerLiteral il2AST, SourcePosition thePosition) {
    super (thePosition);
    IL1 = il1AST;
    IL2 = il2AST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitSequentialIntegerTypeDenoter(this, o);
  }

  public IntegerLiteral IL1;
  public IntegerLiteral IL2;
}