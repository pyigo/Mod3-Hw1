public class parrot {
    public static void main(String[] args) {
        boolean test1= getUp(true,5);
        System.out.println(test1);

    }

    private static boolean getUp(boolean squaking, int currentHour) {
        if ( squaking==true && currentHour<6 || currentHour>22) {
            return true;
        }
        if  (currentHour<0 && currentHour<23){
            return false;
        }
        return false;
    }

}
