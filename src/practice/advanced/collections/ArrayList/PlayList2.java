package practice.advanced.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class PlayList2 {

    private ArrayList<String> lists = new ArrayList<>();

    public boolean addSong(String song){
        if(song == null || song.isEmpty()){
            return false;
        }else{
            lists.add(song);
            return true;
        }
    }

    public boolean addSongAt(String song, int position){
        if(song == null || song.isEmpty() || position<1 || position>lists.size()+1){
            return false;
        }else{
            lists.add(position-1, song);
            return true;
        }
    }

    public boolean removeSong(String song){
       return lists.remove(song);
    }

    public String removeFirst(){
        if(lists.isEmpty()){
            return null;
        }else{
            String song = lists.get(0);
            return lists.remove(0);
        }
    }

    public String removeLast(){
        if(lists.isEmpty()){
            return null;
        }else{
            String song = lists.get(lists.size()-1);
            return lists.remove(lists.size()-1);
        }
    }

    public String getSong(int position){
        if(position<1 || position>lists.size()){
            return null;
        }else{
            return lists.get(position-1);
        }
    }

    public void moveUp(int position){
        if(position<=1 || position >lists.size()){
            System.out.println("Invalid position.");
        }else{
            String temp = lists.get(position-2);
            lists.set(position-2, lists.get(position-1));
            lists.set(position-1, temp);
            System.out.println("Move up successful.");
        }
    }

    public void moveDown(int position){
        if(position<1 || position>= lists.size()){
            System.out.println("Invalid position.");
        }else{
            String temp = lists.get(position);
            lists.set(position, lists.get(position-1));
            lists.set(position-1, temp);
            System.out.println("Move down successful.");
        }
    }

    public void shuffle(){
        if(lists.size()<=1){
            System.out.println("Invalid number of song.");
        }else{
            Collections.shuffle(lists);
        }
    }

    public void printAll(){
        if(lists.isEmpty()){
            System.out.println("No song in playlist.");
        }else{
            for (int i = 0; i < lists.size(); i++) {
                System.out.println((i+1) + ". " + lists.get(i));
            }
        }
    }

    public void printRange(int start, int end){
        if(start<1 || end>lists.size() || start>end){
            System.out.println("Invalid input.");
        }else{
            for (int i = start-1; i < end; i++) {
                System.out.println((i+1) + ". " + lists.get(i));
            }
        }
    }

    public int getTotal(){
        return lists.size();
    }

    public void clear(){
        lists.clear();
    }
}
