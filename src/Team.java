public enum Team {
    DC("Delhi Capitals", "path"),
    RCB("Royal Challengers Bangalore", "path"),
    SRH("Sunrisers Hyderabad", "path"),
    CSK("Chennai Super Kings", "path"),
    MI("Mumbai Indians", "path"),
    GT("Gujarat Titans", "path"),
    KKR("Kolkata Knight Riders", "path"),
    LSG("Lucknow Super Giants", "path"),
    PK("Punjab Kings", "path"),
    RR("Rajasthan Royals", "path"),
    PS("Perth Scorchers", "path");

    private final String name;
    private final String path;

    Team(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return name;
    }
}
