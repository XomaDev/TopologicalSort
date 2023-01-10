import xyz.kumaraswamy.topologicalsort.Child;
import xyz.kumaraswamy.topologicalsort.GraphWay;
import xyz.kumaraswamy.topologicalsort.Node;
import xyz.kumaraswamy.topologicalsort.TopologicalSort;

import java.util.Arrays;
import java.util.List;

import static xyz.kumaraswamy.topologicalsort.Child.child;
import static xyz.kumaraswamy.topologicalsort.Node.node;

public class Main {
   public static void main(String[] args) {
//      first();
//      second(); idk never tested this
//      third();
//      fourth();

      theGraphWay();
   }

   /**
    * I dont know why people want to
    * do this way, edges, why shouldnt we just
    * normally construct a node manually? eh maybe
    */

   private static void theGraphWay() {
      List<Node> list = new GraphWay()
              .needs(5, 4, 2, 3, 0, 1)
              .add(5, 2)
              .add(5, 0)
              .add(4, 0)
              .add(4, 0)
              .add(4, 1)
              .add(2, 3)
              .add(3, 1)
              .get();
      TopologicalSort sort = new TopologicalSort(list.size(), list);
      Object[] sorted = sort.start();
      System.out.println(Arrays.toString(sorted));
   }

   private static void fourth() {
      Child n5 = child(5);
      Node n4 = node(4, n5);

      Node n1 = node(1,
              node(2,
                      n5,
                      n4),
              node(3,
                      n4));
      Object[] sorted = new TopologicalSort(Node.getInstanceCount(),
              List.of(n1))
              .start();
      System.out.println(Arrays.toString(sorted));
   }

   private static void third() {
      Child n0 = child(0);

      Child n1 = child(1);


      Node n3 = node(3, n1);
      Node n2 = node(2, n3);



      Node n5 = node(5, n2, n0);
      Node n4 = node(4, n0, n1);



      Object[] sorted = new TopologicalSort(Node.getInstanceCount(),
              List.of(n4, n5))
              .start();
      System.out.println(Arrays.toString(sorted));
   }

   private static void second() {
      Child n10 = child(10);
      Child n9 = child(9);

      Node n8 = node(8,
              n9);

      Node n11 = node(child(2),
              n9,
              n10);

      Node n7 = node(7,
              n11,
              n8);

      Node n5 = node(5,
              n11);

      Node n3 = node(3,
              n8,
              n10);
   }

   private static void first() {
      Child dNode = child('D');

      Node cNode = node('C',
              dNode);

      Node fNode =
              node('F',
                      dNode,
                      child('E'));

      Node bNode = node('B',
              cNode,
              fNode);

      Node gNode =
              node('G',
                      bNode,
                      fNode);

      Node aNode = node('A',
              bNode,
              cNode);

      Object[] sorted = new TopologicalSort(Node.getInstanceCount(),
              List.of(gNode, aNode))
              .start();
      System.out.println(Arrays.toString(sorted));
   }
}