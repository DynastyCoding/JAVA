package practice.oop.interfaces;

public class CompRAR implements Compressible{

    public void compress(){
        System.out.println("Compressing RAR file...");
    }

    public void decompress(){
        System.out.println("Decompress RAR file...");
    }

    public String getFileType(){
        return "RAR";
    }

}
