/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tech.rivernet.BackEnd.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.rivernet.BackEnd.model.Header;
import tech.rivernet.BackEnd.repository.HeaderRepository;

/**
 *
 * @author river
 */

@Service
public class HeaderService implements InterfaceHeaderService{

    @Autowired
    public HeaderRepository headerRepo;
       
    @Override
    public List<Header> viewHeader() {
        return headerRepo.findAll();
    }

    @Override
    public void createHeader(Header header) {
        headerRepo.save(header);
    }

    @Override
    public void deleteHeader(int id) {
        headerRepo.deleteById(id);
    }

    @Override
    public Header searchHeader(int id) {
        
        return headerRepo.findById(id).orElse(null);
    }

    @Override
    public void editHeader(Header header) {
        headerRepo.save(header);
    }
}