public enum TeamsLayout {
    SIX_TWO_THREE(6, 2, 3),
    SIX_ONE_FOUR(6, 1, 4),
    FIVE_THREE_THREE(5, 3, 3);

    private final int batsmen;
    private final int allRounders;
    private final int bowlers;

    TeamsLayout(int batsmen, int allRounders, int bowlers) {
        this.batsmen = batsmen;
        this.allRounders = allRounders;
        this.bowlers = bowlers;
    }

}
