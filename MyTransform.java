import soot.options.*;

import soot.*;
import soot.jimple.*;
import soot.toolkits.scalar.*;
import soot.util.*;
import soot.toolkits.graph.*;
import java.util.*;

public class MyTransform extends BodyTransformer
{
    public MyTransform() {}

    protected void internalTransform(Body b, String phaseName, Map options)
    {
      //Replace this with your optimization
      for (Unit u : b.getUnits()) {
        System.out.println(u.getTags());
      }
    }
}







