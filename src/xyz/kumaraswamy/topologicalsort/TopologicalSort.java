package xyz.kumaraswamy.topologicalsort;

import java.util.List;

public class TopologicalSort {

   private final List<Node> initialNodes;

   private int index;
   private final Object[] sorted;

   public TopologicalSort(int total, List<Node> initialNodes) {
      this.initialNodes = initialNodes;
      this.sorted = new Object[total];
      index = total;
   }

   public Object[] start() {
      run(initialNodes);
      return sorted;
   }

   private void run(List<Node> nodes) {
      for (Node node : nodes) {
         if (node.isVisited()) {
            continue;
         }
         node.visit();

         if (!(node instanceof Child)) {
            run(node.children);
         }
         addChar(node.value);
      }
   }

   private void addChar(Object ch) {
      sorted[--index] = ch;
   }
}
