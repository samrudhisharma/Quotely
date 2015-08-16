package quotely.com.quotely;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class Quotely extends Activity {

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotely);
        RelativeLayout touchscreen = (RelativeLayout) findViewById(R.id.touchscreen);
        final TextView quote = (TextView) findViewById(R.id.quote);
        final TextView quoteAuthor = (TextView) findViewById(R.id.personQuote);
        final ArrayList<QuotelyHelper> quoteList = new ArrayList<QuotelyHelper>();

        QuotelyHelper q1 = new QuotelyHelper("Courage is the most important of all the virtues because without courage, you can't practice any other virtue consistently.", "Maya Angelou");
        quoteList.add(q1);
        QuotelyHelper q2 = new QuotelyHelper("It is important to view knowledge as sort of a semantic tree -- make sure you understand the fundamental principles, ie the trunk and big branches, before you get into the leaves/details or there is nothing for them to hang on to.", "Elon Musk");
        quoteList.add(q2);
        QuotelyHelper q3 = new QuotelyHelper("Greatness is not a function of circumstance. Greatness, it turns out, is largely a matter of conscious choice, and discipline.", "James C. Collins");
        quoteList.add(q3);
        //Please add more quotes if needed

        touchscreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count < quoteList.size()) {

                    QuotelyHelper q = quoteList.get(count);

                    quote.setText(q.sendQuote());

                    quoteAuthor.setText(q.sendPerson());

                    count = count + 1;


                } else {

                    count = 0;

                }
            }


        });

    }
}