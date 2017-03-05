package jiajing.inclassassignment05_jiajingc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Intent intent = getIntent();

        //ArrayList<String> name = intent.getStringArrayListExtra("Name List");
        //Student s = (Student) intent.getSerializableExtra("Student Object");

        ArrayList<Student> studentList = (ArrayList<Student>) getIntent().getSerializableExtra("studentList");
        //LinearLayout layout = (LinearLayout) findViewById(R.id.activity_second);

        for (int i = 0; i < studentList.size(); i++) {

            String name = studentList.get(i).getName();
            int age = studentList.get(i).getAge();
            double gpa = studentList.get(i).getGpa();

        TextView nameView = (TextView) findViewById(R.id.name);
        nameView.setText(name);
            //layout.addView(nameView);

        TextView ageView = (TextView) findViewById(R.id.age);
            String age2= Integer.toString(age);
        ageView.setText(age2);
            //layout.addView(ageView);

        TextView gpaView = (TextView) findViewById(R.id.gpa);
            String gpa2= Double.toString(gpa);
        gpaView.setText(gpa2);
            //layout.addView(gpaView);

        /**ArrayList<Student> studentList = (ArrayList<Student>) getIntent().getSerializableExtra("studentList");
        LinearLayout layout = (LinearLayout) findViewById(R.id.activity_second);

        for (int i = 0; i < studentList.size(); i++) {

            String name = studentList.get(i).getName();
            int age = studentList.get(i).getAge();
            double gpa = studentList.get(i).getGpa();
            TextView info = new TextView(this);
            info.setText(name + " " + age + " " + gpa);
            layout.addView(info);*/
        }
    }
}

