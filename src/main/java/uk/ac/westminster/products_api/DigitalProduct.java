package uk.ac.westminster.products_api;

public class DigitalProduct extends Product {

    private String downloadURL;
    private double downloadSizeMB;

    public DigitalProduct() {}

        public DigitalProduct(Long id, String name, double price, String downloadURL, double downloadSizeMB) {
            super(id, name, price);
            this.downloadSizeMB = downloadSizeMB;
            this.downloadURL = downloadURL;
        }

    public String getDownloadURL() {
        return downloadURL;
    }

    public double getDownloadSizeMB() {
        return downloadSizeMB;
    }
}
