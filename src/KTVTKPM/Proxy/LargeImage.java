package KTVTKPM.Proxy;

public class LargeImage implements ImageInterface {
    private String url;

    public LargeImage(String url) {
        this.url = url;
        System.out.println("Image loaded: " + this.url);
    }

    @Override
    public void showImage() {
        System.out.println("Image showed: " + this.url);
    }
}
