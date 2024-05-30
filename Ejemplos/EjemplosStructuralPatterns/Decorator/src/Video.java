public class Video extends LibraryItem {
    private String director;
    private String title;
    private int playTime;

    public Video(String director, String title, int numCopies, int playTime) {
        this.director = director;
        this.title = title;
        this.numCopies = numCopies;
        this.playTime = playTime;
    }

    @Override
    public void display() {
        System.out.println("\nVideo ----- ");
        System.out.println(" Director: " + director);
        System.out.println(" Title: " + title);
        System.out.println(" # Copies: " + numCopies);
        System.out.println(" Playtime: " + playTime + "\n");
    }
}
