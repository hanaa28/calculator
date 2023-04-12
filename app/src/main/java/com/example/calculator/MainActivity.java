package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    TextView re;
     boolean operator=true;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        re=findViewById(R.id.result);

        findViewById(R.id.but0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator==false)
                    re.setText("");
                operator=true;
                re.setText(re.getText().toString()+"0");

            }

        });
        findViewById(R.id.but1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator==false)
                    re.setText("");
                operator=true;
                re.setText(re.getText().toString()+"1");

            }

        });
        findViewById(R.id.but2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator==false)
                    re.setText("");
                operator=true;
                re.setText(re.getText().toString()+"2");

            }

        });
        findViewById(R.id.but3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator==false)
                    re.setText("");
                operator=true;
                re.setText(re.getText().toString()+"3");

            }

        });
        findViewById(R.id.but4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator==false)
                    re.setText("");
                operator=true;
                re.setText(re.getText().toString()+"4");

            }

        });
        findViewById(R.id.but5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator==false)
                    re.setText("");
                operator=true;
                re.setText(re.getText().toString()+"5");

            }

        });
        findViewById(R.id.but6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator==false)
                    re.setText("");
                operator=true;
                re.setText(re.getText().toString()+"6");

            }

        });
        findViewById(R.id.but7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator==false)
                    re.setText("");
                operator=true;
                re.setText(re.getText().toString()+"7");

            }

        });
        findViewById(R.id.but8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator==false)
                    re.setText("");
                operator=true;
                re.setText(re.getText().toString()+"8");

            }

        });
        findViewById(R.id.but9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator==false)
                    re.setText("");
                operator=true;
                re.setText(re.getText().toString()+"9");

            }

        });

        findViewById(R.id.butmul).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(re.getText().toString().endsWith("0")||re.getText().toString().endsWith("1")
                        ||re.getText().toString().endsWith("2")||re.getText().toString().endsWith("3")
                        ||re.getText().toString().endsWith("4")||re.getText().toString().endsWith("5")
                        ||re.getText().toString().endsWith("6")||re.getText().toString().endsWith("7")
                        ||re.getText().toString().endsWith("8")||re.getText().toString().endsWith("9")
                        ||re.getText().toString().endsWith(")")){
                    operator=true;

                re.setText(re.getText().toString()+" * ");
                }
            }

        });
        findViewById(R.id.butsum).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 if(re.getText().toString().endsWith("0")||re.getText().toString().endsWith("1")
                        ||re.getText().toString().endsWith("2")||re.getText().toString().endsWith("3")
                        ||re.getText().toString().endsWith("4")||re.getText().toString().endsWith("5")
                        ||re.getText().toString().endsWith("6")||re.getText().toString().endsWith("7")
                        ||re.getText().toString().endsWith("8")||re.getText().toString().endsWith("9")
                         ||re.getText().toString().endsWith(")")){
                     operator=true;
                     re.setText(re.getText().toString() + " + ");

                }
            }

        });
        findViewById(R.id.butsub).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(re.getText().toString().endsWith("0")||re.getText().toString().endsWith("1")
                        ||re.getText().toString().endsWith("2")||re.getText().toString().endsWith("3")
                        ||re.getText().toString().endsWith("4")||re.getText().toString().endsWith("5")
                        ||re.getText().toString().endsWith("6")||re.getText().toString().endsWith("7")
                        ||re.getText().toString().endsWith("8")||re.getText().toString().endsWith("9")
                        ||re.getText().toString().endsWith(")")){
                    operator=true;
                    re.setText(re.getText().toString() + " - ");

                }
            }

        });

        findViewById(R.id.butdiv).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v){
                if(re.getText().toString().endsWith("0")||re.getText().toString().endsWith("1")
                        ||re.getText().toString().endsWith("2")||re.getText().toString().endsWith("3")
                        ||re.getText().toString().endsWith("4")||re.getText().toString().endsWith("5")
                        ||re.getText().toString().endsWith("6")||re.getText().toString().endsWith("7")
                        ||re.getText().toString().endsWith("8")||re.getText().toString().endsWith("9")
                        ||re.getText().toString().endsWith(")")){
                    operator=true;
                    re.setText(re.getText().toString() + (" / "));
                    }
            }


        });
        findViewById(R.id.clear).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                re.setText("");
            }

        });
        findViewById(R.id.del).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                String s=re.getText().toString();
                if (s.endsWith(" * ") || s.endsWith(" / ") ||s.endsWith(" - ") || s.endsWith(" + ")){
                    s = s.substring(0, s.length() - 3);
                    re.setText(s);
                }
                else if (s.endsWith("( ") || s.endsWith(" )") ){
                    s = s.substring(0, s.length() - 2);
                    re.setText(s);
                }
                else if (operator==false)
                    re.setText("");

                else if (s.length()==0)
                    re.setText("");
                else {
                    s = s.substring(0, s.length() - 1);
                    re.setText(s);
                }
                operator=true;
            }

        });

        findViewById(R.id.dot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator=true;
                re.setText(re.getText().toString()+".");
            }
        });
        findViewById(R.id.butopen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(re.getText().toString().endsWith(" + ")||re.getText().equals("")
                        ||re.getText().toString().endsWith(" * ")||re.getText().toString().endsWith(" - ")
                        ||re.getText().toString().endsWith(" / ")){
                operator=true;
                re.setText(re.getText().toString()+"( ");
            }}

        });
        findViewById(R.id.butclose).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if(re.getText().toString().endsWith("0")||re.getText().toString().endsWith("1")
                        ||re.getText().toString().endsWith("2")||re.getText().toString().endsWith("3")
                        ||re.getText().toString().endsWith("4")||re.getText().toString().endsWith("5")
                        ||re.getText().toString().endsWith("6")||re.getText().toString().endsWith("7")
                        ||re.getText().toString().endsWith("8")||re.getText().toString().endsWith("9")){
                 operator=true;

               re.setText(re.getText().toString()+" )");
             }
            }

        });
        findViewById(R.id.buteql).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(operator) {
                    if (re.getText().length() == 0) {
                        re.setText("");
                    }
                    else   if(re.getText().toString().endsWith(" + ")||re.getText().toString().endsWith(" - ")
                            ||re.getText().toString().endsWith(" / ")||re.getText().toString().endsWith(" * ")
                            ||re.getText().toString().endsWith("( ")){
                        Toast.makeText(MainActivity.this,"Invalid format used",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        String s = re.getText().toString();
                        String nums[] = s.split(" ");
                        ArrayList<String> afop = new ArrayList<String>();
                        int t, i;
                        int j = 0;
                        double mul;
                        int y;

                        for (int p = 0; p < nums.length; p++) {
                            afop.add(nums[p]);
                        }
                        mull(afop);
                        sub(afop);
                        remove(afop);
                        for (int o = 0; o < afop.size(); o++) {
                            if (afop.get(o).equals("*")) {
                                mul = Double.parseDouble(afop.get(o - 1)) * Double.parseDouble(afop.get(o + 1));
                                afop.add(o - 1, String.valueOf(mul));
                                afop.remove(o);
                                afop.remove(o);
                                afop.remove(o);
                                o--;
                            }

                            if (afop.get(o).equals("/")) {
                                mul = Double.parseDouble(afop.get(o - 1)) / Double.parseDouble(afop.get(o + 1));
                                afop.add(o - 1, String.valueOf(mul));
                                afop.remove(o);
                                afop.remove(o);
                                afop.remove(o);
                                o--;
                            }
                        }
                        afop.toArray(nums);
                        double r = Double.parseDouble(nums[0]);
                        for (i = 1; i < afop.size(); i += 2) {
                            if (nums[i].equals("+"))
                                r += Double.parseDouble(nums[j += 2]);
                            else if (nums[i].equals("%"))
                                r %= Double.parseDouble(nums[j += 2]);
                            else if (nums[i].equals("-"))
                                r -= Double.parseDouble(nums[j += 2]);
                        }
                        re.setText("" + r);
                        operator = false;
                    }

                }
               }


        });

    }

    //for mul and dis
    public static ArrayList mull(ArrayList afop){
        double mul;
        for (int o=0;o<afop.size();o++){
            if ((afop.get(o).equals("("))){
                int op=o;
                while (!(afop.get(op).equals(")"))){

                    if(afop.get(op).equals("*")){

                        mul=Double.parseDouble ((String) afop.get(op-1))*Double.parseDouble((String)afop.get(op+1));
                        afop.add(op-1,String.valueOf(mul));
                        afop.remove(op);
                        afop.remove(op);
                        afop.remove(op);
                        op--;
                    }
                    if(afop.get(op).equals("/")){

                        mul=Double.parseDouble ((String)afop.get(op-1))/Double.parseDouble((String)afop.get(op+1));
                        afop.add(op-1,String.valueOf(mul));
                        afop.remove(op);
                        afop.remove(op);
                        afop.remove(op);
                        op--;
                    }
                    op++;
                }
            }}
        return afop;
    }
//for sum and sub
    public static ArrayList sub(ArrayList afop){

        double mul;
        for (int o=0;o<afop.size();o++){


            if ((afop.get(o).equals("("))){


                int op=o;
                while (!(afop.get(op).equals(")"))){

                    if(afop.get(op).equals("+")){

                        mul=Double.parseDouble ((String) afop.get(op-1))+Double.parseDouble((String)afop.get(op+1));
                        afop.add(op-1,String.valueOf(mul));
                        afop.remove(op);
                        afop.remove(op);
                        afop.remove(op);
                        op--;
                    }
                    if(afop.get(op).equals("-")){

                        mul=Double.parseDouble ((String)afop.get(op-1))-Double.parseDouble((String)afop.get(op+1));
                        afop.add(op-1,String.valueOf(mul));
                        afop.remove(op);
                        afop.remove(op);
                        afop.remove(op);
                        op--;
                    }
                    op++;
                }
            }}
        return afop;
    }
    //for remove "(" and ")"
    public static ArrayList remove(ArrayList afop){
        for (int o=0 ;o<afop.size();o++){
            if (afop.get(o).equals("(") || afop.get(o).equals(")")){
                afop.remove(o);
                o--;
            }
        }
        return afop;
    }
}

