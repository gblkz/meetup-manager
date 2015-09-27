package awsmeetupandroid.golipp.com.awsmeetupandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    /**
     * Button to execute Lambda function that posts Meetup event to Facebook.
     * @param v
     */
    public void btnFBClicked(View v) {
        // TODO: 9/10/2015 create button handler.
        // Placeholder toast.
        Toast.makeText(MainActivity.this, "Call Lambda f(x) to post event to Facebook", Toast.LENGTH_SHORT).show();
    }

    /**
     * Button to execute Lambda function that posts Meetup event to Twitter.
     * @param v
     */
    public void btnTwtClicked(View v) {
        // // TODO: 9/26/2015 create button handler.
        // Placeholder toast.
        Toast.makeText(MainActivity.this, "Call Lambda f(x) to post event to Twitter", Toast.LENGTH_SHORT).show();
    }

    /**
     * Button to execute Lambda function that posts Meetup event to Word Press.
     * @param v
     */
    public void btnWPClicked(View v) {
        // // TODO: 9/26/2015 create button handler.
        // Placeholder toast.
        Toast.makeText(MainActivity.this, "Call Lambda f(x) to post event to Word Press", Toast.LENGTH_SHORT).show();
    }
}
