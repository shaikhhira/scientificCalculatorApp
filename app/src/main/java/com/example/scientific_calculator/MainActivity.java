package com.example.scientific_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity   {
    EditText edtans;
    TextView tv_view;
    Button btn_equal,btn_dot,btn_pie,btn_onedivide,btn_square,btn_cuberot,btn_add,btn_subtract,btn_multiply
            ,btn_divide,btn_c,btn_factorial,btn_exp,btn_squareroot,btn_delete,btn_ln,btn_percentage,btn_power,
            btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn_zero;
   Float res1,res2;
    double a;
    boolean add,subtract,multiply,divide,msin,mcos,mtan,mart,mremainder,mpower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtans=(EditText)findViewById(R.id.edtans);;
        tv_view=(TextView)findViewById(R.id.tv_view);
        btn_equal=(Button)findViewById(R.id.btn_equal);
        btn_dot=(Button)findViewById(R.id.btn_dot);
        btn_pie=(Button)findViewById(R.id.btn_pie);
        btn_onedivide=(Button)findViewById(R.id.btn_onedivide);
        btn_square=(Button)findViewById(R.id.btn_square);
        btn_cuberot=(Button)findViewById(R.id.btn_cuberoot);
        btn_add=(Button)findViewById(R.id.btn_add);
        btn_subtract=(Button)findViewById(R.id.btn_subtract);
        btn_multiply=(Button)findViewById(R.id.btn_multiply);
        btn_divide=(Button)findViewById(R.id.btn_divide);
        btn_c=(Button)findViewById(R.id.btn_c);
        btn_factorial=(Button)findViewById(R.id.btn_factorial);
        btn_exp=(Button)findViewById(R.id.btn_exp);
        btn_squareroot=(Button)findViewById(R.id.btn_squareroot);
        btn_delete=(Button)findViewById(R.id.btn_delete);
        btn_ln=(Button)findViewById(R.id.btn_ln);
        btn_percentage=(Button)findViewById(R.id.btn_percentage);
        btn_power=(Button)findViewById(R.id.btn_power);
        btn_zero=(Button)findViewById(R.id.btn_zero);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
// animation for each button



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtans.setText(edtans.getText()+"1");
                AnimationDrawable ad1 = (AnimationDrawable) btn1.getBackground();
                ad1.setEnterFadeDuration(2000);
                ad1.setExitFadeDuration(4000);
                ad1.start();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtans.setText(edtans.getText()+"2");
                AnimationDrawable ad2 = (AnimationDrawable) btn2.getBackground();
                ad2.setEnterFadeDuration(2000);
                ad2.setExitFadeDuration(4000);
                ad2.start();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtans.setText(edtans.getText()+"3");
                AnimationDrawable ad3 = (AnimationDrawable) btn3.getBackground();
                ad3.setEnterFadeDuration(2000);
                ad3.setExitFadeDuration(4000);
                ad3.start();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtans.setText(edtans.getText()+"4");
                AnimationDrawable ad4 = (AnimationDrawable) btn4.getBackground();
                ad4.setEnterFadeDuration(2000);
                ad4.setExitFadeDuration(4000);
                ad4.start();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtans.setText(edtans.getText()+"5");
                AnimationDrawable ad5 = (AnimationDrawable) btn5.getBackground();
                ad5.setEnterFadeDuration(2000);
                ad5.setExitFadeDuration(4000);
                ad5.start();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtans.setText(edtans.getText()+"6");
                AnimationDrawable ad6 = (AnimationDrawable) btn6.getBackground();
                ad6.setEnterFadeDuration(2000);
                ad6.setExitFadeDuration(4000);
                ad6.start();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtans.setText(edtans.getText()+"7");
                AnimationDrawable ad7 = (AnimationDrawable) btn7.getBackground();
                ad7.setEnterFadeDuration(2000);
                ad7.setExitFadeDuration(4000);
                ad7.start();

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtans.setText(edtans.getText()+"8");
                AnimationDrawable ad8 = (AnimationDrawable) btn8.getBackground();
                ad8.setEnterFadeDuration(2000);
                ad8.setExitFadeDuration(4000);
                ad8.start();

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtans.setText(edtans.getText()+"9");

                AnimationDrawable ad9 = (AnimationDrawable) btn9.getBackground();
                ad9.setEnterFadeDuration(2000);
                ad9.setExitFadeDuration(4000);
                ad9.start();
            }
        });
        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtans.setText(edtans.getText()+"0");
                AnimationDrawable ad_zero = (AnimationDrawable) btn_zero.getBackground();
                ad_zero.setEnterFadeDuration(2000);
                ad_zero.setExitFadeDuration(4000);
                ad_zero.start();

            }
        });
        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtans.setText(edtans.getText()+".");
                AnimationDrawable ad_dot = (AnimationDrawable) btn_dot.getBackground();
                ad_dot.setEnterFadeDuration(2000);
                ad_dot.setExitFadeDuration(4000);
                ad_dot.start();
            }
        });
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationDrawable ad_add = (AnimationDrawable) btn_add.getBackground();
                ad_add.setEnterFadeDuration(2000);
                ad_add.setExitFadeDuration(4000);
                ad_add.start();
                if (edtans==null)
                {
                    edtans.setText("");
                }
                else
                {
                    res1=Float.parseFloat(edtans.getText()+"");
                    add=true;
                    edtans.setText(null);
                }
            }
        });
        btn_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationDrawable ad_subtract = (AnimationDrawable) btn_subtract.getBackground();
                ad_subtract.setEnterFadeDuration(2000);
                ad_subtract.setExitFadeDuration(4000);
                ad_subtract.start();
                if (edtans==null)
                {
                    edtans.setText("");
                }
                else
                {
                    res1=Float.parseFloat(edtans.getText()+"");
                    subtract=true;
                    edtans.setText(null);
                }
            }
        });
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationDrawable ad_multiply = (AnimationDrawable) btn_multiply.getBackground();
                ad_multiply.setEnterFadeDuration(2000);
                ad_multiply.setExitFadeDuration(4000);
                ad_multiply.start();
                if (edtans==null)
                {
                    edtans.setText("");
                }
                else
                {
                    res1=Float.parseFloat(edtans.getText()+"");
                    multiply=true;
                    edtans.setText(null);
                }
            }
        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationDrawable ad_divide = (AnimationDrawable) btn_divide.getBackground();
                ad_divide.setEnterFadeDuration(2000);
                ad_divide.setExitFadeDuration(4000);
                ad_divide.start();
                if (edtans==null)
                {
                    edtans.setText("");
                }

                else
                {
                    res1=Float.parseFloat(edtans.getText()+"");
                    divide=true;
                    edtans.setText(null);
                }
            }
        });
        btn_squareroot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try{
                    a = Math.sqrt(Double.parseDouble(edtans.getText().toString()));
                    edtans.setText("");
                    edtans.setText(edtans.getText().toString() + a);
                    AnimationDrawable ad_sqrareroot = (AnimationDrawable) btn_squareroot.getBackground();
                    ad_sqrareroot.setEnterFadeDuration(2000);
                    ad_sqrareroot.setExitFadeDuration(4000);
                    ad_sqrareroot.start();
                }
                catch (Exception e){

                }
            }
        });
        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    String str;
                    str = edtans.getText().toString();
                    str = str.substring(0, str.length() - 1);
                    edtans.setText(str);
                    AnimationDrawable ad_delete = (AnimationDrawable) btn_delete.getBackground();
                    ad_delete.setEnterFadeDuration(2000);
                    ad_delete.setExitFadeDuration(4000);
                    ad_delete.start();
                }
                catch (Exception e){

                }
            }
        });
        btn_ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.log(Double.parseDouble(edtans.getText().toString()));
                    edtans.setText("");
                    edtans.setText(edtans.getText().toString() + a);
                    AnimationDrawable ad_ln = (AnimationDrawable) btn_ln.getBackground();
                    ad_ln.setEnterFadeDuration(2000);
                    ad_ln.setExitFadeDuration(4000);
                    ad_ln.start();
                }
                catch(Exception e){

                }

            }
        });
        btn_pie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if(txtbtn.getText().toString()!=null) {
                //     a=Double.parseDouble(txtbtn.getText().toString()) +Math.PI;
                //     txtbtn.setText("" +a );
                //  }
                //    else {
                edtans.setText(Math.PI + "");
                //    }
            }
        });
        btn_onedivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = 1 / Double.parseDouble(edtans.getText().toString());
                    edtans.setText("");
                    edtans.setText(edtans.getText().toString() + a);
                    AnimationDrawable ad_onedivide = (AnimationDrawable) btn_onedivide.getBackground();
                    ad_onedivide.setEnterFadeDuration(2000);
                    ad_onedivide.setExitFadeDuration(4000);
                    ad_onedivide.start();
                }
                catch(Exception e){
                }
            }
        });
        btn_square.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try{
                    a = Math.pow(Double.parseDouble(edtans.getText().toString()), 2);
                    edtans.setText("");
                    edtans.setText(edtans.getText().toString() + a+"");
                    AnimationDrawable ad_square= (AnimationDrawable) btn_square.getBackground();
                    ad_square.setEnterFadeDuration(2000);
                    ad_square.setExitFadeDuration(4000);
                    ad_square.start();

                }
                catch (Exception e){

                }
            }
        });
        btn_cuberot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.cbrt(Double.parseDouble(edtans.getText().toString()));
                    edtans.setText("");
                    edtans.setText(edtans.getText().toString() + a);
                    AnimationDrawable ad_cuberot = (AnimationDrawable) btn_cuberot.getBackground();
                    ad_cuberot.setEnterFadeDuration(2000);
                    ad_cuberot.setExitFadeDuration(4000);
                    ad_cuberot.start();
                }
                catch(Exception e){

                }
            }
        });
        btn_exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.exp(Double.parseDouble(edtans.getText().toString()));
                    edtans.setText("");
                    edtans.setText(edtans.getText().toString() + a);
                    AnimationDrawable ad_exp = (AnimationDrawable) btn_exp.getBackground();
                    ad_exp.setEnterFadeDuration(2000);
                    ad_exp.setExitFadeDuration(4000);
                    ad_exp.start();
                }
                catch(Exception e){

                }
            }
        });
       btn_factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Double.parseDouble(edtans.getText().toString());
                    int er = 0; double i, s = 1;
                    if (a< 0) {
                        er = 20;
                    }
                    else {

                        for (i = 2; i <= a; i += 1.0)
                            s *= i;
                    }
                    edtans.setText("");
                   edtans.setText(edtans.getText().toString() + s);
                    AnimationDrawable ad_fact = (AnimationDrawable) btn_factorial.getBackground();
                    ad_fact.setEnterFadeDuration(2000);
                    ad_fact.setExitFadeDuration(4000);
                    ad_fact.start();
                }
                catch(Exception e){

                }
            }
        });
        btn_percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    res1 = Float.parseFloat(edtans.getText() + "");
                    edtans.setText (res1/100+"");
                    AnimationDrawable ad_percentage = (AnimationDrawable) btn_percentage.getBackground();
                    ad_percentage.setEnterFadeDuration(2000);
                    ad_percentage.setExitFadeDuration(4000);
                    ad_percentage.start();
                }
                catch (Exception e) {
                    // Handle the error/exception
                }

            }
        });
        btn_power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    res1 = Float.parseFloat(edtans.getText() + "");
                    mpower = true;
                    edtans.setText(null);
                    AnimationDrawable ad_power = (AnimationDrawable) btn_power.getBackground();
                    ad_power.setEnterFadeDuration(2000);
                    ad_power.setExitFadeDuration(4000);
                    ad_power.start();
                }
                catch (Exception e) {
                    // Handle the error/exception
                }
            }
        });
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res2 = Float.parseFloat(edtans.getText() + "");
                AnimationDrawable animationDrawable = (AnimationDrawable) btn_equal.getBackground();
                animationDrawable.setEnterFadeDuration(2000);
                animationDrawable.setExitFadeDuration(4000);
                animationDrawable.start();

                if (add == true)
                {
                    edtans.setText(res1 + res2 +"");
                    add=false;
                }


                if (subtract == true){
                    edtans.setText(res1 - res2 +"");
                    subtract=false;
                }

                if (multiply == true){
                    edtans.setText(res1 * res2 + "");
                    multiply=false;
                }

                if (divide == true){
                    edtans.setText(res1 / res2+"");
                    divide=false;
                }

                if (mremainder== true){
                    res2 = Float.parseFloat(edtans.getText() + "");
                    edtans.setText(res1 % res2 +"");
                    mremainder=false;
                }
                if (mpower== true){
                    res2 = Float.parseFloat(edtans.getText() + "");
                    int exp = (int) Math.pow(res1, res2);
                    edtans.setText(exp+"");
                    mpower=false;
                }
            }
        });
        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtans.setText(" ");
                AnimationDrawable ad_c = (AnimationDrawable) btn_c.getBackground();
                ad_c.setEnterFadeDuration(2000);
                ad_c.setExitFadeDuration(4000);
                ad_c.start();
            }
        });

    }
}
