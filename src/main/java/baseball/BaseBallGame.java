package baseball;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class BaseBallGame {

    private Player computer;
    private Player user;
    private static String gameStatus = "1";

    public BaseBallGame() {
        user = new Player();
        computer = new Player();
    }

    public void run() {
        do {
            start();
        } while (isRunning());
    }

    private void start() {
        computer = new Player(true);
        do {
            String baseballs = input();

            calc(baseballs);
        } while (Config.START_GAME.equals(gameStatus));
    }

    public boolean isRunning() {
        return !Config.STOP_GAME.equals(gameStatus);
    }

    private String input() {
        System.out.printf("%s: ", Message.INPUT.message);
        return readLine();
    }

    public void calc(String baseballs) {
        user.setBaseBalls(baseballs);

        Score score = new Score(computer.getBaseBalls(), user.getBaseBalls());

        is3Strike(score.getResult());
    }

    public void is3Strike(String result) {
        System.out.println(result);

        if (String.format("%d%s", Config.MAX_NUMBER, GameType.스트라이크.name()).equals(result)) {
            System.out.printf("%s %s%n", Message.GAME_WIN.message, Message.GAME_STOP.message);
        }
    }

}
