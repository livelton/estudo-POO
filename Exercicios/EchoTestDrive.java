public class EchoTestDrive {
    public static void main(String[] args){
        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int x = 0;

        while(x < 5){
            e1.hello();
            //--------
            if(){
                e2.count += 1;
            }
            if(){
                e2.count += e1.count;
            }
            x += 1;
        }
        System.out.println(e2.count);
    }
}
