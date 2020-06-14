package es.iesnervion.nyeghiazaryan.retrofitandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;


import es.iesnervion.nyeghiazaryan.retrofitandroid.clases.Post;
import es.iesnervion.nyeghiazaryan.retrofitandroid.interfaces.PostInterface;
import okhttp3.Headers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity
{
    private TextView jsonText;
    private String SERVER_URL;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jsonText = findViewById(R.id.jsonText);

        SERVER_URL = "http://jsonplaceholder.typicode.com";

        obtenerPosts();

    }

    private void obtenerPosts()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(SERVER_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PostInterface postInter = retrofit.create(PostInterface.class);

        Call<List<Post>> call = postInter.getPosts();

        call.enqueue(new Callback<List<Post>>()
        {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> arg1)
            {
                List<Post> posts;
                String contentType;
                int code;
                String message;
                boolean isSuccesful;

                posts = arg1.body();

                Headers cabecera = arg1.headers();

                contentType = cabecera.get("Content-Type");
                code = arg1.code();
                message = arg1.message();
                isSuccesful = arg1.isSuccessful();

                for(int i = 0;i<posts.size();i++)
                {
                    String contenido = "";
                    contenido += "userID: "+posts.get(i).getUserId()+"\n";
                    contenido += "id: "+posts.get(i).getId()+"\n";
                    contenido += "title: "+posts.get(i).getTitle()+"\n";
                    contenido += "body: "+posts.get(i).getBody()+"\n\n";
                    jsonText.append(contenido);
                }
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t)
            {

            }
        });
    }
}
