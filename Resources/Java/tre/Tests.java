package tre;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class Tests {

  @Test
  public void heapTest() {
    System.out.println("\n\nHeap Test\n");
    Heap<Integer,String> a = new Heap<Integer,String>(false,10);
    a.insert(12,"a");
    a.insert(3,"b");
    a.insert(222,"c");
    a.insert(23,"d");
    a.insert(42,"e");
    a.insert(1000,"f");
    a.insert(-1234,"g");
    a.insert(-23,"h");
    assertTrue(a.isHeap());
    a.extract();
    assertTrue(a.isHeap());
    a.extract();
    assertTrue(!a.contains("h") && a.contains("c"));
    a.changeKey("f",-1000); // should be in first position now
    assertTrue(a.isHeap());
    a.extract();
    assertTrue(a.isHeap());
    a.changeKey("a",-9000);
    assertTrue(a.isHeap());
    //System.out.println(a.h);
    //System.out.println(a.indexes);
  }
}
