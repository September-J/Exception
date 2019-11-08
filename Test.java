package Exception;

public class Test {
    public static void main(String[] args) {
        System.out.println(divide(10,0));
    }
    public static int divide(int x,int y)throws ArithmeticException{
        if(y == 0){
            throw new ArithmeticException("抛出0异常");
        }
        return x / y;
    }
}

