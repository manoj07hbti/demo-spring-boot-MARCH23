package com.example.demospringboot.Service;

import com.example.demospringboot.Repository.DBWomen_Repository;
import com.example.demospringboot.model.Women_Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBWomen_Service {
    @Autowired
    DBWomen_Repository dbWomenRepository;
    public String addWomen_Class(Women_Class women_class){
        dbWomenRepository.save(women_class);
        return "Women added successfully";
    }
    public List<Women_Class> women_get(){
        return dbWomenRepository.findAll();
    }
    public String update_women1(Long id,String name){
        Women_Class womenClass=dbWomenRepository.getById(id);
        womenClass.setName(name);
        dbWomenRepository.save(womenClass);
        return "update successfully "+name;

    }
    public String del_Women(Long id){
        dbWomenRepository.deleteById(id);
        return "delete successfully";
    }
}
