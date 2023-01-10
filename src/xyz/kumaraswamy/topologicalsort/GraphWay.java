package xyz.kumaraswamy.topologicalsort;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static xyz.kumaraswamy.topologicalsort.Node.node;

public class GraphWay {
   private final HashMap<Integer, Node> nodes = new HashMap<>();

   public GraphWay add(int n, int point) {
      Node node = nodes.get(n);
      node.children.add(nodes.get(point));

      nodes.put(n, node);
      return this;
   }

   public GraphWay needs(int... points) {
      for (int point : points) {
         nodes.put(point, node(point));
      }
      return this;
   }

   public List<Node> get() {
      List<Node> list = new ArrayList<>(nodes.size());
      for (Node node : nodes.values()) {
         list.add(node);
      }
      return list;
   }
}
