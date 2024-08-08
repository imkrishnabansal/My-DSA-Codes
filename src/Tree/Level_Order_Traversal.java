package Tree;
import java.util.*;
class Nodes{
    int val;
    Nodes left;
    Nodes right;

    Nodes(int val){
        this.val =val;
        left =null;
        right =null;
    }
}
public class Level_Order_Traversal {
    public List<List<Integer>>  levelOrder(Nodes root){
        Queue<Nodes> queue = new LinkedList<Nodes>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        if(root==null)
            return wrapList;
            queue.offer(root);
            while (!queue.isEmpty()){
                int levelnum = queue.size();
                List<Integer>sublist = new LinkedList<Integer>();
                for(int i =0;i<levelnum;i++){
                    Nodes currentNode = queue.poll();
                    sublist.add(currentNode.val);
                    if(currentNode.left!=null){
                        queue.offer(currentNode.left);
                    }
                    if(currentNode.right!=null){
                        queue.offer(currentNode.right);
                    }
                }
                wrapList.add(sublist);

            }
        return wrapList;
    }
    public static void main(String[] args) {
        Nodes root = new Nodes(1);
        root.left = new Nodes(2);
        root.right = new Nodes(3);
        root.left.left = new Nodes(4);
        root.left.right = new Nodes(5);
        root.right.left = new Nodes(6);
        root.right.right = new Nodes(7);
        Level_Order_Traversal traversal = new Level_Order_Traversal();
        List<List<Integer>> result = traversal.levelOrder(root);
        System.out.println("Level order" + result);
    }
}

