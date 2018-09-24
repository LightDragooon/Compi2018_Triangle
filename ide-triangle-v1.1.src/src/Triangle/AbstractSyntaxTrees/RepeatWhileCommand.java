package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;
/**
 *
 * @author Esteban
 */
public class RepeatWhileCommand extends Command {

  public RepeatWhileCommand (Expression eAST, Command cAST, SourcePosition thePosition) {
    super (thePosition);
    E = eAST;
    C = cAST;
  }

  @Override
  public Object visit(Visitor v, Object o) {
    return v.visitRepeatWhileCommand(this, o);
  }

  public Expression E;
  public Command C;
}
