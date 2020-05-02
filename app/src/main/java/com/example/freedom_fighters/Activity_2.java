package com.example.freedom_fighters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity_2 extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        listView=(ListView)findViewById(R.id.list_View);
final ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("SARDAR VALLABHBHAI PATEL");/*1*/
        arrayList.add("JAWAHARLAL NEHRU");/*2*/
        arrayList.add("MAHATMA GANDHI");/*3*/
        arrayList.add("NANA SAHIB");/*4*/
        arrayList.add("LAL BAHADUR SHASTRI");/*5*/
        arrayList.add("SUBHASH CHANDRA BOSE");/*6*/
        arrayList.add("RANI LAKSHMI BAI");/*7*/
        arrayList.add("BAL GANGADHAR TILAK");/*8*/
        arrayList.add("LALA LAJPAT RAI");/*9*/
        arrayList.add("BHAGAT SINGH");/*10*/
        arrayList.add("DADABHAI NAOROJI");/*11*/
        arrayList.add("BIPIN CHANDRA PAL");/*12*/
        arrayList.add("CHANDRA SHEKHAR AZAD");/*13*/
        arrayList.add("RAJENDRA PRASAD");/*14*/
        arrayList.add("ASHFAQULLA KHAN");/*15*/
        arrayList.add("GOPAL KRISHNA GOKHALE");/*16*/
        arrayList.add("SUKHDEV THAPAR");/*17*/
        arrayList.add("MANGAL PANDEY");/*18*/
        arrayList.add("K.M.MUNSHI");/*19*/
        arrayList.add("CHITTARANJAN DAS");/*20*/
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Vallabhbhai_Patel"));
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Jawaharlal_Nehru"));
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Mahatma_Gandhi"));
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Nana_Saheb"));
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Lal_Bahadur_Shastri"));
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Subhas_Chandra_Bose"));
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Rani_of_Jhansi"));
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Bal_Gangadhar_Tilak"));
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Lala_Lajpat_Rai"));
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Bhagat_Singh"));
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Dadabhai_Naoroji"));
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Bipin_Chandra_Pal"));
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Chandra_Shekhar_Azad"));
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Rajendra_Prasad"));
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Ashfaqulla_Khan"));
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Gopal_Krishna_Gokhale"));
                    startActivity(intent);
                }
                if (position == 16) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Sukhdev_Thapar"));
                    startActivity(intent);
                }
                if (position == 17) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Mangal_Pandey"));
                    startActivity(intent);
                }
                if (position == 18) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Kanaiyalal_Maneklal_Munshi"));
                    startActivity(intent);
                }
                if (position == 19) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Chittaranjan_Das"));
                    startActivity(intent);
                }

            }

        });



    }
}
