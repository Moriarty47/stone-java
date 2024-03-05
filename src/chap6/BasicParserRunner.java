package chap6;

import javassist.gluonj.util.Loader;

public class BasicParserRunner {
  public static void main(String[] args) throws Throwable {
    Loader.run(BasicInterpreter.class, args, BasicEvaluator.class);
  }
}
