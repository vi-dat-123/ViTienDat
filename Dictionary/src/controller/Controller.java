/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;

/**
 *
 * @author Microsoft Windows
 */
public interface Controller {
    
    <T> void writeToFile(List<T> list, String fileName);
    
    <T> List<T> readDataFromFile(String fileName);
    
    <T> List<T> sortByName(List<T> list);
}
