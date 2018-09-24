package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;
/**
 *
 * @author Esteban
 */
public class RepeatDoUntilCommand extends Command{

  public RepeatDoUntilCommand (Expression eAST, Command cAST, SourcePosition thePosition) {
    super (thePosition);
    E = eAST;
    C = cAST;
  }

  @Override
  public Object visit(Visitor v, Object o) {
    return v.visitRepeatDoUntilCommand(this, o);
  }

  public Expression E;
  public Command C;
}