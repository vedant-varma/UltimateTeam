public enum PlayerType {
    BATSMAN,
    BOWLER,
    ALLROUNDER;

    PlayerType() {

    }

    @Override
    public String toString() {
        return name();
    }
}
