package practice.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalog {

    private Map<String, String> books = new HashMap<>();

    public boolean addBook(String title, String author){
        if(books.containsKey(title)){
            return false;
        }else{
            books.put(title, author);
            return true;
        }
    }

    public String getAuthor(String title){
        if(books.containsKey(title)){
            return books.get(title);
        }else{
            return "Not found.";
        }
    }

    public boolean removeBook(String title){
        if(books.containsKey(title)){
            books.remove(title);
            return true;
        }else{
            return false;
        }
    }

    public int getTotalBooks(){

        return books.size();
    }

    public void printAllBooks(){
        if(books.isEmpty()){
            System.out.println("No books.");
        }else{
            for(String title: books.keySet()){
                System.out.println(title + " by " + books.get(title));
            }
        }
    }
}
