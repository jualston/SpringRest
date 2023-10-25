package io.RestEx.demo.service;
import java.util.HashSet;
import io.RestEx.demo.models.Movie;
public interface MovieServ {
    HashSet<Movie> getAll();
    Movie getId(String id);
    void addIdinfo(Movie i);
  void updateIdinfo(Movie a, String id);


}
