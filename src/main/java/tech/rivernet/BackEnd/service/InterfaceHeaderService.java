/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tech.rivernet.BackEnd.service;

import java.util.List;
import tech.rivernet.BackEnd.model.Header;

/**
 *
 * @author river
 */

public interface InterfaceHeaderService {
    
    public List<Header> viewHeader();
    
    public void createHeader(Header header);
    
    public void deleteHeader(int id);
    
    public Header searchHeader(int id);
    
    public void editHeader(Header header); 
    
}
