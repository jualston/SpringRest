package io.RestEx.demo.service;

import io.RestEx.demo.models.Movie;
import org.springframework.stereotype.Service;

import java.util.HashSet;


@Service
public class MovieHandler implements MovieServ{
    HashSet<Movie> movieList = new HashSet<>();
    @Override
    public HashSet<Movie> getAll() {
        return movieList;
    }

    @Override
    public Movie getId(String id) {
//        IdInfo info = null;
//        for(IdInfo i: movieList){
//            if (i.getTitle().equals(id)){
//                info = i;
//
//            }
//        }
        Movie idinfo= movieList.stream().filter(m-> m.getTitle().equals(id)).findAny().orElse(null);
        return idinfo;

//        return idinfo;
    }

    @Override
    public void addIdinfo(Movie i) {
movieList.add(i);
    }

    @Override
    public void updateIdinfo(Movie a, String id) {
        Movie idinfo= movieList.stream().filter(m-> m.getTitle().equals(id)).findAny().orElse(null);
        movieList.remove(idinfo);
        movieList.add(a);

//
//     for(Movie i: movieList){
//
//         System.out.println(i.getTitle());
//         if(id.equals(i.getTitle())){
//           movieList.remove(i);
//           movieList.add(a);
//           System.out.println("found match");
//         }
//
//     }
    }
}
