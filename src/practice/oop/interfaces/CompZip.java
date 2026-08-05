package practice.oop.interfaces;

public class CompZip implements Compressible{

    public void compress(){
        System.out.println("Compressing ZIP file...");
    }

    public void decompress(){
        System.out.println("Decompressing ZIP file...");
    }

    public String getFileType(){
        return "ZIP";
    }

}
