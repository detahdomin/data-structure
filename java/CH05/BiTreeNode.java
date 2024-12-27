package CH05
public class BiTreeNode {
    public Object data;
    public BiTreeNode lchild,rchild;

    public BiTreeNode(){
        this(null,null,null)
    }
    public BiTreeNode(Object data){
        this(data,null,null)
    }
    public BiTreeNode(Object data,BiTreeNode lchild,BiTreeNode rchild){
        this.data=data;
        this.lchild=lchild;
        this.rchild=rchild;
    }
    public void preOrder(BiTreeNode root){
        System.out.println(root.data+" ");
        preOrder(root.lchild);
        preOrder(root.rchild);
    }
    public void inOder(BiTreeNode root){
        inOder(root.lchild);
        System.out.println(root.data+" ");
        inOder(root.rchild);
    }
    public void postOrder(BiTreeNode root){
        preOrder(root.lchild);
        preOrder(root.rchild);
        System.out.println(root.data+" ");
    }
    public void preOrder2() throws Exception{
        BiTreeNode p = root;
        if(p!=null){
            LinkStack s = new LinkStack();
            s.push(p);
            while (!s.isEmpty()) {
                p=(BiTreeNode)s.pop()
            }
        }
    }
}