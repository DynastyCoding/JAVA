package practice.oop.interfaces;

public class ExportExcel implements Exportable{

    public void export(String fileName){
        System.out.printf("Exporting %s.xlsx as Excel...%n",fileName);
    }

    public String getFormat(){
        return "Excel";
    }
}
