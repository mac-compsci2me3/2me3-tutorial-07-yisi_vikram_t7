public class Picture extends ArticleComponent {
    private String imagePath;

    public Picture(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void display() {
        System.out.println("Picture: " + imagePath);
    }
}