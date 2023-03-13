
/* BackEnd del Proyecto Integrador Final Argentina Programa  desarrollado por Rivelino Padilla */

package tech.rivernet.BackEnd.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tech.rivernet.BackEnd.model.Header;
import tech.rivernet.BackEnd.service.InterfaceHeaderService;

@RestController
@RequestMapping("api/")
public class HeaderController {
    
    @Autowired
    private InterfaceHeaderService headerService;
    
//    @PostMapping("new/header")
//    public void agregarHeader(@RequestBody Header header){
//        headerService.createHeader(header);
//    }
    
    @GetMapping("/view/header")
    @ResponseBody
    public List<Header> viewHeader(){
        return headerService.viewHeader();
    }
   
//    @DeleteMapping("delete/header/{id}")
//    public void deleteHeader(@PathVariable int id){
//        headerService.deleteHeader(id);
//    }
    
    @PutMapping("/edit/header")
    public void editHeader(@RequestBody Header header){
        System.out.println(header);
        headerService.editHeader(header);
    }      
}
