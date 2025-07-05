interface GamePlayer {
    String play();
}

class FirstPlayer implements GamePlayer {
    public String play() {
        return "Win";
    }
}

class SecondPlayer implements GamePlayer {
    public String play() {
        return "Lose";
    }
}

public class Main {
    public static void main(String[] args) {
        GamePlayer[] players = { new FirstPlayer(), new SecondPlayer(), new FirstPlayer() };
        for (GamePlayer player : players) {
            System.out.println(player.play());
        }
    }
}
