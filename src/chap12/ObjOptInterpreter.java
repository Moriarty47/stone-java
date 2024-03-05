package chap12;

import chap8.Natives;
import chap11.EnvOptInterpreter;
import chap11.ResizableArrayEnv;

import stone.ParseException;
import stone.parser.ClassParser;

public class ObjOptInterpreter extends EnvOptInterpreter {
  public static void main(String[] args) throws ParseException {
    run(new ClassParser(),
        new Natives().environment(new ResizableArrayEnv()));
  }
}
