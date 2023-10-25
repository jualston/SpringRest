package io.RestEx.demo.resources;

import io.RestEx.demo.models.Movie;
import io.RestEx.demo.service.MovieHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.*;

@RestController

public class RestControl {
    @Autowired
    MovieHandler mh;

    @GetMapping("/task")
    public HashSet<Movie> getAll(){
        return  mh.getAll();
    }
    @GetMapping("/task/{id}")
    public Movie getOne(@PathVariable String id){
        return  mh.getId(id);
    }
@PostMapping("/task")
    public void createMovie(@RequestBody Movie idInfo){
      mh.addIdinfo(idInfo);
      System.out.println("Task Created");
    }
    @PutMapping("/task/{id}")
    public void UpdateMovie(@RequestBody Movie idInfo, @PathVariable String id){
        mh.updateIdinfo(idInfo, id);
        System.out.println("Task updated");
    }
//    @PutMapping
//    public String updatedinfoDetails(@RequestBody IdInfo idInfo){
//        this.idInfo= idInfo;
//        return "updated success";
//    }
//    @RequestMapping("/{userId}")
//    public List<IdInfo> getId(@PathVariable("userId") String userId){
//        HashMap<String,IdInfo> li = new HashMap<>();
//
//        List<IdInfo> myList = new ArrayList<>();
//        IdInfo me = new IdInfo("DummyTask","test",true,new Date(),new Date());
//        IdInfo me1 = new IdInfo("DummyTask1","test1",true,new Date(),new Date());
//        myList.add(me);
//        myList.add(me1);
////return Collections.singletonList(
//  //      new IdInfo("DummyTask","test",true,new Date(),new Date())
////);
//        return myList;
//    }



}
