package stone;
import java.io.IOException;

public class ParseException extends Exception {
  private static String location(Token t) {
    if (t == Token.EOF) {
      return "the last line";
    }
    return "\"" + t.getText() + "\" at line " + t.getLineNumber();
  }

  public ParseException(String msg, Token t) {
    super("syntax error around " + location(t) + ". " + msg);
  }

  public ParseException(Token t) {
    this("", t);
  }

  public ParseException(IOException e) {
    super(e);
  }

  public ParseException(String msg) {
    super(msg);
  }
}
