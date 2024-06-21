public class shortestpath {

    public static float shortest(String str) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < str.length(); i++) {

            char dir = str.charAt(i);

            if (dir == 'N')
                y++;
            if (dir == 'W')

                x--;

            if (dir == 'E')
                x++;
            if (dir == 'W')
                y--;
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        String path = "NE";
        float n = shortest(path);
        System.out.println(n);
    }
}
