package factory;

/**
 * @author yuyz
 * @date 2018-10-31 9:56
 */
interface Game {
    boolean move();
}
interface GameFactory {
    Game getGame();
}

class Checkers implements Game {
    private Checkers() {}
    private int moves = 0;
    private static final int MOVES = 3;
    public boolean move() {
        System.out.println("Checkers move :" + moves);
        return ++  moves != MOVES;
    }
    public static GameFactory factory = new GameFactory() {
        public Game getGame() {
            return new Checkers();
        }
    };
}

class Chess implements Game {
    private Chess() {};
    private int move = 0;
    private static final int MOVES = 4;
    public boolean move() {
        System.out.println("Chess move :" + move);
        return ++move != MOVES;
    }
    public static GameFactory factory = new GameFactory() {

        @Override
        public Game getGame() {
            // TODO Auto-generated method stub
            return new Chess();
        }
    };
}
public class Games {
    public static void ship(GameFactory factory) {
        Game game = factory.getGame();
        while(game.move());
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Games.ship(Checkers.factory);
        Games.ship(Chess.factory);
    }

}

