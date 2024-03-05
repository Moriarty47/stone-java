package chap11;

import javassist.gluonj.util.Loader;

import chap8.NativeEvaluator;

public class EnvOptRunner {
  public static void main(String[] args) throws Throwable {
    Loader.run(EnvOptInterpreter.class, args, EnvOptimizer.class,
        NativeEvaluator.class);
  }
}
