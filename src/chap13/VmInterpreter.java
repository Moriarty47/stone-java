package chap13;

import chap8.Natives;
import chap11.EnvOptInterpreter;

import stone.ParseException;
import stone.parser.FuncParser;

public class VmInterpreter extends EnvOptInterpreter {
  public static void main(String[] args) throws ParseException {
    run(new FuncParser(),
        new Natives().environment(new StoneVMEnv(100000, 100000, 1000)));
  }
}
