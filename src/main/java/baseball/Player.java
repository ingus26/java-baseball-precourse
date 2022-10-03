package baseball;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Integer> baseBalls;

    public Player() {
        this.baseBalls = new ArrayList<>();
    }

    public Player(boolean isComputer) {
        this.baseBalls = new ArrayList<>();

        if (isComputer) {
            setRandomBaseBall();
        }
    }

    public void setRandomBaseBall() {
        baseBalls = new ArrayList<>();

        do {
            randomBaseBall();
        } while (baseBalls.size() < Config.MAX_NUMBER);
    }

    private void randomBaseBall() {
        int num = pickNumberInRange(Config.START_NUMBER, Config.END_NUMBER);

        if (!baseBalls.contains(num)) {
            baseBalls.add(num);
        }
    }

    public List<Integer> getBaseBalls() {
        return baseBalls;
    }

}
