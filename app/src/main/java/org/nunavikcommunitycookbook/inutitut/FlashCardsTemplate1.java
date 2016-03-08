package org.nunavikcommunitycookbook.inutitut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FlashCardsTemplate1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_cards_template1);
    }

    //two variables to keep track of the place in the array. Resettable with resetter method.
    int i = 0;


    //Array for basic syllabics (42 long.)

    String [][] sylabicsFlashCards = new String[][]{
            {"ᐃ", "ᐱ", "ᑎ", "ᑭ", "ᒋ", "ᒥ", "ᓂ", "ᓯ", "ᓕ", "ᔨ", "ᕕ", "ᕆ", "ᕿ", "ᖏ", "ᐅ", "ᐳ",
                    "ᑐ", "ᑯ", "ᒍ", "ᒧ", "ᓄ", "ᓱ", "ᓗ", "ᔪ", "ᕗ", "ᕈ", "ᖁ", "ᖑ", "ᐊ", "ᐸ", "ᑕ",
                    "ᑲ", "ᒐ", "ᒪ", "ᓇ", "ᓴ", "ᓚ", "ᔭ", "ᕙ", "ᕋ", "ᖃ", "ᖓ"},
            {"I", "Pi", "Ti", "Ki", "Gi", "Mi", "Ni", "Si", "Li", "Ji", "Vi", "Ri", "Qi", "Ngi",
                    "U", "Pu", "Tu", "Ku", "Gu", "Mu", "Nu", "Su", "Lu", "Ju", "Vu", "Ru", "Qu",
                    "Ngu","A", "Pa", "Ta", "Ka", "Ga", "Ma", "Na", "Sa", "La", "Ja", "Va", "Ra",
                    "Qa", "Nga"}
    };

    //Sets the large syllabics letter, and the explaniation for the first flashcard template.
    public void flashCardSyl(String main, String explain)
    {
        TextView centerLetter = (TextView) findViewById(R.id.mainLetter);
        centerLetter.setText(main);
        TextView explanation = (TextView) findViewById(R.id.explainer);
        explanation.setText(explain);
        return;

    }

    //goes through the array to display the flashcards
    public void next()
    {
        flashCardSyl("ᐃ", "Ai");

        /*String main = sylabicsFlashCards[i][0];
        String explain = sylabicsFlashCards[i][1];
        flashCardSyl(main, explain);
        if(i < sylabicsFlashCards.length) {
            i++;
        }
        else
        {
            returnToMain();
        }
        return;*/
    }

/* Not used yet

public void resetter()
    {
        i = 0;
        return;

    }*/

    public void returnToMain(){

        startActivity(new Intent(getApplicationContext(), StartScreen.class));
    }

}
