public class BinaryTree {
    private Node root;
    BinaryTree()
    {
        root = null;
    }
    static class Node
    {
        int value;
        Node left;
        Node right;
        Node(int value)
        {
            this.value = value;
            left = null;
            right = null;
        }
        public void displayData()
        {
            System.out.print(value + " ");
        }
    }

    public void insert(int i)
    {
        root = insert(root, i);
    }

    public Node insert(Node node, int value)
    {
        if(node == null){
            return new Node(value);
        }
        if(value < node.value)
        {
            node.left = insert(node.left, value);
        }

        else if(value > node.value)
        {
            node.right = insert(node.right, value);
        }
        return node;
    }
    public Node find(int searchedValue)
    {
        Node current = root;
        while(current.value != searchedValue)
        {
            if(searchedValue < current.value)
                current = current.left;
            else

                current = current.right;
            if(current == null)
            {
                return null;
            }
        }
        return current;
    }
    public void inOrder(Node node)
    {
        if(node != null)
        {
            inOrder(node.left);
            node.displayData();
            inOrder(node.right);
        }
    }
    public void preOrder(Node node)
    {
        if(node != null){
            node.displayData();
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public void postOrder(Node node)
    {
        if(node != null)
        {
            postOrder(node.left);
            postOrder(node.right);
            node.displayData();
        }
    }
    public static void main(String[] args)
    {
        BinaryTree bst = new BinaryTree();
        bst.insert(29);
        bst.insert(12);
        bst.insert(19);
        bst.insert(22);
        bst.insert(15);
        System.out.println("Inorder traversal of binary tree");
        bst.inOrder(bst.root);
        System.out.println();
        System.out.println("Preorder traversal of binary tree");
        bst.preOrder(bst.root);
        System.out.println();
        System.out.println("Postorder traversal of binary tree");
        bst.postOrder(bst.root);
        System.out.println();
    }
}