package tree.file.system;

public class Tree {
    
    public String data;
    public Tree left;
    public Tree right;
    
    public Tree(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
