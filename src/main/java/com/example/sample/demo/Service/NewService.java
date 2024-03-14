package com.example.sample.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.demo.DateTimeForm;
import com.example.sample.demo.Entity.NewEntity;
import com.example.sample.demo.Repository.NewRepository;
@Service
public class NewService {
    @Autowired
   private NewRepository newRepository;
    public void saveDateTime(DateTimeForm dateTimeForm)
    {
         NewEntity newentity=new NewEntity();
    newentity.setDate(dateTimeForm.getDate()) ;
    newentity.setTime(dateTimeForm.getTime()) ;
    newentity.setTimestamp(dateTimeForm.getTimestamp()) ;
    newRepository.save(newentity);

    }
}
