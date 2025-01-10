public enum Rarity {
    COMMON(55),
    RARE(25),
    LEGENDARY(15),
    EXOTIC(5);

    private final double chance;

    Rarity(double chance) {
        this.chance = chance;
    }

    public double getChance() {
        return chance;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
