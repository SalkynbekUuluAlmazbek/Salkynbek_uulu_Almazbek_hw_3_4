package com.geeks.salkynbek_uulu_almazbek_hw_3_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.geeks.salkynbek_uulu_almazbek_hw_3_4.adapter.CarAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Car> arrayListCars = new ArrayList<>();
    private RecyclerView recyclerView;
    private CarAdapter adapter = new CarAdapter(arrayListCars, this::onClick);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        arrayListCars.add(new Car(R.drawable.honda_e, "Honda e 2020 года", "Honda",
                "Изображенный на фотографиях автомобиль был выпущен в 2020 году. Автомобиль предназначен для рынка Великобритании и Ирландии.",
                "Gray", "36 000 $"));
        arrayListCars.add(new Car(R.drawable.honda_fit, "Honda Fit Sport 2020 года", "Honda",
                "Изображенный на фотографиях автомобиль был выпущен в 2020 году. Автомобиль предназначен для рынка Китая",
                "Blue", "26 990 $"));
        arrayListCars.add(new Car(R.drawable.subaru_wrx, "Subaru WRX STi Baby Drive Movie 2006 года", "Subaru",
                "Изображенный на фотографиях автомобиль был выпущен в 2006 году, в кузове GDB.",
                "Red", "34 800 $"));
        arrayListCars.add(new Car(R.drawable.subaru_sti, "Subaru WRX S4 STI Sport 2020 года", "Subaru",
                "Изображенный на фотографиях автомобиль был выпущен в 2020 году. Автомобиль предназначен для рынка Японии.",
                "White", "36 000 $"));
        arrayListCars.add(new Car(R.drawable.honda_e, "Honda e 2020 года", "Honda",
                "Изображенный на фотографиях автомобиль был выпущен в 2020 году. Автомобиль предназначен для рынка Великобритании и Ирландии.",
                "Gray", "36 000 $"));
        arrayListCars.add(new Car(R.drawable.honda_fit, "Honda Fit Sport 2020 года", "Honda",
                "Изображенный на фотографиях автомобиль был выпущен в 2020 году. Автомобиль предназначен для рынка Китая",
                "Blue", "26 990 $"));
        arrayListCars.add(new Car(R.drawable.subaru_wrx, "Subaru WRX STi Baby Drive Movie 2006 года", "Subaru",
                "Изображенный на фотографиях автомобиль был выпущен в 2006 году, в кузове GDB.",
                "Red", "34 800 $"));
        arrayListCars.add(new Car(R.drawable.subaru_sti, "Subaru WRX S4 STI Sport 2020 года", "Subaru",
                "Изображенный на фотографиях автомобиль был выпущен в 2020 году. Автомобиль предназначен для рынка Японии.",
                "White", "36 000 $"));

        adapter = new CarAdapter(arrayListCars, this::onClick);
        recyclerView.setAdapter(adapter);
    }
    private void onClick(Car car) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("image", car.getImage());
        intent.putExtra("title", car.getTitle());
        intent.putExtra("description", car.getDescription());
        intent.putExtra("color", car.getColor());
        intent.putExtra("sum", car.getSum());
        startActivity(intent);
    }
}
