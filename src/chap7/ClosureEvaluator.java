package chap7;

import java.util.List;

import javassist.gluonj.*;

import stone.ast.Fun;
import stone.Environment;
import stone.ast.ASTree;

@Require(FuncEvaluator.class)
@Reviser
public class ClosureEvaluator {
  @Reviser
  public static class FunEx extends Fun {
    public FunEx(List<ASTree> c) {
      super(c);
    }

    public Object eval(Environment env) {
      return new Function(parameters(), body(), env);
    }
  }
}
