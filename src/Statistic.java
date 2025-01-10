public class Statistic {
    private double battingAverage;
    private double bowlingEconomy;
    private int totalRuns;
    private int totalWickets;
    private int yearsOfExperience;

    public Statistic() {

    }

    public Statistic(double battingAverage, int rating, int yearsOfExperience, int totalWickets, int totalRuns, double bowlingEconomy) {
        this.battingAverage = battingAverage;
        this.yearsOfExperience = yearsOfExperience;
        this.totalWickets = totalWickets;
        this.totalRuns = totalRuns;
        this.bowlingEconomy = bowlingEconomy;
    }

    public double getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
    }

    public double getBowlingEconomy() {
        return bowlingEconomy;
    }

    public void setBowlingEconomy(double bowlingEconomy) {
        this.bowlingEconomy = bowlingEconomy;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public int getTotalWickets() {
        return totalWickets;
    }

    public void setTotalWickets(int totalWickets) {
        this.totalWickets = totalWickets;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        String s = "Batting Average = " + battingAverage + "\n";
        s += "Years of Experience = " + yearsOfExperience + "\n";
        s += "Total Runs = " + totalRuns + "\n";
        s += "Total Wickets = " + totalWickets + "\n";
        s += "Bowling Economy = " + bowlingEconomy + "\n";
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Statistic)) {
            return false;
        }
        Statistic s = (Statistic) obj;
        return this.battingAverage == s.battingAverage &&
                this.bowlingEconomy == s.bowlingEconomy &&
                this.yearsOfExperience == s.yearsOfExperience &&
                this.totalRuns == s.totalRuns &&
                this.totalWickets == s.totalWickets;
    }
}
