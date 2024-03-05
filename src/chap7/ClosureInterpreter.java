package chap7;

import chap6.BasicInterpreter;
import stone.ParseException;
import stone.parser.ClosureParser;

public class ClosureInterpreter extends BasicInterpreter {
  public static void main(String[] args) throws ParseException {
    run(new ClosureParser(), new NestedEnv());
  }
}
