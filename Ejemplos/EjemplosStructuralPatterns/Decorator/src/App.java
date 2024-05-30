public class App {
    public static void main(String[] args) throws Exception {
        // Create book
        Book book = new Book("Worley", "Inside ASP.NET", 10);
        book.display();

        // Create video
        Video video = new Video("Spielberg", "Jaws", 23, 92);
        video.display();

        // Make video borrowable, then borrow and display
        System.out.println("\nMaking video borrowable:");
        Borrowable borrowVideo = new Borrowable(video);
        borrowVideo.borrowItem("Customer #1");
        borrowVideo.borrowItem("Customer #2");
        borrowVideo.display();
    }
}
