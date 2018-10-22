package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ProcPFDeclaration extends Declaration {

  public ProcPFDeclaration (Identifier iAST, FormalParameterSequence fpsAST,
  		   Command cAST, SourcePosition thePosition) {
    super (thePosition);
    I = iAST;
    FPS = fpsAST;
    C = cAST;
  }

  public Object visit (Visitor v, Object o) {
    return v.visitProcPFDeclaration(this, o);
  }

  public Identifier I;
  public FormalParameterSequence FPS;
  public Command C;
}