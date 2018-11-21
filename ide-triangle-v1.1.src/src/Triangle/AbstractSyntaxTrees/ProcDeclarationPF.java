package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ProcDeclarationPF extends Declaration {

    public ProcDeclarationPF(Identifier iAST, FormalParameterSequence fpsAST,
            Command cAST, SourcePosition thePosition) {
        super(thePosition);
        I = iAST;
        FPS = fpsAST;
        C = cAST;
        justI = true;
    }

    @Override
    public Object visit(Visitor v, Object o) {
        return v.visitProcDeclarationPF(this, o);
    }

    public Identifier I;
    public FormalParameterSequence FPS;
    public Command C;
    public boolean justI;
}
