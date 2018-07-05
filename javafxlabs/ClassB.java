/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxlabs;

import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

/**
 *
 * @author Sab
 */
public class ClassB {
     public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Mphamed");
        l.add("asdfg"
                + "asdfg");
        
         ObservableList ob = FXCollections.observableList(l);
         ob.addListener(new ListChangeListener() {
            @Override
            public void onChanged(ListChangeListener.Change c) {
                System.out.println("Change...............");
            }
        });
      //  ob.add("asdf");
        l.add("aqwerf");
    }
}
