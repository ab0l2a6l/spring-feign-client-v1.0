package org.abolfazl.api;

import org.abolfazl.entity.Person;
import org.abolfazl.remote.PersonRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class API {
    @Autowired
    private PersonRemote personRemote;

    @GetMapping("/save")
    public ResponseEntity<Object> save(@ModelAttribute Person person){
        return ResponseEntity.ok(personRemote.save(person));
    }

    @GetMapping("/update")
    public ResponseEntity<Object> update(@ModelAttribute Person person){
        return ResponseEntity.ok(personRemote.update(person));
    }

    @GetMapping("/remove")
    public ResponseEntity<Object> remove(@ModelAttribute Person person){
        return ResponseEntity.ok(personRemote.remove(person));
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Person>> findAll(){
        return ResponseEntity.ok(personRemote.findAll());
    }

    @GetMapping("/findOne")
    public ResponseEntity<Object> findOne(@ModelAttribute Person person){
        return ResponseEntity.ok(personRemote.findOne(person));
    }
}
