import soot.*;
import soot.options.*;
import java.util.Map;

public class Test {
  public static void main(String[] args) {
    PackManager.v().getPack("jtp").add(
                                       new Transform("jtp.myTransform", new MyTransform()));

    Options.v().set_verbose(true);
    soot.Main.main(args);
  }
}
