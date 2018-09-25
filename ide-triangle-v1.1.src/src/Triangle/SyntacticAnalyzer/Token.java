/*
 * @(#)Token.java                        2.1 2003/10/07
 *
 * Copyright (C) 1999, 2003 D.A. Watt and D.F. Brown
 * Dept. of Computing Science, University of Glasgow, Glasgow G12 8QQ Scotland
 * and School of Computer and Math Sciences, The Robert Gordon University,
 * St. Andrew Street, Aberdeen AB25 1HG, Scotland.
 * All rights reserved.
 *
 * This software is provided free for educational use only. It may
 * not be used for commercial purposes without the prior written permission
 * of the authors.
 */

package Triangle.SyntacticAnalyzer;


final class Token extends Object {

  protected int kind;
  protected String spelling;
  protected SourcePosition position;

  public Token(int kind, String spelling, SourcePosition position) {

    if (kind == Token.IDENTIFIER) {
      int currentKind = firstReservedWord;
      boolean searching = true;

      while (searching) {
        int comparison = tokenTable[currentKind].compareTo(spelling);
        if (comparison == 0) {
          this.kind = currentKind;
          searching = false;
        } else if (comparison > 0 || currentKind == lastReservedWord) {
          this.kind = Token.IDENTIFIER;
          searching = false;
        } else {
          currentKind ++;
        }
      }
    } else
      this.kind = kind;

    this.spelling = spelling;
    this.position = position;

  }

  public static String spell (int kind) {
    return tokenTable[kind];
  }

  public String toString() {
    return "Kind=" + kind + ", spelling=" + spelling +
      ", position=" + position;
  }

  // Token classes...

  public static final int

    // literals, identifiers, operators...
    INTLITERAL	= 0,
    CHARLITERAL	= 1,
    IDENTIFIER	= 2,
    OPERATOR	= 3,

    // reserved words - must be in alphabetical order...
    ARRAY		= 4,
    //BEGIN		= 5,    //SE ELIMINA LA PALABRA RESERVADA BEGIN    
    CASE                = 5,    //SE A�ADE LA PALABRA RESERVADA CASE
    CONST		= 6,
    DO			= 7,
    ELSE		= 8,
    ELSIF               = 9,    //SE A�ADE LA PALABRA RESERVADA ELSIF
    END			= 10,
    FOR                 = 11,   //SE A�ADE LA PALABRA RESERVADA FOR
    FROM                = 12,   //SE A�ADE LA PALABRA RESERVADA FROM
    FUNC		= 13,
    IF			= 14,
    IN			= 15,
    LET			= 16,
    LOCAL               = 17,   //SE A�ADE LA PALABRA RESERVADA LOCAL
    NIL                 = 18,   //SE A�ADE LA PALABRA RESERVADA NIL
    OF			= 19,
    PROC		= 20,
    RECORD		= 21,
    RECURSIVE           = 22,   //SE A�ADE LA PALABRA RESERVADA RECURSIVE
    REPEAT              = 23,   //SE A�ADE LA PALABRA RESERVADA REPEAT
    SELECT              = 24,   //SE A�ADE LA PALABRA RESERVADA SELECT
    THEN		= 25,
    TO                  = 26,   //SE A�ADE LA PALABRA RESERVADA TO
    TYPE		= 27,
    UNTIL               = 28,   //SE A�ADE LA PALABRA RESERVADA UNTIL
    VAR			= 29,
    WHILE		= 30,

    // punctuation...
    DOT			= 31,
    DOTDOT              = 32, //SE A�ADE EL DOBLE PUNTO
    COLON		= 33,
    SEMICOLON	        = 34,
    COMMA		= 35,
    BECOMES		= 36,
    IS			= 37,

    // brackets...
    LPAREN		= 38,
    RPAREN		= 39,
    LBRACKET	        = 40,
    RBRACKET	        = 41,
    LCURLY		= 42,
    RCURLY		= 43,

    // special tokens...
    EOT			= 44,
    ERROR		= 45;

  private static String[] tokenTable = new String[] {
    "<int>",
    "<char>",
    "<identifier>",
    "<operator>",
    "array",
    //"begin",     //SE ELIMINA LA PALABRA RESERVADA BEGIN
    "case",        //SE A�ADE LA PALABRA RESERVADA CASE
    "const",
    "do",
    "else",
    "elsif",       //SE A�ADE LA PALABRA RESERVADA CASE
    "end",
    "for",         //SE A�ADE LA PALABRA RESERVADA CASE
    "from",        //SE A�ADE LA PALABRA RESERVADA CASE
    "func",
    "if",
    "in",
    "let",
    "local",      //SE A�ADE LA PALABRA RESERVADA CASE
    "nil",        //SE A�ADE LA PALABRA RESERVADA CASE
    "of",
    "proc",
    "record",
    "recursive",  //SE A�ADE LA PALABRA RESERVADA CASE
    "repeat",     //SE A�ADE LA PALABRA RESERVADA CASE
    "select",     //SE A�ADE LA PALABRA RESERVADA CASE
    "then",
    "to",         //SE A�ADE LA PALABRA RESERVADA CASE
    "type",
    "until",      //SE A�ADE LA PALABRA RESERVADA CASE
    "var",
    "while",
    ".",
    "..",         //SE A�ADE EL DOBLE PUNTO   
    ":",
    ";",
    ",",
    ":=",
    "~",
    "(",
    ")",
    "[",
    "]",
    "{",
    "}",
    "",
    "<error>"
  };

  private final static int	firstReservedWord = Token.ARRAY,
  				lastReservedWord  = Token.WHILE;

}
