public class Rating {
    private int score;

    public Rating() {
        this.score = 0;
    }

    public Rating(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return Integer.toString(score);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Rating)) {
            return false;
        }
        return score == ((Rating)obj).score;
    }
}
