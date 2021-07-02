package KTVTKPM.Proxy;

public class ProxyImage implements ImageInterface {
	private ImageInterface realImage;
    private String url;
 
    public ProxyImage(String url) {
        this.url = url;
        System.out.println("Image unloaded: " + this.url);
    }
 
    @Override
    public void showImage() {
        if (realImage == null) {
            realImage = new LargeImage(this.url);
        } else {
            System.out.println("Image already existed: " + this.url);
        }
        realImage.showImage();
    }
}
