package com.example.ebook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.ebook.Adapter.AdapterBook;
import com.example.ebook.Fragment.FovFragment;
import com.example.ebook.Fragment.HomeFragment;
import com.example.ebook.Fragment.StoreFragment;
import com.example.ebook.Model.Book;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {
     RecyclerView recyclerView,recyclerView1;
     AdapterBook adapterBook ,adapterBook1;
     ChipNavigationBar chipNavigationBar;
     FrameLayout container  ;
     Fragment fragment = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chipNavigationBar = findViewById(R.id.chip);
        container = findViewById(R.id.container);
        chipNavigationBar.setItemSelected(R.id.home,true);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new HomeFragment()).commit();
        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                switch (i)
                {
                    case  R.id.home:
                        fragment = new HomeFragment();
                        break;
                    case R.id.favo :
                        fragment = new FovFragment();
                        break;
                    case R.id.storebook:
                        fragment = new StoreFragment();
                        break;
                }
                if (fragment == null){
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
                }
            }
        });


}
    @Override
    protected void onStart() {
        super.onStart();
       // adapterBook.startListening();
      //  adapterBook1.startListening();

    }
    @Override
    protected void onStop() {
        super.onStop();
       // adapterBook.stopListening();
       // adapterBook1.stopListening();
    }
    public void ge(){
        // recyclerView = findViewById(R.id.rec);
        // recyclerView1 = findViewById(R.id.rece);
        //  recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        //  recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //  FirebaseRecyclerOptions<Book> options =
        //          new FirebaseRecyclerOptions.Builder<Book>()
        //                  .setQuery(FirebaseDatabase.getInstance().getReference().child("BookArabic"), Book.class)
        //                   .build();
        //   FirebaseRecyclerOptions<Book> options1 =
        //           new FirebaseRecyclerOptions.Builder<Book>()
        //                    .setQuery(FirebaseDatabase.getInstance().getReference().child("Book"), Book.class)
        //                    .build();
        //     adapterBook = new AdapterBook(options);
        //     adapterBook1 = new AdapterBook(options1);
        //   recyclerView.setAdapter(adapterBook);
        // recyclerView1.setAdapter(adapterBook1);
    }
}