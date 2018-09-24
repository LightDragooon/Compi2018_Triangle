package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 *
 * @author Esteban
 */
public class RepeatUntilCommand extends Command {

  public RepeatUntilCommand (Expression eAST, Command cAST, SourcePosition thePosition) {
    super (thePosition);
    E = eAST;
    C = cAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitRepeatUntilCommand(this, o);
  }

  public Expression E;
  public Command C;
}
