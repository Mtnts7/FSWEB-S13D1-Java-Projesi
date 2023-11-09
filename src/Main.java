public class Main {
    public static void main(String[] args) {

        System.out.println(shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));

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




}
