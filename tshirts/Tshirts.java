import java.util.InputMismatchException;

public class Tshirts {
    static String size(int cms) {
        if(cms <= 24){
            throw new InputMismatchException("T-shirts of this size are not manufactured");
        }
        if(cms < 38) {
            return "S";
        } else if(cms <=42) {
            return "M";
        } else if(cms <= 46){
            return "L";
        }else{
            throw new InputMismatchException("T-shirts of this size are not manufactured");
        }
    }

    public static void main(String[] args) { 
        assert(size(37) == "S");
        assert(size(38) == "M");
        assert(size(40) == "M");
        assert(size(43) == "L");
        System.out.println("All is well (maybe!)");
    }
}
