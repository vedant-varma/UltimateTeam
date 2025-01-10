public class Type {
    /**
     * The rarity associated with the type
     */
    private Rarity rarity;

    /**
     * Whether if the player is retired or not
     */
    private boolean isRetired;

    public Type(Rarity rarity, boolean isRetired) {
        this.rarity = rarity;
        this.isRetired = isRetired;
    }

    public Type() {

    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    @Override
    public String toString() {
        String s = "Rarity: " + rarity + "\n";
        s += "isRetired: " + isRetired + "\n";
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Type)) {
            return false;
        }
        Type t = (Type) obj;
        return t.rarity == rarity && t.isRetired == isRetired;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (rarity != null ? rarity.hashCode() : 0);
        result = 31 * result + (isRetired ? 1 : 0);
        return result;
    }
}
