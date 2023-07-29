package com.example.demospringboot.Repository;

import com.example.demospringboot.model.Women_Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DBWomen_Repository extends JpaRepository<Women_Class,Long> {

    public Women_Class findByAge(int age);
    public Women_Class findByCity(String City);


}
