package abstractAndMethods;

/**
 * 4. Create 'Document' abstract class. Create subclasses like PDFDocument,
 * TextDocument, ImageDocument, etc. Create abstract methods and concrete
 * methods and demonstrate how they work.
 * 
 */
abstract class Document {
    protected String title;
    protected double size; // in MB

    Document(String title, double size) {
        this.title = title;
        this.size = size;
    }
      
    abstract String getType();
    abstract double getSize();

    public String getDetails() {
        return "Title: " + title + ", Size: " + size + " MB";
    }
    
    public static void main(String[] args) {
        Document pdf = new PDFDocument("Sample PDF", 1.5, 50);
        Document text = new TextDocument("Sample Text", 0.5, 2000);
        Document image = new ImageDocument("Sample Image", 2.0, "1024*1440");

        Document[] documents = { pdf, text, image };

        for (Document doc : documents) {
            System.out.println(doc.getDetails());
        }
    }


}

class PDFDocument extends Document {
    private int numPages;

    public PDFDocument(String title, double size, int numPages) {
        super(title, size);
        this.numPages = numPages;
    }

    @Override
    String getType() {
        return "PDF";
    }

    @Override
    double getSize() {
        return size;
    }

    public int getNumPages() {
        return numPages;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Type: " + getType() + ", Pages: " + numPages;
    }
}

class TextDocument extends Document {
    private int numWords;

    public TextDocument(String title, double size, int numWords) {
        super(title, size);
        this.numWords = numWords;
    }

    @Override
    String getType() {
        return "Text";
    }

    @Override
    double getSize() {
        return size;
    }

    public int getNumWords() {
        return numWords;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Type: " + getType() + ", Words: " + numWords;
    }
}

class ImageDocument extends Document {
    private String resolution;

    public ImageDocument(String title, double size, String resolution) {
        super(title, size);
        this.resolution = resolution;
    }

    @Override
    String getType() {
        return "Image";
    }

    @Override
    double getSize() {
        return size;
    }

    public String getResolution() {
        return resolution;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Type: " + getType() + ", Resolution: " + resolution;
    }
}

   