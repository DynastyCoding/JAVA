package practice.oop.interfaces;

public class CompGZ implements Compressible{

    public void compress(){
        System.out.println("Compressing GZ file...");
    }

    public void decompress(){
        System.out.println("Decompressing GZ file...");
    }

    public String getFileType(){
        return "GZ";
    }

}
