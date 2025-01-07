public class clearithibit {

    public static int ith(int num, int i) {
        int b = (1 << i);
        int c = num & (~b);

        return c;

    }
    public static int rangeof(int num, int i, int j){
        


    }

    public static void main(String[] args) {
        int num = 15;
        int i = 0;
        int k=2;
        int j = ith(num, i);

        int l= rangeof(num, i, j)
        System.out.println(j);

    }
}
