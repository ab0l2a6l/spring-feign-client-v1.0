package org.abolfazl.remote;

import org.abolfazl.entity.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("person-service")
public interface PersonRemote {
    @GetMapping("/save")
    String save(@RequestBody Person person);

    @GetMapping("/update")
    String update(@RequestBody Person person);

    @GetMapping("/remove")
    String remove(@RequestBody Person person);

    @GetMapping("/findAll")
    List<Person> findAll();

    @GetMapping("/findOne")
    String findOne(@RequestBody Person person);
}
