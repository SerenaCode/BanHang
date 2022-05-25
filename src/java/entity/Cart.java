/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 7bvod
 */
public class Cart {
    private List<Item> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public List<Item> getItems(){
        return items;
    }
    private Item getItemById(int id){
        for (Item i : items) {
            if(i.getSanPham().getMaSP() == id){
                return i;
            }
        }
        return null;
    }
    public int getQuantityById(int id){
        return getItemById(id).getSoLuong();
    }
    
    public void addItem(Item t){
        if(getItemById(t.getSanPham().getMaSP()) != null){
            Item m = getItemById(t.getSanPham().getMaSP());
            m.setSoLuong(m.getSoLuong() + t.getSoLuong());
        }else{
            items.add(t);
        }
    }
    
    public void removeItem(int id){
        if(getItemById(id) != null){
            items.remove(getItemById(id));
        }
    }
    
    public double getTotalMoney(){
        double t = 0;
        for (Item i : items) {
            t += (i.getSoLuong() * i.getDonGia() );
        }
        
        return t;
    }
    
    private Product getProductById(int id, List<Product> list){
        for (Product i : list) {
            if(i.getMaSP()==id){
                return i;
            }
        }
        return null;
    }
    
    public Cart(String txt, List<Product> list){
        items = new ArrayList<>();
        try{
        if(txt != null && txt.length() != 0){
            String[] s = txt.split(",");
            for (String i : s) {
                String[] n = i.split(":");  // n[0] : ma ; n[1] : quantity
                int maSP = Integer.parseInt(n[0]);
                int soLuong = Integer.parseInt(n[1]);
                Product p = getProductById(maSP, list);
                Item t = new Item(p, soLuong, p.getDonGia() );
                addItem(t);
            }
        }
        }catch(NumberFormatException e){
            
        }
    }
            
            
}
