public enum Country {
    IND("India", GoverningBoard.BCCI, "pathToFlag"),
    AUS("Australia", GoverningBoard.ACB, "pathToFlag"),
    ENG("England", GoverningBoard.ECB, "pathToFlag"),
    PAK("Pakistan", GoverningBoard.PCB, "pathToFlag"),
    AFG("Afghanistan", GoverningBoard.AgCB, "pathToFlag"),
    WIN("West Indies", GoverningBoard.WIB, "pathToFlag"),
    IRE("Ireland", GoverningBoard.IRCB, "pathToFlag"),
    SRL("Sri Lanka", GoverningBoard.SLCB, "pathToFlag"),
    BAN("Bangladesh", GoverningBoard.BCB, "pathToFlag"),
    SAF("South Africa", GoverningBoard.SACB, "pathToFlag"),
    NZL("New Zealand", GoverningBoard.NZCB, "pathToFlag");

    private final String name;
    private final GoverningBoard governingBoard;
    private final String pathToFlag;

    Country(String name, GoverningBoard governingBoard, String pathToFlag) {
        this.name = name;
        this.governingBoard = governingBoard;
        this.pathToFlag = pathToFlag;
    }

    public String getName() {
        return name;
    }

    public GoverningBoard getGoverningBoard() {
        return governingBoard;
    }

    public String getPathToFlag() {
        return pathToFlag;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", GoverningBoard: " + governingBoard;
    }
}
