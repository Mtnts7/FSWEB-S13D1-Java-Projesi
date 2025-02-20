import java.lang.Math;
public class Main {
    public static void main(String[] args) {

        System.out.println(shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(area(5,4));
        System.out.println(area(-1,4));
        System.out.println(area(5));
        System.out.println(-1);

    }

    public static boolean shouldWakeUp(boolean havliyorMu, int saat) {
        if(saat<0 || saat>23){
            return false;
        }
        if(havliyorMu){
            if(saat>=8 && saat<=20){
                return false;
            }
            return true;
        }
        return false;
    }
    public static boolean hasTeen(int age1,int age2,int age3){
                if((age1>=13 && age1<=19)||(age2>=13 && age2<=19)||(age3>=13 && age3<=19)){
            return true;
        }
        return false;
    }
    public static boolean isCatPlaying(boolean isSummer,int temp){
        if(isSummer){
            if (temp<=25&&temp<=45) {
                return true;
            }

        }else{
            if (temp<=25 && temp<=35){
                return true;
            }
            }
        return false;
        }

    public static double area(double lentgh , double width ){
        if(lentgh<0 || width<0){
            return -1;
        }else {
            return width*lentgh;
        }

    }
    public static double area(double radius){
        if(radius<0){
            return -1;
        }else{
           return Math.pow(radius,2)*Math.PI;
        }
    }



}
