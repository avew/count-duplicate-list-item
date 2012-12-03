import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author ave
 */
public class JumlahArrayDuplikat {
    public static void main (String[]args){
        int jumlah = Integer.parseInt(JOptionPane.showInputDialog("Masukan jumlah :"));
        //Scanner jumlah = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        List<String> list = new ArrayList<String>(); //begosia
        for (int i=0; i<jumlah; i++){
            System.out.println("Buah ke " + i +" : ");
            list.add(input.next().toLowerCase());              
    }
        Map<String,Integer> map = new HashMap<String,Integer>();
            for (String temp : list){
                Integer jumlahkan = map.get(temp);
                map.put(temp, (jumlahkan == null)? 1 : jumlahkan + 1);
            }
            printMap(map);
        } 
    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("Kata Kunci  " + entry.getKey() + " Jumlah : " + entry.getValue());
        }
    }
    
}
