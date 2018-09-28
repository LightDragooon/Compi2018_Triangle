package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class SelectCommand extends Command {

  public SelectCommand (Expression eAST, Command cAST,
                       SourcePosition thePosition) {
    super (thePosition);
    E = eAST;
    C = cAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitSelectCommand(this, o);
  }

  public Expression E;
  public Command C;
}