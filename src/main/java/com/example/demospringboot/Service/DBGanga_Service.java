package com.example.demospringboot.Service;

import com.example.demospringboot.Repository.DBGanga_Repository;
import com.example.demospringboot.model.Ganga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBGanga_Service {
    @Autowired
    DBGanga_Repository dbGanga_repository;
    public String add_Ganga_list(Ganga ganga){
        dbGanga_repository.save(ganga);
        return "Ganga added successfully ";
    }

    public List<Ganga> get_ganga() {
        return dbGanga_repository.findAll();

    }
    public String Update_Ganga(Long id,String name){
        Ganga ganga=dbGanga_repository.getById(id);
        ganga.setName(name);
        dbGanga_repository.save(ganga);
        return "update successfully"+name;

    }
    public String delete_ganga(Long id){
        dbGanga_repository.deleteById(id);
        return "Update Delete successfully";
    }


}
