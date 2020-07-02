package com.example.zypherproject;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    ConstraintLayout settinglayout;
    int counter=0;
    int hamcounter=0;

    TextView textView;
    String nfont;
    float nthicknessValue;
    ImageView alignLeft;
    ImageView alignCentre;
    ImageView alignRight;
    ImageView alignJustified;
    TabHost tablayout;
    public void left(View view){
        textView.setGravity(Gravity.LEFT);
    }
    public void centre(View view){
        textView.setGravity(Gravity.CENTER);
    }
    public void right(View view){
        textView.setGravity(Gravity.RIGHT);
    }
    public void justified(View view){
        textView.setGravity(Layout.JUSTIFICATION_MODE_INTER_WORD);
    }

    public void line1(View view){ textView.setLineSpacing(1,1); }
    public void line2(View view){textView.setLineSpacing(1,3); }
    public void line3(View view) {textView.setLineSpacing(1,2); }

    public void margin1(View view){
        textView.setPadding(5, 5, 5, 5);
        textView.setLayoutParams(new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.MATCH_PARENT));
    }
    public void margin2(View view){
        textView.setPadding(50, 20, 50, 20);
        textView.setLayoutParams(new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.MATCH_PARENT));
    }
    public void margin3(View view){
        textView.setPadding(100, 20, 100, 20);
        textView.setLayoutParams(new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.MATCH_PARENT));
    }

    public void blackBG(View view){
        textView.setBackgroundColor(Color.parseColor("#000000"));
        textView.setTextColor(Color.parseColor("#FDFAFA"));
    }
    public void whiteBG(View view){
        textView.setBackgroundColor(Color.parseColor("#FDFAFA"));
        textView.setTextColor(Color.parseColor("#000000"));
    }
    public void semiwhiteBG(View view){
        textView.setBackgroundColor(Color.parseColor("#FFE6D9"));
        textView.setTextColor(Color.parseColor("#C21D08"));
    }
    public void hamIcon(View view){
        if (hamcounter==0){
        tablayout.setVisibility(View.VISIBLE);
        textView.setVisibility(View.INVISIBLE);
        hamcounter=1;
        }else if (hamcounter==1){
            tablayout.setVisibility(View.INVISIBLE);
            textView.setVisibility(View.VISIBLE);
            hamcounter=0;
        }
    }
    public static Layout.Alignment ALIGN_CENTER;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.settings) {
            if (counter == 0) {
                settinglayout.setVisibility(View.VISIBLE);
                counter = 1;
            } else if (counter == 1) {
                settinglayout.setVisibility(View.INVISIBLE);
                counter=0;
            }
        }




            return super.onOptionsItemSelected(item);
        }





    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.customtoolbar);
        setTitle("");
        textView=(TextView)findViewById(R.id.textView);
         alignLeft=(ImageView)findViewById(R.id.alignLeft);
         alignCentre=(ImageView)findViewById(R.id.alignCentre);
         alignRight=(ImageView)findViewById(R.id.alignRight);
        alignJustified=(ImageView)findViewById(R.id.alignJustified);
        textView.setText("“Dave, do you want me to drive?”\n" +
                "He blinked several times. “No, I’m okay.”\n" +
                "“Dave, you slept only four hours and twelve minutes last night. That’s insufficient for optimal functioning. A brief nap of twenty minutes would be quite refreshing.”\n" +
                "“I’m okay, dammit. How much longer until we get to… where are we going?”“The townhouse is at 10245 Harbor Trace, where you will meet the prospective buyers, Jim and Aubrey Albritton. They will be about eleven minutes late. You are on the fastest route and will arrive in thirty-two minutes, which includes a twelve-minute slowdown on the I-10.”\n" +
                "“Well, shit.” The Albrittons. He’d showed them at least ten other properties. Early on he judged them a spoiled couple whose idea of a weekend’s entertainment was snooping and complaining. A total waste of time.\n" +
                "Worse, Aubrey Albritton reminded him of Clarisse.\n" +
                "“Dave, I recommend a nap. I know you prefer to drive, but I can take over while you sleep.”\n" +
                "The mid-afternoon sun was in his eyes, and he had to jam on his brakes as the cars ahead slowed. That caused the monster truck riding his bumper to do the same, and its horn blasted his ears. Obviously not driven by a robot, but a pissed-off, sleep-deprived human like himself. He sighed.\n" +
                "“Yeah, I guess so.” He was fighting to keep his eyes open. He had stayed up past three playing in the Delphi Radium, his new top-of-the-line VR media enclosure.\n" +
                "“Is that a yes, Dave? I require a positive command.”\n" +
                "“Yeah, yeah. Sherry, you drive the damned car. Wake me when we’re about five minutes out.”\n" +
                " “Okay. Shall I darken the windows? Would you like some music?”\n" +
                "“Yeah. About halfway. Play that thing from the other day, what’s it… that old jazz thing.”\n" +
                "“Playing Lester Young Trio, the 1994 album.”\n" +
                "“That’s it.” Dave reclined the seat as the windshield slowly darkened. In three minutes, he was asleep.");
       tablayout=(TabHost)findViewById(R.id.tablayout);
        tablayout.setup();
        TabHost.TabSpec spec=tablayout.newTabSpec("Con");
        spec.setContent(R.id.Contents);
        spec.setIndicator("content");
        tablayout.addTab(spec);
        spec=tablayout.newTabSpec("Boo");
        spec.setContent(R.id.Bookmarks);
        spec.setIndicator("Bookmarks");
        tablayout.addTab(spec);
        spec=tablayout.newTabSpec("Not");
        spec.setContent(R.id.Notes);
        spec.setIndicator("Notes");
        tablayout.addTab(spec);


        settinglayout=(ConstraintLayout) findViewById(R.id.settinglayout);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        SeekBar thicknessControl=(SeekBar)findViewById(R.id.thicknessControl);
        thicknessControl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.i("thicknessValue", String.valueOf(progress));
                nthicknessValue= (float) (progress*0.01);
                Log.i("info", String.valueOf(nthicknessValue));
                textView.animate().alpha(nthicknessValue);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        nfont = parent.getSelectedItem().toString();
        switch (nfont) {
            case "curly":
                Typeface typeface1=Typeface.createFromAsset(this.getAssets(),"fonts/Captain Redemption.ttf");
                textView.setTypeface(typeface1);
                return;
            case "bold":
                Typeface typeface2=Typeface.createFromAsset(this.getAssets(),"fonts/Chunkfive Ex.ttf");
                textView.setTypeface(typeface2);
                return;

            case "horror":
                Typeface typeface3=Typeface.createFromAsset(this.getAssets(),"fonts/Spartwell.otf");
                textView.setTypeface(typeface3);
                return;

            case "book":
                Typeface typeface4=Typeface.createFromAsset(this.getAssets(),"fonts/Victorian Art Magic Remains.ttf");
                textView.setTypeface(typeface4);
                return;



            // Log.i("FONT",parent.getSelectedItem().toString());
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
