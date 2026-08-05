package practice.oop.interfaces;

public class ExportPDF implements Exportable{

    public void export(String fileName){
        System.out.printf("Exporting %s.pdf as PDF...%n",fileName);
    }

    public String getFormat(){
        return "PDF";
    }
}
