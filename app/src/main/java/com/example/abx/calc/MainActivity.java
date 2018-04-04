package com.example.abx.calc;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    EditText screen;
    String ans;
    StringExp ex;
//    String str;
    StringBuffer str1=new StringBuffer("");
    Button one,two,three,four,five,six,seven,eight,nine,zero,plus,minus,mul,div,dot,clr,dualZero,bin,back,calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen=findViewById(R.id.editText3);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        mul=findViewById(R.id.multiply);
        div=findViewById(R.id.divide);
        dot=findViewById(R.id.dot);
        clr=findViewById(R.id.clr);
        dualZero=findViewById(R.id.dualZero);
        bin=findViewById(R.id.bin);
        calculate=findViewById(R.id.calculate);
        back=findViewById(R.id.back);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.append("1");
                screen.setText(str1);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.append("2");
                screen.setText(str1);

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.append("3");
                screen.setText(str1);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.append("4");
                screen.setText(str1);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.append("5");
                screen.setText(str1);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.append("6");
                screen.setText(str1);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.append("7");
                screen.setText(str1);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.append("8");
                screen.setText(str1);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.append("9");
                screen.setText(str1);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.append("0");
                screen.setText(str1);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.append("+");
                screen.setText(str1);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.append("-");
                screen.setText(str1);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.append("*");
                screen.setText(str1);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.append("÷");
                screen.setText(str1);
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.append(".");
                screen.setText(str1);
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.delete(0,str1.length());
                screen.setText(str1);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str1.length()>0) {
                    str1.deleteCharAt(str1.length() - 1);
                    screen.setText(str1);
                }
                else{
                    Toast.makeText(getApplicationContext(),"End of Character",Toast.LENGTH_SHORT).show();
                }
            }
        });
        dualZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.append("00");
                screen.setText(str1);
            }
        });
        bin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1.delete(0,str1.length());//Remaining
                screen.setText(str1);
            }
        });

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ans = screen.getText().toString();
                    ex = new StringExp();
                    str1.delete(0, str1.length());
                    ans = ex.eval(ans) + "";
                    if (ans.charAt(ans.length() - 1) == '0') {
                        str1.append(ans);
                        str1.delete(str1.length() - 2, str1.length());
                        screen.setText(str1);

                    } else {
                        str1.append(ans);
                        screen.setText(str1);
                    }
                }
                catch(Exception e) {
                     screen.setText("Math Error");
                }

            }
        });
    }
}
