public enum GoverningBoard {
    BCCI("path"),
    ACB("path"),
    ECB("path"),
    PCB("path"),
    AgCB("path"),
    WIB("path"),
    IRCB("path"),
    SLCB("path"),
    BCB("path"),
    SACB("path"),
    NZCB("path");

    private final String logoPath;

    GoverningBoard(String logoPath) {
        this.logoPath = logoPath;
    }

    public String getLogoPath() {
        return logoPath;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
