public class User{
    private int left=0;
    private int right=0;
    private int authoritarian=0;
    private int liberal=0;
    String name;

    void changeParameters(int l, int r, int a, int lib){
        left = l;
        right = r;
        authoritarian = a;
        liberal = lib;
    }
    void showParameters(){
        System.out.println("left: "+left+" right: "+right+" authoritarian: "+authoritarian+" liberal: "+liberal);
    }

    User(String name){
        this.name = name;
    }
}
