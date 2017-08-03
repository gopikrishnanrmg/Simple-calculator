package com.example.root.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.root.calculator.R.id.cancel_action;
import static com.example.root.calculator.R.id.editText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int op,a,b,ch=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(this);
        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(this);
        Button b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(this);
        Button b4 = (Button) findViewById(R.id.button5);
        b4.setOnClickListener(this);
        Button b5 = (Button) findViewById(R.id.button6);
        b5.setOnClickListener(this);
        Button b6 = (Button) findViewById(R.id.button7);
        b6.setOnClickListener(this);
        Button b7 = (Button) findViewById(R.id.button9);
        b7.setOnClickListener(this);
        Button b8 = (Button) findViewById(R.id.button10);
        b8.setOnClickListener(this);
        Button b9 = (Button) findViewById(R.id.button11);
        b9.setOnClickListener(this);
        Button ba = (Button) findViewById(R.id.button4);
        ba.setOnClickListener(this);
        Button bs = (Button) findViewById(R.id.button8);
        bs.setOnClickListener(this);
        Button bp = (Button) findViewById(R.id.button12);
        bp.setOnClickListener(this);
        Button bd = (Button) findViewById(R.id.button16);
        bd.setOnClickListener(this);
        Button be = (Button) findViewById(R.id.button15);
        be.setOnClickListener(this);
        Button b0 = (Button) findViewById(R.id.button14);
        b0.setOnClickListener(this);
        Button clr = (Button) findViewById(R.id.button13);
        clr.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        EditText  editText = (EditText) findViewById(R.id.editText);
        TextView  textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        switch (v.getId()){
            case R.id.button:{
                editText.append("1");
                ch=0;
                break;
            }

            case R.id.button2:{
                editText.append("2");
                ch=0;
                break;
            }

            case R.id.button3:{
                editText.append("3");
                ch=0;
                break;
            }

            case R.id.button5:{
                editText.append("4");
                ch=0;
                break;
            }

            case R.id.button6:{
                editText.append("5");
                ch=0;
                break;
            }

            case R.id.button7:{
                editText.append("6");
                ch=0;
                break;
            }


            case R.id.button9:{
                editText.append("7");
                ch=0;
                break;
            }

            case R.id.button10:{
                editText.append("8");
                ch=0;
                break;
            }

            case R.id.button11:{
                editText.append("9");
                ch=0;
                break;
            }

            case R.id.button14:{
                editText.append("0");
                ch=0;
                break;
            }

            case R.id.button4:{
                op=1;
                a=Integer.parseInt(editText.getText().toString());
                editText.setText("");
                if(ch==0)
                textView.append(""+a);
                break;
            }

            case R.id.button8:{
                op=2;
                a=Integer.parseInt(editText.getText().toString());
                editText.setText("");
                if(ch==0)
                textView.append(""+a);
                break;
            }

            case R.id.button12:{
                op=3;
                a=Integer.parseInt(editText.getText().toString());
                editText.setText("");
                if(ch==0)
                textView.append(""+a);
                break;
            }

            case R.id.button16:{
                op=4;
                a=Integer.parseInt(editText.getText().toString());
                editText.setText("");
                if(ch==0)
                textView.append(""+a);
                break;
            }

            case R.id.button13:{
                editText.setText("");
                textView.setText("");
                a=0;
                b=0;
                op=0;
                ch=0;
                break;
            }

            case R.id.button15:{
                b=Integer.parseInt(editText.getText().toString());
                ch=1;
                switch(op)
                {
                    case 1:editText.setText(""+(a+b));
                        textView.append("+"+b+"="+editText.getText().toString());
                        break;
                    case 2:editText.setText(""+(a-b));
                        textView.append("-"+b+"="+editText.getText().toString());
                        break;
                    case 3:editText.setText(""+(a*b));
                        textView.append("*"+b+"="+editText.getText().toString());
                        break;
                    case 4:if(b==0)
                    {
                        Toast.makeText(getApplicationContext(),"Division by 0 not allowed",Toast.LENGTH_LONG).show();

                    }
                    else
                    {
                        editText.setText(""+(a/b));
                        textView.append("/"+b+"="+editText.getText().toString());
                    }

                }
                break;
            }




        }
    }
}
