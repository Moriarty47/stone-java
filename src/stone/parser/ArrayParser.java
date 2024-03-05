package stone.parser;

import static stone.parser.Parser.rule;

import javassist.gluonj.*;
import stone.ast.ArrayRef;
import stone.ast.ArrayLiteral;

@Reviser
public class ArrayParser extends FuncParser {
  Parser elements = rule(ArrayLiteral.class)
      .ast(expr).repeat(rule().sep(",").ast(expr));

  public ArrayParser() {
    reserved.add("]");
    primary.insertChoice(rule().sep("[").maybe(elements).sep("]"));
    postfix.insertChoice(rule(ArrayRef.class).sep("[").ast(expr).sep("]"));
  }
}
