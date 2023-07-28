package air.texnodev.lesson_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

import air.texnodev.lesson_2.models.GridModel;

public class Student extends AppCompatActivity {

    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        gridView = findViewById(R.id.grid_item);
        ArrayList<GridModel> gridModels = new ArrayList<GridModel>();
        gridModels.add(new GridModel("Profile", R.drawable.businessman));
        gridModels.add(new GridModel("Events", R.drawable.inspection));
        gridModels.add(new GridModel("Staffs", R.drawable.conference));
        gridModels.add(new GridModel("Attendence", R.drawable.todo_list));
        gridModels.add(new GridModel("ChatBox", R.drawable.comments));
        gridModels.add(new GridModel("GradeSheet", R.drawable.statistics));
        gridModels.add(new GridModel("Gallery", R.drawable.collectibles));
        gridModels.add(new GridModel("Free details", R.drawable.coins));

        Adapter adapter = new Adapter(this, gridModels);
        gridView.setAdapter(adapter);

    }
}