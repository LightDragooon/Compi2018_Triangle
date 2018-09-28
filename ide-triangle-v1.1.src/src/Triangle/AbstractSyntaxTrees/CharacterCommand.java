package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class CharacterCommand extends Command {

  public CharacterCommand (CharacterLiteral clAST, SourcePosition thePosition) {
    super (thePosition);
    CL = clAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitCharacterCommand(this, o);
  }

  public CharacterLiteral CL;
}