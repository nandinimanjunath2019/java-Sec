class Test{
    void print(Test obj){
    System.out.println("method is called");
    }
    void call(){
        print(this);
    }
}

    

public class Test1 {
    public static void main(String[] args) {
        Test t =new Test();
        t.call();
    }
}
