package org.koreait.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class ProductActivity extends AppCompatActivity {

    TextView result_text;
    Button result_button;
    GridView grid_view;

    // 상품명, 이미지, 가격, 수량
    String pdt_name[] = {"커피","햄버거","라면","샌드위치"};
    int pdt_image[] = {R.drawable.coffee, R.drawable.hamburger,
            R.drawable.ramyun, R.drawable.sandwich};
    int pdt_price[] = {1000, 3000, 4000, 3000};
    int pdr_count[] = {0,0,0,0};
    static int total_price = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        // 화면과 변수를 연결
        result_text = findViewById(R.id.result_text);
        result_button = findViewById(R.id.result_button);
        grid_view = findViewById(R.id.grid_view);

        // 버튼 클릭 기능 추가 (결제하기)
        result_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // PG사와 연결해서 결제진행하는 페이지로 이동
                Toast.makeText(getApplicationContext(),total_price+"원 결제 완료", Toast.LENGTH_LONG).show();
            }
        });
    }
}