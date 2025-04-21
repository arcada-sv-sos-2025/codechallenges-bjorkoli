package fi.arcada.codechallenge;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView helloText;
    private TextView listView;
    private TextView resultView;
    private Button calcButton;
    private ArrayList<Double> dataList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloText = findViewById(R.id.hello);
        listView = findViewById(R.id.listView);
        resultView = findViewById(R.id.resultView);
        calcButton = findViewById(R.id.calcButton);

        dataList = new ArrayList<>();
        dataList.add(5.5);
        dataList.add(4.0);
        dataList.add(7.0);
        dataList.add(1.5);
        dataList.add(6.5);

        showList();

        helloText.setText("Code Challenge 2");

        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });
    }

    private void showList() {
        StringBuilder sb = new StringBuilder();
        for (double d : dataList) {
            sb.append(d).append("\n");
        }
        listView.setText(sb.toString());
    }

    private void calculate() {
        double sum = 0.0;
        for (double d : dataList) {
            sum += d;
        }

        // resultat
        resultView.setText("Summan är: " + sum);
    }
}