package com.example.uday.abbrivate;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity2Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("names");
        String str1 = "";
        int i;
        for (i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            switch (c) {
                case 'a':
                case 'A':
                    str1 = str1 + "A=Adventureus\n";
                    break;
                case 'b':
                case 'B':
                    str1 = str1 + "B=Best\n";
                    break;
                case 'c':
                case 'C':
                    str1 = str1 + "C=Courage\n";
                    break;
                case 'd':
                case 'D':
                    str1 = str1 + "D=Dare\n";
                    break;
                case 'e':
                case 'E':
                    str1 = str1 + "E=Effector\n";
                    break;
                case 'f':
                case 'F':
                    str1 = str1 + "F=Friend\n";
                    break;
                case 'g':
                case 'G':
                    str1 = str1 + "G=Godess\n";
                    break;
                case 'h':
                case 'H':
                    str1 = str1 + "H=Happy\n";
                    break;
                case 'i':
                case 'I':
                    str1 = str1 + "I=Innovation\n";
                    break;
                case 'j':
                case 'J':
                    str1 = str1 + "J=Josh\n";
                    break;
                case 'k':
                case 'K':
                    str1 = str1 + "K=King\n";
                    break;
                case 'l':
                case 'L':
                    str1 = str1 + "L=Love\n";
                    break;
                case 'm':
                case 'M':
                    str1 = str1 + "M=Monster\n";
                    break;
                case 'n':
                case 'N':
                    str1 = str1 + "N=Natorious\n";
                    break;
                case 'o':
                case 'O':
                    str1 = str1 + "O=Obedient\n";
                    break;
                case 'p':
                case 'P':
                    str1 = str1 + "P=Prince\n";
                    break;
                case 'q':
                case 'Q':
                    str1 = str1 + "Q=Queen\n";
                    break;
                case 'R':
                case 'r':
                    str1 = str1 + "R=Reactive\n";
                    break;
                case 's':
                case 'S':
                    str1 = str1 + "S=Strange\n";
                    break;
                case 't':
                case 'T':
                    str1 = str1 + "T=Tattered\n";
                    break;
                case 'u':
                case 'U':
                    str1 = str1 + "U=Unique\n";
                    break;
                case 'v':
                case 'V':
                    str1 = str1 + "V=Victory\n";
                    break;
                case 'W':
                case 'w':
                    str1 = str1 + "W=Winner\n";
                    break;
                case 'x':
                case 'X':
                    str1 = str1 + "X=Xmas\n";
                    break;
                case 'y':
                case 'Y':
                    str1 = str1 + "Y=YO-YO\n";
                    break;
                case 'z':
                case 'Z':
                    str1 = str1 + "Z=Zombie\n";
                    break;
                default:
                    str1 = "Enter characters only";
                    break;
            }
        }
        TextView value = (TextView) findViewById(R.id.tv);
        value.setText(str1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
