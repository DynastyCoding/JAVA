package practice.oop.interfaces;

public interface Exportable {

    void export(String fileName);

    String getFormat();

    static void showExportTip(){
        System.out.println("Tip: Choose format based on your needs.");
    }
}
