/*
 * Mariana Marquez Torres
 */

package ejerarbol;

public class EjerArbol {
    int valor;

    EjerArbol left;
    EjerArbol right;

     public EjerArbol(int valor) {
        this.valor = valor;
    }
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public EjerArbol getLeft() {
        return left;
    }

   
    public EjerArbol getRight() {
        return right;
    }
    
   public void push (int _value){
        EjerArbol newBranch = new EjerArbol(_value);
        if (left == null){
            left = newBranch;
            
        }else if (right == null){
            right = newBranch;
        }else if (left.getLeft() == null||left.getRight() == null ){
            left.push(_value);
        }else{
            right.push(_value);
        }
    }
    public void preorder(){
        if(left != null){
            System.out.println(left.getValor()+ ",");
            left.preorder();
        }
        if (right != null) {
            System.out.println(right.getValor()+ ",");
            right.preorder();
        }
    }
    public void postorder(){
        if (right != null) {
            System.out.println(right.getValor()+ ",");
            right.postorder();
        }
        if(left != null){
            System.out.println(left.getValor()+ ",");
            left.postorder();
        }
    }
    public void inorder(EjerArbol node){
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.println(node.getValor());
        inorder(node.right);
    }
    
}