/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<TreeNode, TreeNode> map = new HashMap<>();
    ArrayList<Integer> arr = new ArrayList<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) 
    {
        buildParent(root,null);
        Queue<TreeNode> queue = new LinkedList<>();
        HashSet<TreeNode> visited = new HashSet<>();
        queue.add(target);
        visited.add(target);

        int dist = 0;
        while(!queue.isEmpty())
        {
            if(dist == k)
                break;
            
            int size = queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curr = queue.poll();
                if(curr.left != null && visited.add(curr.left))
                    queue.add(curr.left);
                
                if(curr.right != null && visited.add(curr.right))
                    queue.add(curr.right);
                
                if(map.get(curr) != null && visited.add(map.get(curr)))
                    queue.add(map.get(curr));
            }
            dist++;
        }
        for(TreeNode num : queue)
            arr.add(num.val);
        
        return arr;
    }

    public void buildParent(TreeNode root,TreeNode parent)
    {
        if(root == null)
            return;
        map.put(root,parent);
        buildParent(root.left, root);
        buildParent(root.right, root);
    }
}