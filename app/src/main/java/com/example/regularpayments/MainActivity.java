package com.example.regularpayments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import static com.example.regularpayments.R.id.recycler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyList[] myList1 = new MyList[] {
                new MyList("Name", R.drawable.lic,"LIC Payment","Weekly starting from 03/04/2019","₹ 2000"),
                new MyList("Name", R.drawable.lic,"LIC Payment","Weekly starting from 03/04/2019","₹ 2000"),
                new MyList("Name", R.drawable.lic,"LIC Payment","Weekly starting from 03/04/2019","₹ 2000"),
                new MyList("Name", R.drawable.lic,"LIC Payment","Weekly starting from 03/04/2019","₹ 2000"),
                new MyList("Name", R.drawable.lic,"LIC Payment","Weekly starting from 03/04/2019","₹ 2000"),
                new MyList("Name", R.drawable.lic,"LIC Payment","Weekly starting from 03/04/2019","₹ 2000"),
                new MyList("Name", R.drawable.lic,"LIC Payment","Weekly starting from 03/04/2019","₹ 2000"),
                new MyList("Name", R.drawable.lic,"LIC Payment","Weekly starting from 03/04/2019","₹ 2000"),
                new MyList("Name", R.drawable.lic,"LIC Payment","Weekly starting from 03/04/2019","₹ 2000"),
                new MyList("Name", R.drawable.lic,"LIC Payment","Weekly starting from 03/04/2019","₹ 2000"),
                new MyList("Name", R.drawable.lic,"LIC Payment","Weekly starting from 03/04/2019","₹ 2000")


        };

        RecyclerView recycler = findViewById(R.id.recycler);
        RecyclerAdapter adapter = new RecyclerAdapter(myList1);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(adapter);


    }
}
