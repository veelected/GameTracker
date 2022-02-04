package aquino.vladimir.example.xenobladever3;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecretAreaPage extends AppCompatActivity {
    public static final String TAG = "SecretAreaPage";

    ListView secretareaLayout;
    List<String> arraySecretList = new ArrayList<String>();
    SecretAreaList secretAreaList = new SecretAreaList();
    ArrayAdapter adSA;


    private boolean boxcheck0;
    private boolean boxcheck1;
    private boolean boxcheck2;
    private boolean boxcheck3;
    private boolean boxcheck4;
    private boolean boxcheck5;
    private boolean boxcheck6;
    private boolean boxcheck7;
    private boolean boxcheck8;
    private boolean boxcheck9;
    private boolean boxcheck10;
    private boolean boxcheck11;
    private boolean boxcheck12;
    private boolean boxcheck13;
    private boolean boxcheck14;
    private boolean boxcheck15;
    private boolean boxcheck16;
    private boolean boxcheck17;
    private boolean boxcheck18;
    private boolean boxcheck19;
    private boolean boxcheck20;
    private boolean boxcheck21;
    private boolean boxcheck22;
    private boolean boxcheck23;
    private boolean boxcheck24;
    private boolean boxcheck25;
    private boolean boxcheck26;
    private boolean boxcheck27;
    private boolean boxcheck28;
    private boolean boxcheck29;
    private boolean boxcheck30;
    private boolean boxcheck31;
    private boolean boxcheck32;
    private boolean boxcheck33;
    private boolean boxcheck34;
    private boolean boxcheck35;
    private boolean boxcheck36;
    private boolean boxcheck37;
    private boolean boxcheck38;
    private boolean boxcheck39;
    private boolean boxcheck40;
    private boolean boxcheck41;
    private boolean boxcheck42;
    private boolean boxcheck43;
    private boolean boxcheck44;
    private boolean boxcheck45;
    private boolean boxcheck46;
    private boolean boxcheck47;
    private boolean boxcheck48;
    private boolean boxcheck49;
    private boolean boxcheck50;
    private boolean boxcheck51;
    private boolean boxcheck52;
    private boolean boxcheck53;
    private boolean boxcheck54;
    private boolean boxcheck55;
    private boolean boxcheck56;
    private boolean boxcheck57;
    private boolean boxcheck58;
    private boolean boxcheck59;
    private boolean boxcheck60;
    private boolean boxcheck61;
    private boolean boxcheck62;
    private boolean boxcheck63;
    private boolean boxcheck64;
    private boolean boxcheck65;
    private boolean boxcheck66;
    private boolean boxcheck67;
    private boolean boxcheck68;
    private boolean boxcheck69;
    private boolean boxcheck70;
    private boolean boxcheck71;
    private boolean boxcheck72;
    private boolean boxcheck73;
    private boolean boxcheck74;
    private boolean boxcheck75;
    private boolean boxcheck76;
    private boolean boxcheck77;
    private boolean boxcheck78;
    private boolean boxcheck79;
    private boolean boxcheck80;
    private boolean boxcheck81;
    private boolean boxcheck82;
    private boolean boxcheck83;
    private boolean boxcheck84;
    private boolean boxcheck85;
    private boolean boxcheck86;
    private boolean boxcheck87;
    private boolean boxcheck88;
    private boolean boxcheck89;
    private boolean boxcheck90;
    private boolean boxcheck91;
    private boolean boxcheck92;
    private boolean boxcheck93;
    private boolean boxcheck94;
    private boolean boxcheck95;
    private boolean boxcheck96;
    private boolean boxcheck97;
    private boolean boxcheck98;
    private boolean boxcheck99;
    private boolean boxcheck100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret_area_page);
        secretareaLayout = findViewById(R.id.secretareaLayout);

        //adapter set
        arraySecretList = new ArrayList<String>(Arrays.asList(secretAreaList.SecretListBig));


        adSA = new ArrayAdapter(this, android.R.layout.select_dialog_multichoice, arraySecretList);
        secretareaLayout.setAdapter(adSA);
        Collections.sort(arraySecretList);

        adSA.notifyDataSetChanged();

        secretareaLayout.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int ammount;
                ammount = arraySecretList.size();
                Toast.makeText(SecretAreaPage.this, "position" + position + "size" + ammount, Toast.LENGTH_SHORT).show();
                boxcheck0 = secretareaLayout.isItemChecked(0);
                boxcheck1 = secretareaLayout.isItemChecked(1);
                boxcheck2 = secretareaLayout.isItemChecked(2);
                boxcheck3 = secretareaLayout.isItemChecked(3);
                boxcheck4 = secretareaLayout.isItemChecked(4);
                boxcheck5 = secretareaLayout.isItemChecked(5);
                boxcheck6 = secretareaLayout.isItemChecked(6);
                boxcheck7 = secretareaLayout.isItemChecked(7);
                boxcheck8 = secretareaLayout.isItemChecked(8);
                boxcheck9 = secretareaLayout.isItemChecked(9);
                boxcheck10 = secretareaLayout.isItemChecked(10);
                boxcheck11 = secretareaLayout.isItemChecked(11);
                boxcheck12 = secretareaLayout.isItemChecked(12);
                boxcheck13 = secretareaLayout.isItemChecked(13);
                boxcheck14 = secretareaLayout.isItemChecked(14);
                boxcheck15 = secretareaLayout.isItemChecked(15);
                boxcheck16 = secretareaLayout.isItemChecked(16);
                boxcheck17 = secretareaLayout.isItemChecked(17);
                boxcheck18 = secretareaLayout.isItemChecked(18);
                boxcheck19 = secretareaLayout.isItemChecked(19);
                boxcheck20 = secretareaLayout.isItemChecked(20);
                boxcheck21 = secretareaLayout.isItemChecked(21);
                boxcheck22 = secretareaLayout.isItemChecked(22);
                boxcheck23 = secretareaLayout.isItemChecked(23);
                boxcheck24 = secretareaLayout.isItemChecked(24);
                boxcheck25 = secretareaLayout.isItemChecked(25);
                boxcheck26 = secretareaLayout.isItemChecked(26);
                boxcheck27 = secretareaLayout.isItemChecked(27);
                boxcheck28 = secretareaLayout.isItemChecked(28);
                boxcheck29 = secretareaLayout.isItemChecked(29);
                boxcheck30 = secretareaLayout.isItemChecked(30);
                boxcheck31 = secretareaLayout.isItemChecked(31);
                boxcheck32 = secretareaLayout.isItemChecked(32);
                boxcheck33 = secretareaLayout.isItemChecked(33);
                boxcheck34 = secretareaLayout.isItemChecked(34);
                boxcheck35 = secretareaLayout.isItemChecked(35);
                boxcheck36 = secretareaLayout.isItemChecked(36);
                boxcheck37 = secretareaLayout.isItemChecked(37);
                boxcheck38 = secretareaLayout.isItemChecked(38);
                boxcheck39 = secretareaLayout.isItemChecked(39);
                boxcheck40 = secretareaLayout.isItemChecked(40);
                boxcheck41 = secretareaLayout.isItemChecked(41);
                boxcheck42 = secretareaLayout.isItemChecked(42);
                boxcheck43 = secretareaLayout.isItemChecked(43);
                boxcheck44 = secretareaLayout.isItemChecked(44);
                boxcheck45 = secretareaLayout.isItemChecked(45);
                boxcheck46 = secretareaLayout.isItemChecked(46);
                boxcheck47 = secretareaLayout.isItemChecked(47);
                boxcheck48 = secretareaLayout.isItemChecked(48);
                boxcheck49 = secretareaLayout.isItemChecked(49);
                boxcheck50 = secretareaLayout.isItemChecked(50);
                boxcheck51 = secretareaLayout.isItemChecked(51);
                boxcheck52 = secretareaLayout.isItemChecked(52);
                boxcheck53 = secretareaLayout.isItemChecked(53);
                boxcheck54 = secretareaLayout.isItemChecked(54);
                boxcheck55 = secretareaLayout.isItemChecked(55);
                boxcheck56 = secretareaLayout.isItemChecked(56);
                boxcheck57 = secretareaLayout.isItemChecked(57);
                boxcheck58 = secretareaLayout.isItemChecked(58);
                boxcheck59 = secretareaLayout.isItemChecked(59);
                boxcheck60 = secretareaLayout.isItemChecked(60);
                boxcheck61 = secretareaLayout.isItemChecked(61);
                boxcheck62 = secretareaLayout.isItemChecked(62);
                boxcheck63 = secretareaLayout.isItemChecked(63);
                boxcheck64 = secretareaLayout.isItemChecked(64);
                boxcheck65 = secretareaLayout.isItemChecked(65);
                boxcheck66 = secretareaLayout.isItemChecked(66);
                boxcheck67 = secretareaLayout.isItemChecked(67);
                boxcheck68 = secretareaLayout.isItemChecked(68);
                boxcheck69 = secretareaLayout.isItemChecked(69);
                boxcheck70 = secretareaLayout.isItemChecked(70);
                boxcheck71 = secretareaLayout.isItemChecked(71);
                boxcheck72 = secretareaLayout.isItemChecked(72);
                boxcheck73 = secretareaLayout.isItemChecked(73);
                boxcheck74 = secretareaLayout.isItemChecked(74);
                boxcheck75 = secretareaLayout.isItemChecked(75);
                boxcheck76 = secretareaLayout.isItemChecked(76);
                boxcheck77 = secretareaLayout.isItemChecked(77);
                boxcheck78 = secretareaLayout.isItemChecked(78);
                boxcheck79 = secretareaLayout.isItemChecked(79);
                boxcheck80 = secretareaLayout.isItemChecked(80);
                boxcheck81 = secretareaLayout.isItemChecked(81);
                boxcheck82 = secretareaLayout.isItemChecked(82);
                boxcheck83 = secretareaLayout.isItemChecked(83);
                boxcheck84 = secretareaLayout.isItemChecked(84);
                boxcheck85 = secretareaLayout.isItemChecked(85);
                boxcheck86 = secretareaLayout.isItemChecked(86);
                boxcheck87 = secretareaLayout.isItemChecked(87);
                boxcheck88 = secretareaLayout.isItemChecked(88);
                boxcheck89 = secretareaLayout.isItemChecked(89);
                boxcheck90 = secretareaLayout.isItemChecked(90);
                boxcheck91 = secretareaLayout.isItemChecked(91);
                boxcheck92 = secretareaLayout.isItemChecked(92);
                boxcheck93 = secretareaLayout.isItemChecked(93);
                boxcheck94 = secretareaLayout.isItemChecked(94);
                boxcheck95 = secretareaLayout.isItemChecked(95);
                boxcheck96 = secretareaLayout.isItemChecked(96);
                boxcheck97 = secretareaLayout.isItemChecked(97);
                boxcheck98 = secretareaLayout.isItemChecked(98);
                boxcheck99 = secretareaLayout.isItemChecked(99);
                boxcheck100 = secretareaLayout.isItemChecked(100);

                save();
            }
        });
        load();
        update();
    }





    //save
    private void save() {

        SharedPreferences sharedPreferences = getSharedPreferences("MyData", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean("name0", boxcheck0);
        editor.putBoolean("name1", boxcheck1);
        editor.putBoolean("name2", boxcheck2);
        editor.putBoolean("name3", boxcheck3);
        editor.putBoolean("name4", boxcheck4);
        editor.putBoolean("name5", boxcheck5);
        editor.putBoolean("name6", boxcheck6);
        editor.putBoolean("name7", boxcheck7);
        editor.putBoolean("name8", boxcheck8);
        editor.putBoolean("name9", boxcheck9);
        editor.putBoolean("name10", boxcheck10);
        editor.putBoolean("name11", boxcheck11);
        editor.putBoolean("name12", boxcheck12);
        editor.putBoolean("name13", boxcheck13);
        editor.putBoolean("name14", boxcheck14);
        editor.putBoolean("name16", boxcheck16);
        editor.putBoolean("name17", boxcheck17);
        editor.putBoolean("name18", boxcheck18);
        editor.putBoolean("name19", boxcheck19);
        editor.putBoolean("name20", boxcheck20);
        editor.putBoolean("name21", boxcheck21);
        editor.putBoolean("name22", boxcheck22);
        editor.putBoolean("name23", boxcheck23);
        editor.putBoolean("name24", boxcheck24);
        editor.putBoolean("name25", boxcheck25);
        editor.putBoolean("name26", boxcheck26);
        editor.putBoolean("name27", boxcheck27);
        editor.putBoolean("name28", boxcheck28);
        editor.putBoolean("name29", boxcheck29);
        editor.putBoolean("name30", boxcheck30);
        editor.putBoolean("name31", boxcheck31);
        editor.putBoolean("name32", boxcheck32);
        editor.putBoolean("name33", boxcheck33);
        editor.putBoolean("name35", boxcheck35);
        editor.putBoolean("name36", boxcheck36);
        editor.putBoolean("name37", boxcheck37);
        editor.putBoolean("name38", boxcheck38);
        editor.putBoolean("name39", boxcheck39);
        editor.putBoolean("name40", boxcheck40);
        editor.putBoolean("name41", boxcheck41);
        editor.putBoolean("name42", boxcheck42);
        editor.putBoolean("name43", boxcheck43);
        editor.putBoolean("name44", boxcheck44);
        editor.putBoolean("name45", boxcheck45);
        editor.putBoolean("name46", boxcheck46);
        editor.putBoolean("name47", boxcheck47);
        editor.putBoolean("name48", boxcheck48);
        editor.putBoolean("name49", boxcheck49);
        editor.putBoolean("name51", boxcheck51);
        editor.putBoolean("name52", boxcheck52);
        editor.putBoolean("name53", boxcheck53);
        editor.putBoolean("name54", boxcheck54);
        editor.putBoolean("name55", boxcheck55);
        editor.putBoolean("name56", boxcheck56);
        editor.putBoolean("name57", boxcheck57);
        editor.putBoolean("name58", boxcheck58);
        editor.putBoolean("name59", boxcheck59);
        editor.putBoolean("name60", boxcheck60);
        editor.putBoolean("name61", boxcheck61);
        editor.putBoolean("name62", boxcheck62);
        editor.putBoolean("name63", boxcheck63);
        editor.putBoolean("name64", boxcheck64);
        editor.putBoolean("name65", boxcheck65);
        editor.putBoolean("name66", boxcheck66);
        editor.putBoolean("name67", boxcheck67);
        editor.putBoolean("name68", boxcheck68);
        editor.putBoolean("name69", boxcheck69);
        editor.putBoolean("name70", boxcheck70);
        editor.putBoolean("name71", boxcheck71);
        editor.putBoolean("name72", boxcheck72);
        editor.putBoolean("name73", boxcheck73);
        editor.putBoolean("name74", boxcheck74);
        editor.putBoolean("name75", boxcheck75);
        editor.putBoolean("name76", boxcheck76);
        editor.putBoolean("name77", boxcheck77);
        editor.putBoolean("name78", boxcheck78);
        editor.putBoolean("name79", boxcheck79);
        editor.putBoolean("name80", boxcheck80);
        editor.putBoolean("name81", boxcheck81);
        editor.putBoolean("name82", boxcheck82);
        editor.putBoolean("name83", boxcheck83);
        editor.putBoolean("name84", boxcheck84);
        editor.putBoolean("name85", boxcheck85);
        editor.putBoolean("name86", boxcheck86);
        editor.putBoolean("name87", boxcheck87);
        editor.putBoolean("name88", boxcheck88);
        editor.putBoolean("name89", boxcheck89);
        editor.putBoolean("name90", boxcheck90);
        editor.putBoolean("name91", boxcheck91);
        editor.putBoolean("name92", boxcheck92);
        editor.putBoolean("name93", boxcheck93);
        editor.putBoolean("name94", boxcheck94);
        editor.putBoolean("name95", boxcheck95);
        editor.putBoolean("name96", boxcheck96);
        editor.putBoolean("name97", boxcheck97);
        editor.putBoolean("name98", boxcheck98);
        editor.putBoolean("name99", boxcheck99);
        editor.putBoolean("name100", boxcheck100);

        editor.commit();

        Log.d(TAG, "save: SAVE");
    }

    //load
    private void load() {
        SharedPreferences sharedPreferences = getSharedPreferences("MyData", MODE_PRIVATE);

        boolean box0 = sharedPreferences.getBoolean("name0", false);
        boolean box1 = sharedPreferences.getBoolean("name1", false);
        boolean box2 = sharedPreferences.getBoolean("name2", false);
        boolean box3 = sharedPreferences.getBoolean("name3", false);
        boolean box4 = sharedPreferences.getBoolean("name4", false);
        boolean box5 = sharedPreferences.getBoolean("name5", false);
        boolean box6 = sharedPreferences.getBoolean("name6", false);
        boolean box7 = sharedPreferences.getBoolean("name7", false);
        boolean box8 = sharedPreferences.getBoolean("name8", false);
        boolean box9 = sharedPreferences.getBoolean("name9", false);
        boolean box10 = sharedPreferences.getBoolean("name10", false);
        boolean box11 = sharedPreferences.getBoolean("name11", false);
        boolean box12 = sharedPreferences.getBoolean("name12", false);
        boolean box13 = sharedPreferences.getBoolean("name13", false);
        boolean box14 = sharedPreferences.getBoolean("name14", false);
        boolean box15 = sharedPreferences.getBoolean("name15", false);
        boolean box16 = sharedPreferences.getBoolean("name16", false);
        boolean box17 = sharedPreferences.getBoolean("name17", false);
        boolean box18 = sharedPreferences.getBoolean("name18", false);
        boolean box19 = sharedPreferences.getBoolean("name19", false);
        boolean box20 = sharedPreferences.getBoolean("name20", false);
        boolean box21 = sharedPreferences.getBoolean("name21", false);
        boolean box22 = sharedPreferences.getBoolean("name22", false);
        boolean box23 = sharedPreferences.getBoolean("name23", false);
        boolean box24 = sharedPreferences.getBoolean("name24", false);
        boolean box25 = sharedPreferences.getBoolean("name25", false);
        boolean box26 = sharedPreferences.getBoolean("name26", false);
        boolean box27 = sharedPreferences.getBoolean("name27", false);
        boolean box28 = sharedPreferences.getBoolean("name28", false);
        boolean box29 = sharedPreferences.getBoolean("name29", false);
        boolean box30 = sharedPreferences.getBoolean("name30", false);
        boolean box31 = sharedPreferences.getBoolean("name31", false);
        boolean box32 = sharedPreferences.getBoolean("name32", false);
        boolean box33 = sharedPreferences.getBoolean("name33", false);
        boolean box34 = sharedPreferences.getBoolean("name34", false);
        boolean box35 = sharedPreferences.getBoolean("name35", false);
        boolean box36 = sharedPreferences.getBoolean("name36", false);
        boolean box37 = sharedPreferences.getBoolean("name37", false);
        boolean box38 = sharedPreferences.getBoolean("name38", false);
        boolean box39 = sharedPreferences.getBoolean("name39", false);
        boolean box40 = sharedPreferences.getBoolean("name40", false);
        boolean box41 = sharedPreferences.getBoolean("name41", false);
        boolean box42 = sharedPreferences.getBoolean("name42", false);
        boolean box43 = sharedPreferences.getBoolean("name43", false);
        boolean box44 = sharedPreferences.getBoolean("name44", false);
        boolean box45 = sharedPreferences.getBoolean("name45", false);
        boolean box46 = sharedPreferences.getBoolean("name46", false);
        boolean box47 = sharedPreferences.getBoolean("name47", false);
        boolean box48 = sharedPreferences.getBoolean("name48", false);
        boolean box49 = sharedPreferences.getBoolean("name49", false);
        boolean box50 = sharedPreferences.getBoolean("name50", false);
        boolean box51 = sharedPreferences.getBoolean("name51", false);
        boolean box52 = sharedPreferences.getBoolean("name52", false);
        boolean box53 = sharedPreferences.getBoolean("name53", false);
        boolean box54 = sharedPreferences.getBoolean("name54", false);
        boolean box55 = sharedPreferences.getBoolean("name55", false);
        boolean box56 = sharedPreferences.getBoolean("name56", false);
        boolean box57 = sharedPreferences.getBoolean("name57", false);
        boolean box58 = sharedPreferences.getBoolean("name58", false);
        boolean box59 = sharedPreferences.getBoolean("name59", false);
        boolean box60 = sharedPreferences.getBoolean("name60", false);
        boolean box61 = sharedPreferences.getBoolean("name61", false);
        boolean box62 = sharedPreferences.getBoolean("name62", false);
        boolean box63 = sharedPreferences.getBoolean("name63", false);
        boolean box64 = sharedPreferences.getBoolean("name64", false);
        boolean box65 = sharedPreferences.getBoolean("name65", false);
        boolean box66 = sharedPreferences.getBoolean("name66", false);
        boolean box67 = sharedPreferences.getBoolean("name67", false);
        boolean box68 = sharedPreferences.getBoolean("name68", false);
        boolean box69 = sharedPreferences.getBoolean("name69", false);
        boolean box70 = sharedPreferences.getBoolean("name70", false);
        boolean box71 = sharedPreferences.getBoolean("name71", false);
        boolean box72 = sharedPreferences.getBoolean("name72", false);
        boolean box73 = sharedPreferences.getBoolean("name73", false);
        boolean box74 = sharedPreferences.getBoolean("name74", false);
        boolean box75 = sharedPreferences.getBoolean("name75", false);
        boolean box76 = sharedPreferences.getBoolean("name76", false);
        boolean box77 = sharedPreferences.getBoolean("name77", false);
        boolean box78 = sharedPreferences.getBoolean("name78", false);
        boolean box79 = sharedPreferences.getBoolean("name79", false);
        boolean box80 = sharedPreferences.getBoolean("name80", false);
        boolean box81 = sharedPreferences.getBoolean("name81", false);
        boolean box82 = sharedPreferences.getBoolean("name82", false);
        boolean box83 = sharedPreferences.getBoolean("name83", false);
        boolean box84 = sharedPreferences.getBoolean("name84", false);
        boolean box85 = sharedPreferences.getBoolean("name85", false);
        boolean box86 = sharedPreferences.getBoolean("name86", false);
        boolean box87 = sharedPreferences.getBoolean("name87", false);
        boolean box88 = sharedPreferences.getBoolean("name88", false);
        boolean box89 = sharedPreferences.getBoolean("name89", false);
        boolean box90 = sharedPreferences.getBoolean("name90", false);
        boolean box91 = sharedPreferences.getBoolean("name91 ", false);
        boolean box92 = sharedPreferences.getBoolean("name92 ", false);
        boolean box93 = sharedPreferences.getBoolean("name93 ", false);
        boolean box94 = sharedPreferences.getBoolean("name94 ", false);
        boolean box95 = sharedPreferences.getBoolean("name95 ", false);
        boolean box96 = sharedPreferences.getBoolean("name96 ", false);
        boolean box97 = sharedPreferences.getBoolean("name97 ", false);
        boolean box98 = sharedPreferences.getBoolean("name98 ", false);
        boolean box99 = sharedPreferences.getBoolean("name99 ", false);
        boolean box100 = sharedPreferences.getBoolean("name100", false);

        boxcheck0 = box0;
        boxcheck1 = box1;
        boxcheck2 = box2;
        boxcheck3 = box3;
        boxcheck4 = box4;
        boxcheck5 = box5;
        boxcheck6 = box6;
        boxcheck7 = box7;
        boxcheck8 = box8;
        boxcheck9 = box9;
        boxcheck10 = box10;
        boxcheck11 = box11;
        boxcheck12 = box12;
        boxcheck13 = box13;
        boxcheck14 = box14;
        boxcheck15 = box15;
        boxcheck16 = box16;
        boxcheck17 = box17;
        boxcheck18 = box18;
        boxcheck19 = box19;
        boxcheck20 = box20;
        boxcheck21 = box21;
        boxcheck22 = box22;
        boxcheck23 = box23;
        boxcheck24 = box24;
        boxcheck25 = box25;
        boxcheck26 = box26;
        boxcheck27 = box27;
        boxcheck28 = box28;
        boxcheck29 = box29;
        boxcheck30 = box30;
        boxcheck31 = box31;
        boxcheck32 = box32;
        boxcheck33 = box33;
        boxcheck34 = box34;
        boxcheck35 = box35;
        boxcheck36 = box36;
        boxcheck37 = box37;
        boxcheck38 = box38;
        boxcheck39 = box39;
        boxcheck40 = box40;
        boxcheck41 = box41;
        boxcheck42 = box42;
        boxcheck43 = box43;
        boxcheck44 = box44;
        boxcheck45 = box45;
        boxcheck46 = box46;
        boxcheck47 = box47;
        boxcheck48 = box48;
        boxcheck49 = box49;
        boxcheck50 = box50;
        boxcheck51 = box51;
        boxcheck52 = box52;
        boxcheck53 = box53;
        boxcheck54 = box54;
        boxcheck55 = box55;
        boxcheck56 = box56;
        boxcheck57 = box57;
        boxcheck58 = box58;
        boxcheck59 = box59;
        boxcheck60 = box60;
        boxcheck61 = box61;
        boxcheck62 = box62;
        boxcheck63 = box63;
        boxcheck64 = box64;
        boxcheck65 = box65;
        boxcheck66 = box66;
        boxcheck67 = box67;
        boxcheck68 = box68;
        boxcheck69 = box69;
        boxcheck70 = box70;
        boxcheck71 = box71;
        boxcheck72 = box72;
        boxcheck73 = box73;
        boxcheck74 = box74;
        boxcheck75 = box75;
        boxcheck76 = box76;
        boxcheck77 = box77;
        boxcheck78 = box78;
        boxcheck79 = box79;
        boxcheck80 = box80;
        boxcheck81 = box81;
        boxcheck82 = box82;
        boxcheck83 = box83;
        boxcheck84 = box84;
        boxcheck85 = box85;
        boxcheck86 = box86;
        boxcheck87 = box87;
        boxcheck88 = box88;
        boxcheck89 = box89;
        boxcheck90 = box90;
        boxcheck91 = box91;
        boxcheck92 = box92;
        boxcheck93 = box93;
        boxcheck94 = box94;
        boxcheck95 = box95;
        boxcheck96 = box96;
        boxcheck97 = box97;
        boxcheck98 = box98;
        boxcheck99 = box99;
        boxcheck100 = box100;


        Log.d(TAG, "load: LOADED");
    }

    //update
    private void update() {
        Log.d(TAG, "update:UPDATED:");
        if (boxcheck0) secretareaLayout.setItemChecked(0, true);
        if (boxcheck1) secretareaLayout.setItemChecked(1, true);
        if (boxcheck2) secretareaLayout.setItemChecked(2, true);
        if (boxcheck3) secretareaLayout.setItemChecked(3, true);
        if (boxcheck4) secretareaLayout.setItemChecked(4, true);
        if (boxcheck5) secretareaLayout.setItemChecked(5, true);
        if (boxcheck6) secretareaLayout.setItemChecked(6, true);
        if (boxcheck7) secretareaLayout.setItemChecked(7, true);
        if (boxcheck8) secretareaLayout.setItemChecked(8, true);
        if (boxcheck9) secretareaLayout.setItemChecked(9, true);
        if (boxcheck10) secretareaLayout.setItemChecked(10, true);
        if (boxcheck11) secretareaLayout.setItemChecked(11, true);
        if (boxcheck12) secretareaLayout.setItemChecked(12, true);
        if (boxcheck13) secretareaLayout.setItemChecked(13, true);
        if (boxcheck14) secretareaLayout.setItemChecked(14, true);
        if (boxcheck15) secretareaLayout.setItemChecked(15, true);
        if (boxcheck16) secretareaLayout.setItemChecked(16, true);
        if (boxcheck17) secretareaLayout.setItemChecked(17, true);
        if (boxcheck18) secretareaLayout.setItemChecked(18, true);
        if (boxcheck19) secretareaLayout.setItemChecked(19, true);
        if (boxcheck20) secretareaLayout.setItemChecked(20, true);
        if (boxcheck21) secretareaLayout.setItemChecked(21, true);
        if (boxcheck22) secretareaLayout.setItemChecked(22, true);
        if (boxcheck23) secretareaLayout.setItemChecked(23, true);
        if (boxcheck24) secretareaLayout.setItemChecked(24, true);
        if (boxcheck25) secretareaLayout.setItemChecked(25, true);
        if (boxcheck26) secretareaLayout.setItemChecked(26, true);
        if (boxcheck27) secretareaLayout.setItemChecked(27, true);
        if (boxcheck28) secretareaLayout.setItemChecked(28, true);
        if (boxcheck29) secretareaLayout.setItemChecked(29, true);
        if (boxcheck30) secretareaLayout.setItemChecked(30, true);
        if (boxcheck31) secretareaLayout.setItemChecked(31, true);
        if (boxcheck32) secretareaLayout.setItemChecked(32, true);
        if (boxcheck33) secretareaLayout.setItemChecked(33, true);
        if (boxcheck34) secretareaLayout.setItemChecked(34, true);
        if (boxcheck35) secretareaLayout.setItemChecked(35, true);
        if (boxcheck36) secretareaLayout.setItemChecked(36, true);
        if (boxcheck37) secretareaLayout.setItemChecked(37, true);
        if (boxcheck38) secretareaLayout.setItemChecked(38, true);
        if (boxcheck39) secretareaLayout.setItemChecked(39, true);
        if (boxcheck40) secretareaLayout.setItemChecked(40, true);
        if (boxcheck41) secretareaLayout.setItemChecked(41, true);
        if (boxcheck42) secretareaLayout.setItemChecked(42, true);
        if (boxcheck43) secretareaLayout.setItemChecked(43, true);
        if (boxcheck44) secretareaLayout.setItemChecked(44, true);
        if (boxcheck45) secretareaLayout.setItemChecked(45, true);
        if (boxcheck46) secretareaLayout.setItemChecked(46, true);
        if (boxcheck47) secretareaLayout.setItemChecked(47, true);
        if (boxcheck48) secretareaLayout.setItemChecked(48, true);
        if (boxcheck49) secretareaLayout.setItemChecked(49, true);
        if (boxcheck50) secretareaLayout.setItemChecked(50, true);
        if (boxcheck51) secretareaLayout.setItemChecked(51, true);
        if (boxcheck52) secretareaLayout.setItemChecked(52, true);
        if (boxcheck53) secretareaLayout.setItemChecked(53, true);
        if (boxcheck54) secretareaLayout.setItemChecked(54, true);
        if (boxcheck55) secretareaLayout.setItemChecked(55, true);
        if (boxcheck56) secretareaLayout.setItemChecked(56, true);
        if (boxcheck57) secretareaLayout.setItemChecked(57, true);
        if (boxcheck58) secretareaLayout.setItemChecked(58, true);
        if (boxcheck59) secretareaLayout.setItemChecked(59, true);
        if (boxcheck60) secretareaLayout.setItemChecked(60, true);
        if (boxcheck61) secretareaLayout.setItemChecked(61, true);
        if (boxcheck62) secretareaLayout.setItemChecked(62, true);
        if (boxcheck63) secretareaLayout.setItemChecked(63, true);
        if (boxcheck64) secretareaLayout.setItemChecked(64, true);
        if (boxcheck65) secretareaLayout.setItemChecked(65, true);
        if (boxcheck66) secretareaLayout.setItemChecked(66, true);
        if (boxcheck67) secretareaLayout.setItemChecked(67, true);
        if (boxcheck68) secretareaLayout.setItemChecked(68, true);
        if (boxcheck69) secretareaLayout.setItemChecked(69, true);
        if (boxcheck70) secretareaLayout.setItemChecked(70, true);
        if (boxcheck71) secretareaLayout.setItemChecked(71, true);
        if (boxcheck72) secretareaLayout.setItemChecked(72, true);
        if (boxcheck73) secretareaLayout.setItemChecked(73, true);
        if (boxcheck74) secretareaLayout.setItemChecked(74, true);
        if (boxcheck75) secretareaLayout.setItemChecked(75, true);
        if (boxcheck76) secretareaLayout.setItemChecked(76, true);
        if (boxcheck77) secretareaLayout.setItemChecked(77, true);
        if (boxcheck78) secretareaLayout.setItemChecked(78, true);
        if (boxcheck79) secretareaLayout.setItemChecked(79, true);
        if (boxcheck80) secretareaLayout.setItemChecked(80, true);
        if (boxcheck81) secretareaLayout.setItemChecked(81, true);
        if (boxcheck82) secretareaLayout.setItemChecked(82, true);
        if (boxcheck83) secretareaLayout.setItemChecked(83, true);
        if (boxcheck84) secretareaLayout.setItemChecked(84, true);
        if (boxcheck85) secretareaLayout.setItemChecked(85, true);
        if (boxcheck86) secretareaLayout.setItemChecked(86, true);
        if (boxcheck87) secretareaLayout.setItemChecked(87, true);
        if (boxcheck88) secretareaLayout.setItemChecked(88, true);
        if (boxcheck89) secretareaLayout.setItemChecked(89, true);
        if (boxcheck90) secretareaLayout.setItemChecked(90, true);
        if (boxcheck91) secretareaLayout.setItemChecked(91, true);
        if (boxcheck92) secretareaLayout.setItemChecked(92, true);
        if (boxcheck93) secretareaLayout.setItemChecked(93, true);
        if (boxcheck94) secretareaLayout.setItemChecked(94, true);
        if (boxcheck95) secretareaLayout.setItemChecked(95, true);
        if (boxcheck96) secretareaLayout.setItemChecked(96, true);
        if (boxcheck97) secretareaLayout.setItemChecked(97, true);
        if (boxcheck98) secretareaLayout.setItemChecked(98, true);
        if (boxcheck99) secretareaLayout.setItemChecked(99, true);
        if (boxcheck100) secretareaLayout.setItemChecked(100, true);

        return;

    }






















}
