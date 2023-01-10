package xyz.kumaraswamy.topologicalsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node {

   private static int INSTANCES = 0;

   public static Node node(Object value, Node... children) {
      INSTANCES++;
      return new Node(value, children);
   }

   public static void addInstanceCount() {
      INSTANCES++;
   }

   public static int getInstanceCount() {
      int count = INSTANCES;
      INSTANCES = 0;
      return count;
   }

   public Object value;
   public ArrayList<Node> children;

   private boolean visited = false;

   public Node(Object value, Node... children) {
      this.value = value;
      this.children = new ArrayList<>(Arrays.asList(children));
   }

   public void visit() {
      visited = true;
   }

   public boolean isVisited() {
      return visited;
   }

   @Override
   public String toString() {
      return "Node{" +
              "value=" + value +
              ", children=" + children +
              '}';
   }
}
