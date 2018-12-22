public class CheckerBoard{
    public static void main(String[] args){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                System.out.print((j+i) % 2 == 0 ? 1 : 0);
            }
            System.out.println();
        }
    }
}