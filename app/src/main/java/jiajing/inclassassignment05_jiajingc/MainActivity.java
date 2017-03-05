package jiajing.inclassassignment05_jiajingc;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentList = new ArrayList<Student>();

    }

    private ArrayList<Student> studentList;
    private Student student;
    private String name;
    private int age;
    private double gpa;

    public void setStudent(){
        EditText editName = (EditText) findViewById(R.id.name);
        name = editName.getText().toString();
        //displayText(name);
    //}

    //public void setAge(View view){
        EditText editAge = (EditText) findViewById(R.id.age);
        String age2 = editAge.getText().toString();
        age = Integer.parseInt(age2);
        //displayText(editAge.getText().toString());
    //}

    //public void setGpa(View view){
        EditText editGpa = (EditText) findViewById(R.id.gpa);
        String Gpa2 = editGpa.getText().toString();
        gpa = Double.parseDouble(Gpa2);
        //displayText(editGpa.getText().toString());
    }

    /**private void displayText(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.textView);
        priceTextView.setText(message);
    }*/

    //boolean checked;

    public void save (View view) {
        //Button button = (Button) view;
        //findViewById(R.id.save);
        //if(checked = true) {
            //Toast t = Toast.makeText(this, "Your profile has been saved", Toast.LENGTH_SHORT);
            //t.show();
        //}
        setStudent();
        student = new Student(name, age, gpa);
        studentList.add(student);
        Toast t = Toast.makeText(this, "Your profile has been saved", Toast.LENGTH_SHORT);
        t.show();

    }

    public void button(View view) {

        //findViewById(R.id.report);
        //if (checked = true) {

            //Intent intent = new Intent(this, SecondActivity.class);
            //Student s = new Student("Alice", 12, 3.0);
            //intent.putExtra("Student Object", s);
            //intent.putExtra("Student Object", studentList);
            //studentList = new ArrayList<>();
            //startActivity(intent);
        //}

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("studentList", studentList);
        //studentList = new ArrayList<>();
        startActivity(intent);
    }
}