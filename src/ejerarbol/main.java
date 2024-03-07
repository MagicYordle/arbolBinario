
package ejerarbol;

public class main {
    public static void main(String[] args) {
         EjerArbol tree = new EjerArbol(4);
        tree.push(5);
        tree.push(2);
        tree.push(8);
        tree.push(3);
        tree.push(7);
        tree.preorder();
        System.out.println("----------------------------");
        tree.postorder();
        System.out.println("----------------------------");
        tree.inorder(tree);
    
    }
    
}
