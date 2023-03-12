
/* BackEnd del Proyecto Integrador Final Argentina Programa  desarrollado por Rivelino Padilla */

package tech.rivernet.BackEnd.service;

import java.util.List;
import tech.rivernet.BackEnd.model.Header;

public interface InterfaceHeaderService {
    
    public List<Header> viewHeader();
    
    public void createHeader(Header header);
    
    public void deleteHeader(int id);
    
    public Header searchHeader(int id);
    
    public void editHeader(Header header); 
    
}
