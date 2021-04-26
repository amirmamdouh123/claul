package org.codeforiraq.fullcalcul;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button one ,two ,three,four,five,six,seven,eight,nine,plus,neg,times,div,C,prac,mod,equal,reverse,point;
    TextView result;
    String q,s,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       add();
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("9");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=result.getText().toString();
                result.setText("");
                q="+";
            }
        });
        neg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=result.getText().toString();
                result.setText("");
                q="-";
            }
        });
        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=result.getText().toString();
                result.setText("");
                q="*";
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=result.getText().toString();
                result.setText("");
                q="/";
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=result.getText().toString();
                result.setText("");
                q="%";
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q.equals("+"))
                    result.setText(s+s2);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              s2=result.getText().toString();
                int z= Integer.parseInt(s);
                int z1= Integer.parseInt(s2);
                if (q.equals("+"))
                    result.setText(String.valueOf(z+z1));
                else if(q.equals("-"))
                    result.setText(String.valueOf(z-z1));
                else if (q.equals("*"))
                    result.setText(String.valueOf(z*z1));
                else if (q.equals("/"))
                    result.setText(String.valueOf(z/z1));
                else if (q.equals("%"))
                    result.setText(String.valueOf(z%z1));
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             result.setText("");
            }
        });
        reverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if (result.getText().equals("-"))
                result.setText("");
               else if (!result.getText().equals("-"))
                    result.setText("-");
            }
        });

    }
    void add(){
        one =findViewById(R.id.one);
        two =findViewById(R.id.two);
        three =findViewById(R.id.three);
        four =findViewById(R.id.four);
        five =findViewById(R.id.five);
        six =findViewById(R.id.six);
        seven =findViewById(R.id.seven);
        eight =findViewById(R.id.eight);
        nine =findViewById(R.id.nine);
        plus =findViewById(R.id.plus);
        neg =findViewById(R.id.neg);
        times =findViewById(R.id.times);
        div =findViewById(R.id.div);
        prac =findViewById(R.id.prac);
        mod =findViewById(R.id.mod);
        C =findViewById(R.id.C);
        equal=findViewById(R.id.equal);
        result =findViewById(R.id.result);
        reverse =findViewById(R.id.reverse);
        point =findViewById(R.id.point);

    }
}