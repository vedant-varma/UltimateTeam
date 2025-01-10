import java.util.ArrayList;

public class Player extends Person {
    private ArrayList<Team> teams;
    private Statistic statistic;
    private PlayerType classification;
    private boolean isWK;
    private Rating rating;

    public Player() {

    }

    public Player(String name, int age, Country nationality, Type type) {
        super(name, age, nationality, type);
        this.rating = new Rating();
        this.teams = new ArrayList<Team>();
    }

    public Player(String name, int age, Country nationality, Type type, Statistic statistic,
                  PlayerType classification, boolean isWK) {
        super(name, age, nationality, type);
        this.teams = new ArrayList<Team>();
        this.statistic = statistic;
        this.classification = classification;
        this.isWK = isWK;
        this.rating = new Rating();
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public Statistic getStatistic() {
        return statistic;
    }

    public void setStatistic(Statistic statistic) {
        this.statistic = statistic;
    }

    public PlayerType getClassification() {
        return classification;
    }

    public void setClassification(PlayerType classification) {
        this.classification = classification;
    }

    public boolean isWK() {
        return isWK;
    }

    public void setWK(boolean isWK) {
        this.isWK = isWK;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        if(this.rating == null) {
            this.rating = new Rating();
        }
        this.rating = rating;
    }

    public void setRating(int rating) {
        if(this.rating == null) {
            this.rating = new Rating();
        }
        this.rating.setScore(rating);
    }

    public void addTeam(Team team) {
        if(teams == null) {
            this.teams = new ArrayList<Team>();
        }
        if(!teams.contains(team)) {
            this.teams.add(team);
        }
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "Teams: " + teams + "\n";
        s += "Classification: " + classification + "\n";
        s += "Rating: " + rating + "\n";
        s += "Statistics: { " + statistic + " }\n";
        s += "Is Wicket Keeper: " + isWK + "\n";
        return s;
    }

    /**
     * Equals method, comparing two Player objects, if they have the same field values, return true
     * @param o Object (Player) to be compared to
     * @return true if same field values, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Player)) {
            return false;
        }
        return super.equals(o) &&
                this.teams.equals(((Player) o).teams) &&
                this.statistic.equals(((Player) o).statistic) &&
                this.classification.equals(((Player) o).classification) &&
                this.isWK == ((Player) o).isWK &&
                this.rating.equals(((Player) o).rating);
    }
}
