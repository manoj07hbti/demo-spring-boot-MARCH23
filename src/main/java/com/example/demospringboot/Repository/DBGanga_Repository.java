package com.example.demospringboot.Repository;

import com.example.demospringboot.model.Ganga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DBGanga_Repository extends JpaRepository<Ganga,Long> {


}
