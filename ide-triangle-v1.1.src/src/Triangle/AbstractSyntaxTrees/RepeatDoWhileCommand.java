package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;
/**
 *
 * @author Esteban
 */
public class RepeatDoWhileCommand extends Command{

  public RepeatDoWhileCommand (Expression eAST, Command cAST, SourcePosition thePosition) {
    super (thePosition);
    E = eAST;
    C = cAST;
  }

  @Override
  public Object visit(Visitor v, Object o) {
    return v.visitRepeatDoWhileCommand(this, o);
  }

  public Expression E;
  public Command C;
}

