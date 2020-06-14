package es.iesnervion.nyeghiazaryan.retrofitandroid.interfaces;

import java.util.List;

import es.iesnervion.nyeghiazaryan.retrofitandroid.clases.Post;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PostInterface
{
    @GET("/Posts")
    Call <List<Post>> getPosts();

    @GET("/Posts/{userId}")
    Call<Post> getPost(@Path("userId") int id);
}
