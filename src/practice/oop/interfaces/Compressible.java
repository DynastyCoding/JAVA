package practice.oop.interfaces;

public interface Compressible {

    void compress();

    void decompress();

    String getFileType();

    static void showCompressionTip(){
        System.out.println("Tip: Keep backup before compression.");
    }
}
