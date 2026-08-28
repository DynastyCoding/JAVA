package practice.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ContactBook {

    private Map<String, String> contacts = new HashMap<>();

    public void addContact(String name, String phone){
        contacts.put(name, phone);
    }

    public String getPhone(String name){
        if(contacts.containsKey(name)){
            return contacts.get(name);
        }else{
            return "Not found";
        }
    }

    public boolean removeContact(String name){
        if(contacts.containsKey(name)){
            contacts.remove(name);
            return true;
        }else{
            return false;
        }
    }

    public int getTotalContacts(){
        return contacts.size();
    }

    public void printAllContacts(){
        if(contacts.isEmpty()){
            System.out.println("No contacts.");
        }else{
            for(String name : contacts.keySet()){
                System.out.println(name + "->" + contacts.get(name));
            }
        }
    }
}