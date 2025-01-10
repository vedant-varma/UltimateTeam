//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.setClassification(PlayerType.BATSMAN);
        p1.setName("Virat Kohli");
        p1.setAge(34);
        p1.setNationality(Country.IND);
        p1.setType(new Type(Rarity.EXOTIC, false));
        p1.addTeam(Team.RCB);
        p1.setWK(false);

        Statistic vkStatistic = new Statistic();
        vkStatistic.setBattingAverage(50.8);
        vkStatistic.setBowlingEconomy(19.0);
        vkStatistic.setTotalRuns(11000);
        vkStatistic.setTotalWickets(25);
        vkStatistic.setYearsOfExperience(15);

        p1.setStatistic(vkStatistic);
        p1.setRating(99);

        Player p2 = new Player();
        p2.setClassification(PlayerType.BATSMAN);
        p2.setName("Virat Kohli");
        p2.setAge(34);
        p2.setNationality(Country.IND);
        p2.setType(new Type(Rarity.EXOTIC, false));
        p2.addTeam(Team.RCB);
        p2.setWK(false);

        Statistic stat2 = new Statistic();
        stat2.setBattingAverage(50.8);
        stat2.setBowlingEconomy(19.0);
        stat2.setTotalRuns(11000);
        stat2.setTotalWickets(25);
        stat2.setYearsOfExperience(15);

        p2.setStatistic(stat2);
        p2.setRating(99);

        System.out.println("Are P1 and P2 the same? " + p1.equals(p2));

        Pool pool = new Pool();
        pool.add(p1);
        pool.add(p2);


        System.out.println(pool);
    }
}