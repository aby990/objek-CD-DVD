public class cd extends product {
    private String artist ;
    private double song ;
    private String label ;

    public cd() {
        super(); //menagkses contructor SuperClass
        artist = "";
        song = 0;
        label = "";
    }
    public cd(int number, String name, int quantity, double price )
    {

        super(number,name,quantity, price);
        this.artist = artist;
        this.song = song;
        this.label = label;

    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public double getSong() {
        return song;
    }
    public void setSong(double song) {
        this.song = song;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    @Override
    public void print() {
        super.print();
     System.out.println("Artist : "+ artist);
     System.out.println("Total Song : "+ song);
     System.out.println("Label:" + label);
    }
}
