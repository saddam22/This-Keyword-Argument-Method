
package ThisKeywordArgumentMethod;

public class ThisKeywordArgumentMethod {
   
    void m(ThisKeywordArgumentMethod obj){
        System.out.println("Method is invoked!!");
    }
    void p(){
    m(this);
    }
    public static void main(String[] args) {
        
        ThisKeywordArgumentMethod s1 = new ThisKeywordArgumentMethod();
        s1.p();
    }
}
