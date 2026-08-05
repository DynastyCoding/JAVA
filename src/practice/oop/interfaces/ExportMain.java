package practice.oop.interfaces;

public class ExportMain {
    public static void main(String[] args) {
        Exportable[] exports = {new ExportPDF(),
                                new ExportExcel()
        };

        for(Exportable e: exports){
            e.export("report");
            System.out.println("Format: " + e.getFormat());
        }

        Exportable.showExportTip();

    }
}
