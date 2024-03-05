package chap8;

import chap7.NestedEnv;
import chap6.BasicInterpreter;

import stone.ParseException;
import stone.parser.ClosureParser;

public class NativeInterpreter extends BasicInterpreter {
  public static void main(String[] args) throws ParseException {
    run(new ClosureParser(),
        new Natives().environment(new NestedEnv()));
  }
}
