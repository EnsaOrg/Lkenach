package ma.ensa.lkenach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showAllTasks(View view){
        startActivity(new Intent(this, AllTask.class));
    }

    public void showDoneTasks(View view){
        startActivity(new Intent(this, DoneTask.class));
    }

    public void showNotDoneTasks(View view){
        startActivity(new Intent(this, NotDoneTask.class));
    }
}