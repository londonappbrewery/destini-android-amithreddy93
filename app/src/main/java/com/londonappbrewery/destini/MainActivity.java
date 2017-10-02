package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button topanswer;
    Button bottomanswer;
    TextView story;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        topanswer =(Button)findViewById(R.id.buttonTop);
        bottomanswer = (Button)findViewById(R.id.buttonBottom);
        story = (TextView)findViewById(R.id.storyTextView);
        story.setText(R.string.T1_Story);
        topanswer.setText(R.string.T1_Ans1);
        bottomanswer.setText(R.string.T1_Ans2);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topanswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                story.setText(R.string.T3_Story);
                topanswer.setText(R.string.T3_Ans1);
                bottomanswer.setText(R.string.T3_Ans2);
                topanswer.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        story.setText(R.string.T6_End);
                        topanswer.setVisibility(View.INVISIBLE);
                        bottomanswer.setVisibility(View.INVISIBLE);
                    }
                });
                bottomanswer.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        story.setText(R.string.T5_End);
                        topanswer.setVisibility(View.INVISIBLE);
                        bottomanswer.setVisibility(View.INVISIBLE);
                    }
                });
            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomanswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                story.setText(R.string.T2_Story);
                topanswer.setText(R.string.T2_Ans1);
                bottomanswer.setText(R.string.T2_Ans2);
                bottomanswer.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        story.setText(R.string.T4_End);
                        topanswer.setVisibility(View.INVISIBLE);
                        bottomanswer.setVisibility(View.INVISIBLE);

                    }
                });
                topanswer.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        story.setText(R.string.T3_Story);
                        topanswer.setText(R.string.T3_Ans1);
                        bottomanswer.setText(R.string.T3_Ans2);
                        topanswer.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                story.setText(R.string.T6_End);
                                topanswer.setVisibility(View.INVISIBLE);
                                bottomanswer.setVisibility(View.INVISIBLE);
                            }
                        });
                        bottomanswer.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                story.setText(R.string.T5_End);
                                topanswer.setVisibility(View.INVISIBLE);
                                bottomanswer.setVisibility(View.INVISIBLE);
                            }
                        });

                    }
                });

            }
        });


    }
}
