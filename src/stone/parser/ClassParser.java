package stone.parser;

import static stone.parser.Parser.rule;

import stone.ast.*;
import stone.Token;

public class ClassParser extends ClosureParser {
  Parser member = rule().or(def, simple);
  Parser class_body = rule(ClassBody.class).sep("{").option(member)
      .repeat(rule().sep(";", Token.EOL).option(member))
      .sep("}");
  Parser defclass = rule(ClassStmnt.class).sep("class").identifier(reserved)
      .option(rule().sep("extends").identifier(reserved))
      .ast(class_body);

  public ClassParser() {
    postfix.insertChoice(rule(Dot.class).sep(".").identifier(reserved));
    program.insertChoice(defclass);
  }
}
