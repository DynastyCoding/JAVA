package practice.oop.inheritance;

public class EBook extends Book{

    private int fileSize;

    public EBook(String title, String author,int pages, int fileSize){
        super(title, author,pages);
        this.fileSize = fileSize;
    }

    public int getFileSize(){
        return fileSize;
    }

    public void setFileSize(int fileSize){
        this.fileSize = fileSize;
    }

    @Override
    public void open(){
        super.open();
        System.out.printf("Loading %d MB file...%n",fileSize);
    }

    @Override
    public void read(){
        System.out.printf("Reading %s on screen.%n",title);
    }

    //inheritance close();

    public void download(){
        System.out.printf("Download %s %d MB.%n",title,fileSize);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("File size: (" + fileSize + "MB).");
    }

}
