package practice.oop.interfaces;

public class CompMain {
    public static void main(String[] args) {
        Compressible[] tools = {new CompRAR(),
                new CompZip(),
                new CompGZ()
        };

        for(Compressible c : tools){
            c.compress();
            System.out.println("File type: " + c.getFileType());
            c.decompress();
        }

        Compressible.showCompressionTip();
    }
}
