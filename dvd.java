public class dvd extends product{
    private double length;
    private String rating;
    private String studio;

    public dvd() {
        super();
        length = 0;
        rating = "";
        studio = "";
    }
    public dvd(String rating, String studio, double length) {
        super();
        this.length = length;
        this.rating = rating;
        this.studio = studio;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public String getStudio() {
        return studio;
    }
    public void setStudio(String studio) {
        this.studio = studio;
    }

    @Override // Membuat method yg sama dgn superclass
    public void print() {
        super.print();
        System.out.println("Length   : " +length);
        System.out.println("Rating   : " +rating);
        System.out.println("Studio   : " +studio);
}
}

