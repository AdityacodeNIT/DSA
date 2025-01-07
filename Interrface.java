public class Interrface {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.moves();
    }
}

interface ChessPlayer {

    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("in all directions");
    }

    class Rook implements ChessPlayer {
        public void moves() {
            System.out.println("up,down,left,right");
        }
    }
}